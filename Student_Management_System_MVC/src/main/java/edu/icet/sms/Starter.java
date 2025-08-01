package edu.icet.sms;

import edu.icet.sms.controller.LoginFormController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Starter extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        new LoginFormController(stage);
    }
}
