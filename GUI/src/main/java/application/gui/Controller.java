package application.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

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

    @FXML
    void initialize(){
        inputFileName.setOn
    }

}