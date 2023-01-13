package Interfaces;

import BuilderFileReader.FileExtension;

public interface IBuilderFileWriter {


    public void setEncrypt(String key);

    public void setZipping();

    public IFileWriter build();

}
