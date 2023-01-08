package BuilderFileReader;
import Interfaces.BuilderFileReader;
import Readers.JsonFileReader;
import Readers.TxtFileReader;
import Readers.XmlFileReader;

public class BuilderFileReaderImpl implements BuilderFileReader {

    private FileReader fileReader;

    public BuilderFileReaderImpl(){

    }
    @Override
    public void setFileName(String name,FileExtension extension) {
        fileReader.name = name;
        if(extension == FileExtension.Txt){
            fileReader = new TxtFileReader();
        }else if(extension == FileExtension.Json){
            fileReader = new JsonFileReader();
        }else if(extension == FileExtension.Xml) {
            fileReader = new XmlFileReader();
        }
    }

    @Override
    public void setEncrypting(String key) {

    }

    @Override
    public void setZipping(boolean isZip) {
    }

    @Override
    public FileReader build() {
        return fileReader;
    }
}
