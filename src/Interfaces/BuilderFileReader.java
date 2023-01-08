package Interfaces;
import BuilderFileReader.FileReader;
import BuilderFileReader.FileExtension;

public interface BuilderFileReader {

    public void setFileName(String name, FileExtension extension);

    public void setEncrypting(String key);

    public void setZipping(boolean isZip);
    public FileReader build();

}
