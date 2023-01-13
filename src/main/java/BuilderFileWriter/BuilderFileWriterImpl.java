package BuilderFileWriter;

import BuilderFileReader.FileExtension;
import Interfaces.IBuilderFileWriter;
import Interfaces.IFileWriter;
import Writers.JsonFileWriter;
import Writers.TxtFileWriter;
import Writers.XmlFileWriter;

public class BuilderFileWriterImpl implements IBuilderFileWriter {

    IFileWriter fileWriter;


    public BuilderFileWriterImpl(String fileName,FileExtension extension){
        if(extension == FileExtension.Txt){
            fileWriter = new TxtFileWriter(fileName);
        }else if(extension == FileExtension.Xml){
            fileWriter = new XmlFileWriter(fileName);
        }else if(extension == FileExtension.Json){
            fileWriter = new JsonFileWriter(fileName);
        }
    }

    @Override
    public void setEncrypt(String key) {

    }

    @Override
    public void setZipping() {

    }

    @Override
    public IFileWriter build() {
        return fileWriter;
    }
}
