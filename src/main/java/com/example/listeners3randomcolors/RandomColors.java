package com.example.listeners3randomcolors;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RandomColors extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RandomColors.class.getResource("randomColors.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Random Color Generator ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}