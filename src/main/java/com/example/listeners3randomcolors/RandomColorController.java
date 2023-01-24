package com.example.listeners3randomcolors;

import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class RandomColorController implements Initializable {
private final Random random = new Random();


    public AnchorPane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

changeColor();
    }

    private void changeColor()
    {
        int red= random.nextInt();
        int green= random.nextInt();
        int blue= random.nextInt();

        rootPane.setStyle("-fx-background-color: rgb("+red+","+green+","+blue+");");
    }
}
