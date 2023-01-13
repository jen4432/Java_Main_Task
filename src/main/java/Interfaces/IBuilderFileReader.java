package Interfaces;
import BuilderFileReader.FileReaderImpl;
import BuilderFileReader.FileExtension;

public interface IBuilderFileReader {

    public void setFileName(String name, FileExtension extension);

    public void setEncrypting(String key);

    public void setZipping();
    public IFileReader build();

}
