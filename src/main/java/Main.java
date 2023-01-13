import Archiver.ArchivingFileManager;
import BuilderFileReader.BuilderFileReaderImpl;
import BuilderFileReader.FileReaderImpl;
import Cipher.Crypto;
import Interfaces.IFileReader;

import java.io.IOException;

import static BuilderFileReader.FileExtension.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Crypto.encrypt("abc","decrypted.txt","decrypted.txt");


        BuilderFileReaderImpl builderFileReader = new BuilderFileReaderImpl();
        builderFileReader.setFileName("src/TestingFiles/testziping.txt",Txt);
        builderFileReader.setEncrypting("abc");
        IFileReader fileReader = builderFileReader.build();
        System.out.println(fileReader.read());

    }
}