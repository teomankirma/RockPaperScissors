package com.example.rockpaperscissors;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import java.util.Random;


public class PlayerMenuController {

    @FXML
    Label player1Label;


    public void displayP1Name(String p1Name) {
        player1Label.setText(p1Name + ", it's your turn!");
    }

    public void btRockPressed() {

        while (true) {

            Random rnd = new Random();
            int compChoice1 = rnd.nextInt(3);

            if (compChoice1 == 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Draw!");
                alert.setHeaderText(null);
                alert.setContentText("Draw! Computer's choice was Rock!");
                alert.showAndWait();
                break;

            } else if (compChoice1 == 1) {
                Alert alert2 = new Alert(Alert.AlertType.WARNING);
                alert2.setTitle("Computer won :(");
                alert2.setHeaderText(null);
                alert2.setContentText("Computer won! Computer's choice was Paper!");
                alert2.showAndWait();
                break;

            } else {
                Alert alert3 = new Alert(Alert.AlertType.INFORMATION);
                alert3.setTitle("You won :)");
                alert3.setHeaderText(null);
                alert3.setContentText("You won! Computer's choice was Scissors!");
                alert3.showAndWait();
                break;
            }
        }

    }

    public void btPaperPressed() {

        while (true) {
            Random rnd2 = new Random();
            int compChoice2 = rnd2.nextInt(3);

            if (compChoice2 == 0) {
                Alert alert4 = new Alert(Alert.AlertType.INFORMATION);
                alert4.setTitle("You won :)");
                alert4.setHeaderText(null);
                alert4.setContentText("You won! Computer's choice was Rock!");
                alert4.showAndWait();
                break;

            } else if (compChoice2 == 1) {
                Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
                alert5.setTitle("Draw!");
                alert5.setHeaderText(null);
                alert5.setContentText("Draw! Computer's choice was Paper!");
                alert5.showAndWait();
                break;

            } else {
                Alert alert6 = new Alert(Alert.AlertType.WARNING);
                alert6.setTitle("Computer won :(");
                alert6.setHeaderText(null);
                alert6.setContentText("Computer won! Computer's choice was Scissors!");
                alert6.showAndWait();
                break;
            }
        }

    }

    public void btScissorsPressed() {

        while (true) {
            Random rnd3 = new Random();
            int compChoice3 = rnd3.nextInt(3);

            if (compChoice3 == 0) {
                Alert alert7 = new Alert(Alert.AlertType.WARNING);
                alert7.setTitle("Computer won :(");
                alert7.setHeaderText(null);
                alert7.setContentText("Computer won! Computer's choice was Rock!");
                alert7.showAndWait();
                break;

            } else if (compChoice3 == 1) {
                Alert alert8 = new Alert(Alert.AlertType.INFORMATION);
                alert8.setTitle("You won :)");
                alert8.setHeaderText(null);
                alert8.setContentText("You won! Computer's choice was Paper!");
                alert8.showAndWait();
                break;

            } else {
                Alert alert9 = new Alert(Alert.AlertType.INFORMATION);
                alert9.setTitle("Draw!");
                alert9.setHeaderText(null);
                alert9.setContentText("Draw! Computer's choice was Scissors!");
                alert9.showAndWait();
                break;
            }
        }
    }


}
