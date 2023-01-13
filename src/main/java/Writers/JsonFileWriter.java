package Writers;

import BuilderFileWriter.FileWriterImpl;
import Interfaces.IFileWriter;

import java.util.ArrayList;

public class JsonFileWriter extends FileWriterImpl {

    public JsonFileWriter(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void write(ArrayList<String> data) {

    }

    @Override
    public String getFileName() {
        return null;
    }
}
