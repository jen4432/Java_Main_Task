package Readers;

import BuilderFileReader.FileReaderImpl;
import Interfaces.IFileReader;

import java.io.IOException;
import java.util.ArrayList;

public class EncryptedFileReader implements IFileReader{
    protected IFileReader fileReader;

    public EncryptedFileReader(IFileReader fileReader){
        this.fileReader = fileReader;
    }

    @Override
    public ArrayList<String> read() throws IOException {
        return fileReader.read();
    }

    @Override
    public String getFileName() {
        return fileReader.getFileName();
    }
}
