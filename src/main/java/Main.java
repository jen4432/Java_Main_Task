import BuilderFileReader.BuilderFileReaderImpl;
import BuilderFileReader.FileReaderImpl;
import Parsers.Calculator;

import java.io.IOException;

import static BuilderFileReader.FileExtension.Txt;
import static BuilderFileReader.FileExtension.Xml;

public class Main {
    public static void main(String[] args) throws IOException {
        BuilderFileReaderImpl builderFileReader = new BuilderFileReaderImpl();
        builderFileReader.setFileName("src/input.xml",Xml);

        FileReaderImpl fileReader = builderFileReader.build();
        System.out.println(fileReader.getClass());

        System.out.println(Calculator.CalculateLines(fileReader.read()));



    }
}