import BuilderFileReader.BuilderFileReaderImpl;
import BuilderFileReader.FileReaderImpl;
import Parsers.Calculator;

import java.io.IOException;

import static BuilderFileReader.FileExtension.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BuilderFileReaderImpl builderFileReader = new BuilderFileReaderImpl();
        builderFileReader.setFileName("src/input.json",Json);

        FileReaderImpl fileReader = builderFileReader.build();
        System.out.println(fileReader.getClass());

        System.out.println(Calculator.CalculateLines(fileReader.read()));

    }
}