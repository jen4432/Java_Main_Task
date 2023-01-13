package BuilderFileReader;

import Interfaces.IFileReader;

import java.io.IOException;
import java.util.ArrayList;

public abstract class FileReaderImpl implements IFileReader {
    protected String fileName;

    @Override
    public  abstract ArrayList<String> read() throws IOException;

    @Override
    public abstract String getFileName();
}
