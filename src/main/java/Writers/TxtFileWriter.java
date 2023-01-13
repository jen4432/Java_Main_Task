package Writers;

import BuilderFileWriter.FileWriterImpl;
import Interfaces.IFileReader;
import Interfaces.IFileWriter;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TxtFileWriter extends FileWriterImpl {


    public TxtFileWriter(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void write(ArrayList<String> data) {
        try{
            File file = new File(fileName);

            if(!file.exists()) {
                file.createNewFile();
            }

            PrintWriter pr = new PrintWriter(file);
            for(int i = 0;i < data.size(); i++){
                String line = data.get(i);
                pr.println(line);
            }
            pr.close();
        }catch (Exception e) {
            System.out.println("Error : " + e.toString());
        }

    }

    @Override
    public String getFileName() {
        return null;
    }
}
