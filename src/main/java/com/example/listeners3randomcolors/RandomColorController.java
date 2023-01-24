package com.example.listeners3randomcolors;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class RandomColorController implements Initializable {
    private final Random random = new Random();
    public Button btnChangeBackground;

    public AnchorPane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void changeColor() {

        int red = random.nextInt();

        int green = random.nextInt();

        int blue = random.nextInt();

        rootPane.setStyle("-fx-background-color: rgb(" + red + "," + green + "," + blue + ");");
        System.out.println("[---------------Colors----------------]");
        System.out.println(" Blue is " + blue);
        System.out.println(" Red is " + red);
        System.out.println(" Green is " + green);
        System.out.println("[---------------^^^^^^----------------]");
    }
}
