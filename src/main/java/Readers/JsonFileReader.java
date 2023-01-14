package Readers;

import BuilderFileReader.FileReaderImpl;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.ArrayList;

public class JsonFileReader extends FileReaderImpl {

    private static final String TAG_EXPRESSIONS = "expressions";
    private static final String TAG_EXPRESSION = "expression";

    public JsonFileReader(String fileName){
        this.fileName = fileName;
    }

    @Override
    public String getFileName(){
        return fileName;
    }

    @Override
    public ArrayList<String> read(){

        JSONParser parser = new JSONParser();

        ArrayList<String> result = new ArrayList<String>();

        try (FileReader fileReader = new FileReader(fileName)) {

            JSONObject root = (JSONObject)parser.parse(fileReader);

            JSONArray array = (JSONArray) root.get(TAG_EXPRESSIONS);

            for(Object iterator : array){
                JSONObject expression = (JSONObject) iterator;
                result.add((String) expression.get(TAG_EXPRESSION));
            }

        } catch (Exception e) {
            System.out.println("Parsing error : " + e.toString());
        }
        return result;
    }
}
