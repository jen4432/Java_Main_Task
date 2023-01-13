package Interfaces;

import java.io.IOException;
import java.util.ArrayList;

public interface IFileReader {
    public ArrayList<String> read() throws IOException;

    public String getFileName();

}
