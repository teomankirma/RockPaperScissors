package com.example.rockpaperscissors;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PlayerNameMenuController {

    @FXML
    TextField player1TextField;
 
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void startGame(ActionEvent event) throws IOException {

        String p1Name = player1TextField.getText();

        if (p1Name.length() < 3) {
            Alert alert10 = new Alert(Alert.AlertType.WARNING);
            alert10.setTitle("Error");
            alert10.setHeaderText(null);
            alert10.setContentText("Your name must contain minimum 3 letters!");
            alert10.showAndWait();
        } else {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PlayerMenu.fxml"));
            root = loader.load();

            PlayerMenuController playerMenuController = loader.getController();
            playerMenuController.displayP1Name(p1Name);


            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }



}
