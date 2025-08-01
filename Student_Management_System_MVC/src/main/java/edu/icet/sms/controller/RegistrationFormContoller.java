package edu.icet.sms.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.NoArgsConstructor;
import edu.icet.sms.model.CollectionStu;
import edu.icet.sms.model.Student;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

@NoArgsConstructor
public class RegistrationFormContoller extends Component {

    private Stage currentStage;
    private Stage stage = new Stage();

    public RegistrationFormContoller(Stage stage) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/registration-form.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    private Button btn_reset;

    @FXML
    private Button btn_submit;

    @FXML
    private Button btn_logout;

    @FXML
    private Button btn_viewSummary;

    @FXML
    private CheckBox chk_F;

    @FXML
    private CheckBox chk_M;

    @FXML
    private TextField txt_course;

    @FXML
    private TextField txt_email;

    @FXML
    private TextField txt_name;

    @FXML
    void addStuDetails(ActionEvent event) {
        String gender = (chk_F.isSelected()) ? "F" : (chk_M.isSelected()) ? "M" : null;

        if(txt_name.getText().isEmpty() || txt_email.getText().isEmpty() || txt_course.getText().isEmpty() || gender == null){
            JOptionPane.showMessageDialog(getParent(), "Fields cannot be empty!");
        }
        else{
            CollectionStu.addStudent(new Student(txt_name.getText(), txt_email.getText(), gender, txt_course.getText()));
            clearForm();
        }
    }

    @FXML
    void logoutAction(ActionEvent event) throws IOException {
        new LoginFormController(stage);
        currentStage = (Stage) btn_logout.getScene().getWindow();
        currentStage.close();
    }

    @FXML
    void viewSummaryAction(ActionEvent event) {
        new SummaryFormController(stage);
        currentStage = (Stage) btn_viewSummary.getScene().getWindow();
        currentStage.close();
    }

    @FXML
    void resetRegForm(ActionEvent event) {
        clearForm();
    }

    @FXML
    void selectFemale(ActionEvent event) {
        chk_M.setSelected(false);
    }

    @FXML
    void selectMale(ActionEvent event) {
        chk_F.setSelected(false);
    }

    private void clearForm() {
        txt_name.setText("");
        txt_email.setText("");
        txt_course.setText("");
        chk_M.setSelected(false);
        chk_F.setSelected(false);
    }

}
