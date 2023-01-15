import Readers.TxtFileReader;
import Readers.XmlFileReader;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadersTest {
    ArrayList<String> expected = new ArrayList<>(Arrays.asList("3-4+2","100-10","20/0"));

    @Test
    public void TxtFileReaderTest(){
        TxtFileReader txtFileReader = new TxtFileReader("src/TestingFiles/TestInputTxt.txt");
        try {
            ArrayList<String> actual = txtFileReader.read();
            assertEquals(expected,actual);

        } catch (Exception e) {
            System.out.println("Error at TxtFileReaderTest : " + e.toString());
        }
    }

    @Test
    public void XmlFileReaderTest(){
        XmlFileReader xmlFileReader = new XmlFileReader("src/TestingFiles/TestInputXml.xml");
        ArrayList<String> actual = xmlFileReader.read();
        System.out.println(actual);
        System.out.println(expected);
        assertEquals(expected,actual);
    }

    @Test
    public void JsonFileReaderTest(){

    }
}
