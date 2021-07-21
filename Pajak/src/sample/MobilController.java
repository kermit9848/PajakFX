package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;





import java.io.IOException;

public class MobilController {

    @FXML
    public MenuBar mymenubar;

    @FXML
    private TextField pkbField;

    @FXML
    private  TextField swkField;

    @FXML
    private TextField bulanField;

    @FXML
    private TextArea hasilArea;

    @FXML
    private Button hitungButton;

    @FXML
    private Button backButton;

    Mobil mobil = new Mobil(0,0,0);


    @FXML
    public void showDataButtonAction(ActionEvent event){
        if(pkbField.getText().isEmpty()||swkField.getText().isEmpty()||bulanField.getText().isEmpty()) {
            hasilArea.setText(" Isi Dahulu");
        }
        else {
            mobil.setPkb(Double.parseDouble(pkbField.getText()));
            mobil.setSwk(Double.parseDouble(swkField.getText()));
            mobil.setBulan(Integer.parseInt(bulanField.getText()));
            hasilArea.setText("Hasil Estimasi Pajak Yang dibayarkan = " + "\n" +mobil.hitung());
        }
    }

    @FXML
    public void backButtonAction(ActionEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene homePageScene = new Scene(homePage);
        Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        homePageStage.hide();
        homePageStage.setScene(homePageScene);
        homePageStage.show();
    }

    public void closeButtonAction(ActionEvent event) {
        Stage primarystage = (Stage) mymenubar.getScene().getWindow();
        //Stage primarystage = (Stage) close.getScene().getWindow();
        primarystage.close();
    }
//436 706

}