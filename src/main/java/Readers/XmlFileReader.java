package Readers;

import BuilderFileReader.FileReaderImpl;

import java.util.ArrayList;

public class XmlFileReader extends FileReaderImpl {

    public XmlFileReader(String fileName){
        this.fileName = fileName;
    }

    @Override
    public ArrayList<String> read(){
        return null;
    }
}
