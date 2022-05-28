package lapr4.grammar.form.compiler;

import lapr4.grammar.form.domain.Question;
import lapr4.grammar.form.domain.Section;
import lapr4.grammar.form.domain.StaticForm;
import lapr4.grammar.form.shared.Types;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Compiler {
    private String homeDir;
    private static final String SCRIPT_EXTENSION = "fvs";

    public Compiler(String homeDir) {
        this.homeDir = homeDir;
    }


    public void compile(StaticForm<Question> questionForm, boolean autoGenerate, String formName, String formExtension) throws IOException {
        File f = new File(homeDir);

        if (!f.exists()) {
            f.mkdirs();
        }

        try {
            JSONObject compiledForm = compileForm(questionForm);


            try (PrintWriter pw = new PrintWriter(new FileWriter(String.format("%s/%s.%s", f.getAbsolutePath(), formName, formExtension)), true)) {
                compiledForm.writeJSONString(pw);
            }


        } catch (ParseException e) {
            throw new IOException(e);
        }

        if (autoGenerate) {
            String script = generateScript(questionForm,formName);
            try (PrintWriter pw = new PrintWriter(new FileWriter(String.format("%s/%s.%s", f.getAbsolutePath(), formName, SCRIPT_EXTENSION)), true)) {
                pw.println(script);
            }
        }

    }

    private String generateScript(StaticForm<Question> questionForm, String formName) {
        StringBuilder sb = new StringBuilder();
        sb.append("#include ").append(formName).append("\n\n");
        StringBuilder vars = new StringBuilder();
        StringBuilder objects = new StringBuilder();
        int indexQ = 1, indexS = 1;

        for (Section<Question> s : questionForm) {
            objects.append("S");
            if (s.isOptional()) {
                objects.append("x");
            }
            objects.append("<-{").append(indexS).append("}\n");
            for (Question q : s) {
                objects.append("Q");
                if (q.isOptional()) {
                    objects.append("x");
                }
                objects.append("<-{");
                objects.append(indexS).append(",").append(indexQ).append(",");
                operate(q, objects, vars);
                objects.append("}\n");
                indexQ++;
            }
            indexS++;
        }
        sb.append(vars).append("\n\n").append(objects);
        return sb.toString();
    }

    private void operate(Question q, StringBuilder objects, StringBuilder vars) {
        switch (q.getConfig().validation) {
            case TEXT:
                String[] splt = new String[0];
                try {
                    splt = q.getConfig().value.split(";");
                } catch (NullPointerException e) {
                    objects.append("text()");
                    break;
                }
                if (splt.length > 1) {
                String [] nms = new String[2];
                nms[0] = String.format("%s%s", q.getDescription(), "NumCharLine");
                nms[1] = String.format("%s%s", q.getDescription(), "NumLines");
                vars.append(nms[0]).append("<-").append(splt[0]).append("\n");
                vars.append(nms[1]).append("<-").append(splt[1]);
                objects.append("text(").append(nms[0]).append(",").append(nms[1]).append(")");
            } else {
                vars.append(q.getDescription()).append("<-").append(q.getConfig().value);
                objects.append("text(").append(q.getDescription()).append(")");
            }
            vars.append("\n");
            break;
            case SORT:
                vars.append(q.getDescription()).append("<-").append(q.getConfig().value);
                objects.append("sort(").append(q.getDescription()).append(")");
                vars.append("\n");
                break;
            case SCALE:
                splt = q.getConfig().value.split(";");
                String[] nms = new String[2];
                nms[0] = String.format("%s%s", q.getDescription(), "Int");
                nms[1] = String.format("%s%s", q.getDescription(), "Opt");
                vars.append(nms[0]).append("<-").append(splt[0]).append("\n");
                vars.append(nms[1]).append("<-").append(splt[1]);
                objects.append("scale(").append(nms[0]).append(",").append(nms[1]).append(")");
                vars.append("\n");
                break;
            case IS_INT:
                objects.append("isInt()");
                break;
            case IS_NUMERIC:
                objects.append("isNumeric()");
                break;
            case SINGLE_CHOICE:
                vars.append(q.getDescription()).append("<-").append(q.getConfig().value);
                objects.append("singleChoice(").append(q.getDescription()).append(")");
                vars.append("\n");
                break;
            case MULTIPLE_CHOICE:
                splt = q.getConfig().value.split(";");
                if (splt.length > 1) {
                    nms = new String[2];
                    nms[0] = String.format("%s%s", q.getDescription(), "Opt");
                    nms[1] = String.format("%s%s", q.getDescription(), "Int");
                    vars.append(nms[0]).append("<-").append(splt[0]).append("\n");
                    vars.append(nms[1]).append("<-").append(splt[1]);
                    objects.append("multipleChoice(").append(nms[0]).append(",").append(nms[1]).append(")");
                } else {
                    vars.append(q.getDescription()).append("<-").append(q.getConfig().value);
                    objects.append("multipleChoice(").append(q.getDescription()).append(")");
                }
                vars.append("\n");
                break;
            case SINGLE_CHOICE_T:
                vars.append(q.getDescription()).append("<-").append(q.getConfig().value);
                objects.append("singleChoiceT(").append(q.getDescription()).append(")");
                vars.append("\n");
                break;

            case MULTIPLE_CHOICE_T:
                splt = q.getConfig().value.split(";");
                if (splt.length > 1) {
                    nms = new String[2];
                    nms[0] = String.format("%s%s", q.getDescription(), "Int");
                    nms[1] = String.format("%s%s", q.getDescription(), "Opt");
                    vars.append(nms[0]).append("<-").append(splt[0]).append("\n");
                    vars.append(nms[1]).append("<-").append(splt[1]);
                    objects.append("multipleChoiceT(").append(nms[0]).append(",").append(nms[1]).append(")");
                } else {
                    vars.append(q.getDescription()).append("<-").append(q.getConfig().value);
                    objects.append("multipleChoiceT(").append(q.getDescription()).append(")");
                }
                vars.append("\n");
                break;
        }

    }

    public JSONObject compileForm(StaticForm<Question> questionForm) throws ParseException {
        JSONObject root = new JSONObject();
        JSONArray sections = new JSONArray();
        int index = 1;
        Integer indexQ = 1;
        for (Section<Question> section : questionForm) {
            section(section, sections, index, indexQ);
            index++;
        }
        root.put("sections", sections);
        return root;
    }

    private void section(Section<Question> section, JSONArray sections, int index, Integer indexQ) {
        JSONObject sectionJSON = new JSONObject();
        sectionJSON.put("index", index);
        sectionJSON.put("optional", section.isOptional());
        JSONArray questions = new JSONArray();
        for (Question q : section) {
            question(q, questions, indexQ);
            indexQ++;
        }
        sectionJSON.put("questions", questions);
        sections.add(sectionJSON);
    }

    private void question(Question q, JSONArray questions, Integer indexQ) {
        JSONObject questionJSON = new JSONObject();
        questionJSON.put("index", indexQ);
        questionJSON.put("id", q.getId());
        questionJSON.put("optional", q.isOptional());
        questionJSON.put("validation", q.getConfig().validation.name());
        questions.add(questionJSON);
    }





    /*
{
  "sections": [
    {
      "index": 1,
      "optional": false,
      "questions": [
        {
          "index": 1,
          "id": "XYZ",
          "optional": false,
          "validation": "TEXT"
        },
        {
          "index": 2,
          "id": "XZY",
          "optional": false,
          "validation": "IS_INT"
        }
      ]
    }
  ]
}
*/


}
