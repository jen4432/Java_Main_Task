package Readers;

import BuilderFileReader.FileReaderImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtFileReader extends FileReaderImpl {

    public TxtFileReader(String fileName){
        this.fileName = fileName;
    }

    @Override
    public String getFileName(){
        return fileName;
    }
    @Override
    public ArrayList<String> read() throws IOException {
        BufferedReader br = null;
        ArrayList<String> list = new ArrayList<>();
        try {

            File file = new File(fileName);

            if(!file.exists()){
                System.out.println("File not found");
                file.createNewFile();
            }

            String line;
            br = new BufferedReader(new FileReader(fileName));
            while((line = br.readLine()) != null){
                list.add(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            br.close();
            return list;

        }
    }
}
