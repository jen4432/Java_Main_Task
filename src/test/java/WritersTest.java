import Readers.JsonFileReader;
import Readers.TxtFileReader;
import Readers.XmlFileReader;
import Writers.JsonFileWriter;
import Writers.TxtFileWriter;
import Writers.XmlFileWriter;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class WritersTest {
    ArrayList<String> expected = new ArrayList<String>(Arrays.asList("0.0","12","14"));

    @Test
    public void TxtWriteTest() throws IOException {
        TxtFileWriter txtFileWriter = new TxtFileWriter("src/TestingFiles/TestOutputTxt.txt");
        txtFileWriter.write(expected);
        TxtFileReader txtFileReader = new TxtFileReader("src/TestingFiles/TestOutputTxt.txt");
        ArrayList<String> actual = txtFileReader.read();
        assertEquals(expected,actual);
    }

    @Test
    public void XmlWriteTest(){
        XmlFileWriter xmlFileWriter = new XmlFileWriter("src/TestingFiles/TestOutputXml.xml");
        xmlFileWriter.write(expected);
        XmlFileReader xmlFileReader = new XmlFileReader("src/TestingFiles/TestOutputXml.xml");
        ArrayList<String> actual = xmlFileReader.read();
        assertEquals(expected,actual);
    }

}
