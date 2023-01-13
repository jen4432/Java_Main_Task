package BuilderFileWriter;

import Interfaces.IFileWriter;

import java.util.ArrayList;

public abstract class FileWriterImpl implements IFileWriter {

    protected String fileName;
    @Override
    public abstract void write(ArrayList<String> data);

    @Override
    public abstract String getFileName();

}
