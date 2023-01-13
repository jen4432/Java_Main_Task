import Archiver.ArchivingFileManager;
import BuilderFileReader.BuilderFileReaderImpl;
import BuilderFileReader.FileReaderImpl;
import BuilderFileWriter.BuilderFileWriterImpl;
import Cipher.Crypto;
import Interfaces.IFileReader;
import Interfaces.IFileWriter;
import Writers.XmlFileWriter;

import java.io.IOException;

import static BuilderFileReader.FileExtension.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*Crypto.encrypt("abc","src/TestingFiles/input.txt","src/TestingFiles/input.txt");
        Crypto.encrypt("bca","src/TestingFiles/input.txt","src/TestingFiles/input.txt");
        ArchivingFileManager.zippingFile("src/TestingFiles/input.txt");*/

        /*BuilderFileReaderImpl builderFileReader = new BuilderFileReaderImpl("src/TestingFiles/input.txt",Txt);
        builderFileReader.setEncrypting("abc");
        builderFileReader.setEncrypting("bca");
        builderFileReader.setZipping();
        IFileReader fileReader = builderFileReader.build();
        System.out.println(fileReader.read());*/

        BuilderFileReaderImpl builderFileReader = new BuilderFileReaderImpl("src/TestingFiles/input.txt",Txt);

        IFileReader fileReader = builderFileReader.build();

        BuilderFileWriterImpl builderFileWriter = new BuilderFileWriterImpl("src/TestingFiles/output.xml", Xml);

        IFileWriter fileWriter = builderFileWriter.build();

        fileWriter.write(fileReader.read());
    }
}