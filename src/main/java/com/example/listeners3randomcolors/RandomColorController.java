package com.example.listeners3randomcolors;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class RandomColorController implements Initializable {

    private final Random random = new Random();
    public Button btnChangeBoolean;
    public Button btnChangeBackground;
    public AnchorPane rootPane;
    public TextField txt1SimpleBooleanValue;
    private SimpleBooleanProperty simpleBooleanProperty = new SimpleBooleanProperty();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        simpleBooleanProperty.addListener(new ChangeListener<>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                changeColor();
            }
        });

    }

    @FXML
    private void changeColor() {
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        rootPane.setStyle("-fx-background-color: rgb(" + red + "," + green + "," + blue + ");");

        System.out.println("[---------------Colors----------------]");
        System.out.println(" Blue is " + blue);
        System.out.println(" Red is " + red);
        System.out.println(" Green is " + green);
        System.out.println("[---------------^^^^^^----------------]");
    }


    @FXML
    private void setSimpleBooleanProperty() {

        if (simpleBooleanProperty.getValue() == true) {
            simpleBooleanProperty.setValue(false);
        } else if (simpleBooleanProperty.getValue() == false) {
            simpleBooleanProperty.setValue(true);
        }
        txt1SimpleBooleanValue.setText(simpleBooleanProperty.getValue().toString());


    }
}
