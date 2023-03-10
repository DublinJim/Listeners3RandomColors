package com.example.listeners3randomcolors;

import javafx.animation.FadeTransition;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class RandomColorController implements Initializable {
    private final SimpleDoubleProperty simpleDoubleProperty = new SimpleDoubleProperty();
    private final SimpleBooleanProperty simpleBooleanProperty = new SimpleBooleanProperty();
    private final RGBMaker rgbMaker = new RGBMaker();
    public Text txtSimpleDouble;
    public Button btnSimpleDouble;
    public Text txtSimpleBooleanValue;
    public Button btnChangeBoolean;
    public Button btnChangeBackground;
    public AnchorPane rootPane;
    public Text txtActionEvent;
    private double dblNum = 1.0;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        simpleDoubleProperty.setValue(dblNum);
        txtSimpleBooleanValue.setText(simpleDoubleProperty.getValue().toString());

        simpleDoubleProperty.addListener((observableValue, number, t1) -> {
            changeColor();
changeTextColor();
            txtActionEvent.setText("Color changed By Double");
            fadeOut();

        });


        simpleBooleanProperty.addListener((observableValue, aBoolean, t1) -> {
            changeColor();
            try {
                setActionText();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

    }

    private void fadeOut() {

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), txtActionEvent);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.0);
        fadeTransition.play();
    }

    @FXML
    private void changeColor() {

        ArrayList<Integer> rgb = rgbMaker.getRgb();

        rootPane.setStyle("-fx-background-color: rgb(" + rgb.get(0) + "," + rgb.get(1) + "," + rgb.get(2) + ");");
        rgb.clear();
    }

private void changeTextColor()
{
    Color color =rgbMaker.getColor();
    txtSimpleDouble.setFill(color);
}
    @FXML
    private void setSimpleBooleanProperty() {

        if (simpleBooleanProperty.getValue()) {
            simpleBooleanProperty.setValue(false);
        } else if (!simpleBooleanProperty.getValue()) {
            simpleBooleanProperty.setValue(true);
        }
        txtSimpleBooleanValue.setText(simpleBooleanProperty.getValue().toString());
    }

    private void setActionText() throws InterruptedException {
        txtActionEvent.setText("Color changed by Boolean");
        fadeOut();
    }


    @FXML
    private void addToDouble() {
        dblNum++;
        simpleDoubleProperty.setValue(dblNum);
        txtSimpleDouble.setText(simpleDoubleProperty.getValue().toString());

    }
}
