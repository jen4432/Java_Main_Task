package Readers;

import BuilderFileReader.FileReaderImpl;

import java.util.ArrayList;

public class JsonFileReader extends FileReaderImpl {

    public JsonFileReader(String fileName){
        this.fileName = fileName;
    }

    @Override
    public ArrayList<String> read(){
        return null;
    }
}
