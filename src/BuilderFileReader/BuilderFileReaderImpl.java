package BuilderFileReader;
import Interfaces.BuilderFileReader;
import Readers.JsonFileReader;
import Readers.TxtFileReader;
import Readers.XmlFileReader;

public class BuilderFileReaderImpl implements BuilderFileReader {

    private FileReaderImpl fileReader;

    public BuilderFileReaderImpl(){

    }
    @Override
    public void setFileName(String name,FileExtension extension) {
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

    }

    @Override
    public void setZipping(boolean isZip) {
    }

    @Override
    public FileReaderImpl build() {
        return fileReader;
    }
}
