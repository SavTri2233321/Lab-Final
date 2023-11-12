package com.example.projetfinal2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Pattern;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        MathArtisanal.calculer("cos ( 5 ) + arcsin ( 0.5 ) x ²√ ( 5 )");

    }

    public static void main(String[] args) {
        launch();
    }

}