package edu.icet.sms.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;


@NoArgsConstructor
public class LoginFormController extends Component {

    private Stage currentStage;
    private Stage stage = new Stage();

    public LoginFormController(Stage stage) throws IOException {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login-screen.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    private Button btn_cancel;

    @FXML
    private Button btn_login;

    @FXML
    private PasswordField txt_pswd;

    @FXML
    private TextField txt_uname;

    @FXML
    void btnLoginAction(ActionEvent event) {
        if(txt_uname.getText().equals("admin") && txt_pswd.getText().equals("123")){
            new RegistrationFormContoller(stage);
            currentStage = (Stage) btn_login.getScene().getWindow();
            currentStage.close();
        }
        else {
            String msg = (txt_uname.getText().isEmpty() || txt_pswd.getText().isEmpty()) ? "Input Null" :(!txt_uname.getText().equals("admin") && !txt_pswd.getText().equals("123")) ? "Invalid Username & Password" : (!txt_uname.getText().equals("admin")) ? "Invalid Username" : "Invalid Password";
            JOptionPane.showMessageDialog(getParent(), msg);
            txt_uname.setText("");
            txt_pswd.setText("");
        }
    }

    @FXML
    void btn_cancelAction(ActionEvent event) {
        currentStage = (Stage) btn_cancel.getScene().getWindow();
        currentStage.close();
    }

}
