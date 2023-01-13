package BuilderFileReader;
import Interfaces.IBuilderFileReader;
import Interfaces.IFileReader;
import Readers.*;

public class BuilderFileReaderImpl implements IBuilderFileReader {

    private IFileReader fileReader;

    public BuilderFileReaderImpl(String name,FileExtension extension){
        if(extension == FileExtension.Txt){
            fileReader = new TxtFileReader(name);
        }else if(extension == FileExtension.Json){
            fileReader = new JsonFileReader(name);
        }else if(extension == FileExtension.Xml) {
            fileReader = new XmlFileReader(name);
        }
    }

    @Override
    public void setEncrypting(String key) {
        fileReader = new EncryptedFileReader(fileReader,key);
    }

    @Override
    public void setZipping() {
        fileReader = new ZippingFileReader(fileReader);
    }

    @Override
    public IFileReader build() {
        return fileReader;
    }
}
