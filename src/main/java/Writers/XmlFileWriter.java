package Writers;

import BuilderFileWriter.FileWriterImpl;
import Interfaces.IFileReader;
import Interfaces.IFileWriter;
import Readers.XmlFileReader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class XmlFileWriter extends FileWriterImpl {

    public XmlFileWriter(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void write(ArrayList<String> data) {
        try {
        String root = "root";
        DocumentBuilderFactory documentBuilderFactory =DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder =documentBuilderFactory.newDocumentBuilder();

        Document document = documentBuilder.newDocument();

        Element rootElement = document.createElement(root);

        document.appendChild(rootElement);

        for(int i = 0; i < data.size();i++){
            String element ="element";
            Element em = document.createElement(element);
            em.appendChild(document.createTextNode(data.get(i).toString()));
            rootElement.appendChild(em);
        }


            OutputStream fileOutputStream = new FileOutputStream(fileName);
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(fileOutputStream);
            transformer.transform(source, result);
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.toString());
        }

    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
