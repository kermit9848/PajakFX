package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginController implements Initializable{
    @FXML
    public TextField UsernameF;
    @FXML
    public PasswordField passwordF;
    @FXML
    public MenuBar mymenubar;
    @FXML
    private Button loginButton;
    @FXML
    private ImageView exit;
    @FXML
    private MenuItem close;
    @FXML
    private TextArea comment;

    @Override
    public void initialize(URL url, ResourceBundle rb) { }

    Akun Anida = new Akun("anida","1234");
    Akun Wisnu = new Akun("wisnu","2305");
    Akun Reza = new Akun("reza","1476");


    @FXML
    public void LoginButtonOnAction(ActionEvent event) throws IOException {
        if(UsernameF.getText().equals(this.Anida.Username)&&passwordF.getText().equals(this.Anida.password)){
            Parent homePage = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Scene homePageScene = new Scene(homePage);
            Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            homePageStage.hide();
            homePageStage.setScene(homePageScene);
            homePageStage.show();
        }
        else if(UsernameF.getText().equals(this.Wisnu.Username)&&passwordF.getText().equals(this.Wisnu.password)){
            Parent homePage = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Scene homePageScene = new Scene(homePage);
            Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            homePageStage.hide();
            homePageStage.setScene(homePageScene);
            homePageStage.show();
        }
        else if(UsernameF.getText().equals(this.Reza.Username)&&passwordF.getText().equals(this.Reza.password)){
            Parent homePage = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Scene homePageScene = new Scene(homePage);
            Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            homePageStage.hide();
            homePageStage.setScene(homePageScene);
            homePageStage.show();
        }
        else if (UsernameF.getText().isBlank()&&passwordF.getText().isBlank()){
            comment.setPromptText("Anda tidak niat bayar pajak, silakan pulang!");
        }
        else if (UsernameF.getText().isBlank()){
            UsernameF.setPromptText("ISI DAHULU!");
        }
        else if (passwordF.getText().isBlank()){
            passwordF.setPromptText("ISI DAHULU!");
        }
        else{
            comment.setPromptText("PENGISISAN SALAH, ISI YANG BENAR!");
        }
    }

    @FXML
    public void ExitButtonOnAction(MouseEvent event) {
        Stage primarystage = (Stage) exit.getScene().getWindow();
        primarystage.close();
    }

    public void closeButtonAction(ActionEvent event) {
        Stage primarystage = (Stage) mymenubar.getScene().getWindow();
        //Stage primarystage = (Stage) close.getScene().getWindow();
        primarystage.close();
    }

}
