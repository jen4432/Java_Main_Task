import BuilderFileReader.BuilderFileReaderImpl;
import BuilderFileReader.FileReaderImpl;
import Cipher.Crypto;

import java.io.IOException;

import static BuilderFileReader.FileExtension.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/output.json";
        String outputFileName = "src/output.txt";

        Crypto.encrypt("abc",inputFileName,outputFileName);

    }
}