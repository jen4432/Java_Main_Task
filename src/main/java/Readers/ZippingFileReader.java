package Readers;

import Archiver.ArchivingFileManager;
import Interfaces.IFileReader;

import java.io.IOException;
import java.util.ArrayList;

public class ZippingFileReader implements IFileReader {

    private IFileReader fileReader;

    public ZippingFileReader(IFileReader fileReader){
        this.fileReader = fileReader;
    }
    @Override
    public ArrayList<String> read() throws IOException {
        ArchivingFileManager.unZippingFile(ArchivingFileManager.createNameZipFile(fileReader.getFileName()));
        return fileReader.read();
    }

    @Override
    public String getFileName() {
        return fileReader.getFileName();
    }
}
