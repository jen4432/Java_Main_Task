package Writers;

import BuilderFileWriter.FileWriterImpl;
import Interfaces.IFileWriter;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JsonFileWriter extends FileWriterImpl {

    public JsonFileWriter(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void write(ArrayList<String> data) {
        JSONObject jsonObject = new JSONObject();
        for(int i = 0;i < data.size();i++){
            jsonObject.put("result" + Integer.toString(i + 1),data.get(i));
        }
        JSONObject employObject = new JSONObject();
        employObject.put("results",jsonObject);
        try (FileWriter file = new FileWriter(fileName)) {
            file.write(employObject.toJSONString());
            file.flush();

        } catch (Exception e) {
            System.out.println("Error : " + e.toString());
        }

    }

    @Override
    public String getFileName() {
        return null;
    }
}
