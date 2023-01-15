import Readers.TxtFileReader;
import Writers.TxtFileWriter;
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
}
