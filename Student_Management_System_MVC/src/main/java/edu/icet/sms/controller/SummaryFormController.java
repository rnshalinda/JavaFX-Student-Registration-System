package edu.icet.sms.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import lombok.NoArgsConstructor;
import edu.icet.sms.model.CollectionStu;
import edu.icet.sms.model.Student;

import javax.swing.*;
import java.io.IOException;


@NoArgsConstructor
public class SummaryFormController {

    private Stage stage = new Stage();
    private Stage currentStage;

    public SummaryFormController(Stage stage) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/summary-screen.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();

    }

    @FXML
    private Button btn_back;

    @FXML
    private Button btn_logout;

    @FXML
    private TableColumn<Student, String> col_Course;

    @FXML
    private TableColumn<Student, String> col_Email;

    @FXML
    private TableColumn<Student, String> col_Gender;

    @FXML
    private TableColumn<Student, String> col_Name;

    @FXML
    private TableView<Student> tbl_stuDetails;

    @FXML
    void btnBackToRegistrationAction(ActionEvent event) {
        new RegistrationFormContoller(stage);
        currentStage = (Stage) btn_back.getScene().getWindow();
        currentStage.close();
    }

    @FXML
    void logoutAction(ActionEvent event) throws IOException {
        new LoginFormController(stage);
        currentStage = (Stage) btn_logout.getScene().getWindow();
        currentStage.close();
    }

    @FXML
    void tblReloadAction(ActionEvent event) {

        // Link table columns
        col_Name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_Email.setCellValueFactory(new PropertyValueFactory<>("email"));
        col_Gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        col_Course.setCellValueFactory(new PropertyValueFactory<>("course"));

        // Convert ArrayList to ObservableList
        ObservableList<Student> data = FXCollections.observableArrayList(CollectionStu.getStudents());  //   get the array list and directly convert into observable list
        //data.add(new Student(stu.getName(), stu.getEmail(), stu.getGender(), stu.getCourse()));

        if(data.isEmpty()){
            JOptionPane.showMessageDialog(null, "No data list");
        }
        else {
            // Set data to TableView
            tbl_stuDetails.setItems(data);
        }

    }

}
