package com.example.practice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Objects;

public class Messenger extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mes.fxml")));

        Scene scene = new Scene(root, 745, 500);
        stage.setTitle("Messenger");
        URL url = Messenger.class.getResource("chat.png");
        Image image = new Image(String.valueOf(url));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}