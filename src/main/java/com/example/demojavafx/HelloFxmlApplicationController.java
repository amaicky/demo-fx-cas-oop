package com.example.demojavafx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class HelloFxmlApplicationController {
    public BorderPane borderPane;

    @FXML
    public void oClose(ActionEvent actionEvent) {
        Platform.exit();
    }

    @FXML
    public void oNew(ActionEvent actionEvent) {
        TextArea text = new TextArea(("Hallo"));
        borderPane.setCenter(text);
    }

    public void oDialog(ActionEvent actionEvent) {
        DialogLayout layout = new DialogLayout();
        borderPane.setCenter(layout.createInputPane());
    }

    public void onAbout(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("I have a great message for you!");

        alert.showAndWait();
    }
}
