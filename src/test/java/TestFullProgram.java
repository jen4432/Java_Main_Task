import BuilderFileReader.BuilderFileReaderImpl;
import BuilderFileReader.FileExtension;
import BuilderFileWriter.BuilderFileWriterImpl;
import Interfaces.IFileReader;
import Interfaces.IFileWriter;
import Parsers.Calculator;
import Readers.TxtFileReader;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class TestFullProgram {
    ArrayList<String> expected = new ArrayList<>(Arrays.asList("1.0","90.0","Division by zero!"));

    @Test
    public void TestInputTxt() throws IOException {
        BuilderFileReaderImpl builderFileReader = new BuilderFileReaderImpl("src/TestingFiles/TestInputTxt.txt", FileExtension.Txt);
        IFileReader fileReader = builderFileReader.build();
        BuilderFileWriterImpl builderFileWriter = new BuilderFileWriterImpl("src/TestingFiles/TestOutputTxt.txt",FileExtension.Txt);
        IFileWriter writer = builderFileWriter.build();
        writer.write(Calculator.CalculateLines(fileReader.read()));

        TxtFileReader txtFileReader = new TxtFileReader("src/TestingFiles/TestOutputTxt.txt");
        ArrayList<String> actual = txtFileReader.read();

        assertEquals(expected,actual);
    }

    @Test
    public void TestInputXml() throws IOException {
        BuilderFileReaderImpl builderFileReader = new BuilderFileReaderImpl("src/TestingFiles/TestInputXml.xml", FileExtension.Xml);
        IFileReader fileReader = builderFileReader.build();
        BuilderFileWriterImpl builderFileWriter = new BuilderFileWriterImpl("src/TestingFiles/TestOutputXml.Txt",FileExtension.Txt);
        IFileWriter writer = builderFileWriter.build();
        writer.write(Calculator.CalculateLines(fileReader.read()));

        TxtFileReader txtFileReader = new TxtFileReader("src/TestingFiles/TestOutputTxt.txt");
        ArrayList<String> actual = txtFileReader.read();

        assertEquals(expected,actual);
    }
}
