package Interfaces;

import BuilderFileReader.FileExtension;

public interface IBuilderFileWriter {

    public void setFileName(String fileName, FileExtension extension);

    public void setEncrypt(String key);

    public void setZipping();

}
