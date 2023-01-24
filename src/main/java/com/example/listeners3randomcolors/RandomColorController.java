package com.example.listeners3randomcolors;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class RandomColorController implements Initializable {
private final SimpleDoubleProperty  simpleDoubleProperty= new SimpleDoubleProperty();

    private final Random random = new Random();
    public Button btnChangeBoolean;
    public Button btnChangeBackground;
    public AnchorPane rootPane;
    public TextField txt1SimpleBooleanValue;
    public Text txtActionEvent;
    private final SimpleBooleanProperty simpleBooleanProperty = new SimpleBooleanProperty();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        simpleBooleanProperty.addListener((observableValue, aBoolean, t1) -> {
            changeColor();
            try {
                setActionText("Color changed");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
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

        if (simpleBooleanProperty.getValue()) {
            simpleBooleanProperty.setValue(false);
        } else if (!simpleBooleanProperty.getValue()) {
            simpleBooleanProperty.setValue(true);
        }
        txt1SimpleBooleanValue.setText(simpleBooleanProperty.getValue().toString());

    }

    private void setActionText(String changeEvent) throws InterruptedException {
        txtActionEvent.setText(changeEvent);

    }
}
