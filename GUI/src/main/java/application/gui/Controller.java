package application.gui;

import BuilderFileReader.BuilderFileReaderImpl;
import BuilderFileWriter.BuilderFileWriterImpl;
import Interfaces.IFileReader;
import Interfaces.IFileWriter;
import Parsers.Calculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import BuilderFileReader.FileExtension;

import java.io.IOException;
import java.util.ArrayList;

import static BuilderFileReader.FileExtension.*;

public class Controller {

    @FXML
    private ToggleGroup Format;

    @FXML
    private ToggleGroup OutputFormat;

    @FXML
    private CheckBox chekEncrypted;

    @FXML
    private TextField inputFileName;

    @FXML
    private RadioButton inputJsonFormat;

    @FXML
    private RadioButton inputTxtFormat;

    @FXML
    private RadioButton inputXmlFormat;

    @FXML
    private CheckBox inputZipping;

    @FXML
    private TextField keysEncrypting;

    @FXML
    private TextField outputFileName;

    @FXML
    private RadioButton outputJsonFormat;

    @FXML
    private RadioButton outputTxtFormat;

    @FXML
    private RadioButton outputXmlFormat;

    @FXML
    private Button startButton;

    public void inputFile(ActionEvent actionEvent){
        String inputFileName_ = inputFileName.getText();

        String key = keysEncrypting.getText();

        boolean isZipping  = inputZipping.isSelected();

        FileExtension extension = null;

        if(inputTxtFormat.isSelected()){
            extension = Txt;
        }else if(inputJsonFormat.isSelected()){
            extension = Json;
        } else if (inputXmlFormat.isSelected()) {
            extension = Xml;
        }

        BuilderFileReaderImpl builderFileReader = new BuilderFileReaderImpl(inputFileName_,extension);

        if(key != null){
            String[] keys = key.split(",");
            for(int i = 0;i < keys.length;i++){
                builderFileReader.setEncrypting(keys[i]);
            }
        }
        if(isZipping){
            builderFileReader.setZipping();
        }

        IFileReader fileReader = builderFileReader.build();
    }

    public void calc(IFileReader fileReader) throws IOException {
        ArrayList<String> expressions = fileReader.read();

        ArrayList<String> result = Calculator.CalculateLines(expressions);

        String fileOutputName = outputFileName.getText();

        FileExtension extension = null;

        if(outputTxtFormat.isSelected()){
            extension = Txt;
        } else if (outputJsonFormat.isSelected()) {
            extension = Json;
        } else if (outputXmlFormat.isSelected()) {
            extension = Xml;
        }

        BuilderFileWriterImpl builderFileWriter = new BuilderFileWriterImpl(fileOutputName,extension);

        IFileWriter fileWriter = builderFileWriter.build();

        fileWriter.write(result);
    }

}