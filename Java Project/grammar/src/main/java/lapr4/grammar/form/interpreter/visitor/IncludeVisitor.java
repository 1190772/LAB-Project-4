package lapr4.grammar.form.interpreter.visitor;

import lapr4.grammar.antlr.ValidatorParser;
import lapr4.grammar.form.interpreter.Enviroment;
import lapr4.grammar.form.interpreter.abstraction.QuestionAbstraction;
import lapr4.grammar.form.interpreter.memory.MemoryFrame;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class IncludeVisitor extends MainVisitor<Integer>{
    
    public IncludeVisitor(MemoryFrame frame, Enviroment enviroment) {
        super(frame, enviroment);
    }



    @Override
    public Integer visitInclude(ValidatorParser.IncludeContext ctx) {
        JSONParser p = new JSONParser();
        try {
            JSONObject root = ((JSONObject) p.parse(new FileReader(String.format("%s/%s.%s",enviroment.getHomeDir(),ctx.formName.getText(),enviroment.getCompiledFormException()))));
            JSONArray sections = ((JSONArray) root.get("sections"));
            for (Object section : sections) {
                JSONObject sectionJSON = ((JSONObject) section);
                List<QuestionAbstraction> questions= loadQuestion(((JSONArray) sectionJSON.get("questions")));
                frame.putSection(Integer.parseInt(sectionJSON.get("index").toString()),Boolean.parseBoolean(sectionJSON.get("optional").toString()),questions);
            }
        } catch (IOException | ParseException e) {
            return 1;
        }
        return 0;
    }

    private List<QuestionAbstraction> loadQuestion(JSONArray questions) {
        List<QuestionAbstraction> result = new LinkedList<>();
        for (Object q : questions) {
            JSONObject qJSON = ((JSONObject) q );
            QuestionAbstraction qAbs = new QuestionAbstraction(Integer.parseInt(qJSON.get("index").toString()),Boolean.parseBoolean(qJSON.get("optional").toString()),qJSON.get("id").toString(),qJSON.get("validation").toString())
            result.add(qAbs);
        }
        return result;
    }
}
