package Readers;

import BuilderFileReader.FileReaderImpl;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class XmlFileReader extends FileReaderImpl {

    private static final String TAG_ELEMENT = "element";

    public XmlFileReader(String fileName){
        this.fileName = fileName;
    }

    @Override
    public String getFileName(){
        return fileName;
    }
    @Override
    public ArrayList<String> read(){
        File file = new File(fileName);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        ArrayList<String> list = new ArrayList<String>();
        try{
            doc = dbf.newDocumentBuilder().parse(file);
            NodeList nodeList = doc.getElementsByTagName(TAG_ELEMENT);
            for(int i = 0; i < nodeList.getLength();i++){
                list.add(nodeList.item(i).getTextContent());
            }

        }catch (Exception e){
            System.out.println("Error:" + e.toString());
        }
        return list;
    }
}
