package Readers;

import BuilderFileReader.FileReaderImpl;
import Cipher.Crypto;
import Interfaces.IFileReader;

import java.io.IOException;
import java.util.ArrayList;

public class EncryptedFileReader implements IFileReader{
    protected IFileReader fileReader;
    String key;

    public EncryptedFileReader(IFileReader fileReader,String key){
        this.fileReader = fileReader;
        this.key = key;
    }

    @Override
    public ArrayList<String> read() throws IOException {
        Crypto.decrypt(key,fileReader.getFileName(),fileReader.getFileName());
        return fileReader.read();
    }

    @Override
    public String getFileName() {
        return fileReader.getFileName();
    }
}
