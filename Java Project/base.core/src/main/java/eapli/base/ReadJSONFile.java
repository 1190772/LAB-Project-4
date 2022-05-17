/*package eapli.base.application;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

public class ReadJSONFile {
    private String path;
    private JSONParser parser;

    public void JsonReader(String path) {
        this.path = path;
        parser=new JSONParser();
    }

    public JSONObject read() throws IOException, org.json.simple.parser.ParseException {
        try (FileReader fr = new FileReader(path)) {
            return (JSONObject) parser.parse(fr);
        }
    }
}
*/