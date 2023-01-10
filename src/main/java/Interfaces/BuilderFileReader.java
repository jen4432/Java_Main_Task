package Interfaces;
import BuilderFileReader.FileReaderImpl;
import BuilderFileReader.FileExtension;

public interface BuilderFileReader {

    public void setFileName(String name, FileExtension extension);

    public void setEncrypting(String key);

    public void setZipping(boolean isZip);
    public FileReaderImpl build();

}
