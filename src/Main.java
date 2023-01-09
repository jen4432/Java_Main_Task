import BuilderFileReader.BuilderFileReaderImpl;
import BuilderFileReader.FileReaderImpl;
import Readers.JsonFileReader;

import java.io.IOException;

import static BuilderFileReader.FileExtension.Txt;

public class Main {
    public static void main(String[] args) throws IOException {
        BuilderFileReaderImpl builderFileReader = new BuilderFileReaderImpl();
        builderFileReader.setFileName("src/test.txt",Txt);
        FileReaderImpl fileReader = builderFileReader.build();
        System.out.println(fileReader.getClass());
        fileReader.read();
    }
}