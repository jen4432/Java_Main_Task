import BuilderFileReader.BuilderFileReaderImpl;
import BuilderFileReader.FileReaderImpl;
import Cipher.Crypto;

import java.io.IOException;

import static BuilderFileReader.FileExtension.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/output.txt";
        String outputFileName = "src/result.txt";

        Crypto.decrypt("abc","src/output.txt",outputFileName);

    }
}