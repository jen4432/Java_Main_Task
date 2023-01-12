import Archiver.ArchivingFileManager;
import BuilderFileReader.BuilderFileReaderImpl;
import BuilderFileReader.FileReaderImpl;
import Cipher.Crypto;

import java.io.IOException;

import static BuilderFileReader.FileExtension.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArchivingFileManager.zippingFile("src/TestingFiles/testziping.txt");

    }
}