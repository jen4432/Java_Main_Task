package BuilderFileReader;

import Interfaces.IFileReader;

import java.io.IOException;
import java.util.ArrayList;

public abstract class FileReaderImpl implements IFileReader {
    protected String fileName;

    protected FileExtension extension;

    protected boolean isZipping;

    protected boolean isEncrypted;

    @Override
    public  abstract ArrayList<String> read() throws IOException;

    @Override
    public abstract String getFileName();

    public boolean isZipping(){
        return isZipping;
    }

    public boolean isEncrypted(){
        return isEncrypted;
    }
}
