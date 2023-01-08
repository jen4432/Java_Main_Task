import BuilderFileReader.BuilderFileReaderImpl;
import BuilderFileReader.FileReader;
import Readers.JsonFileReader;

import static BuilderFileReader.FileExtension.Txt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BuilderFileReaderImpl builderFileReader = new BuilderFileReaderImpl();
        builderFileReader.setFileName("abc",Txt);
        builderFileReader.setEncrypting("a");
        builderFileReader.setZipping(true);

        JsonFileReader jsonFileReader = new JsonFileReader();

        //FileReader fileReader = builderFileReader.build();

        //System.out.println(fileReader.getClass());

    }
}