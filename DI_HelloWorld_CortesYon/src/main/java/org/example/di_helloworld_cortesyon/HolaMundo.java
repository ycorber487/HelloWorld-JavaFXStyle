package org.example.di_helloworld_cortesyon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HolaMundo extends Application {


    public void start(Stage primaryStage)  {

        Button boton = new Button("Say 'Hello World'");
        boton.setOnAction(e -> System.out.println("Say 'Hello World'"));

        StackPane root = new StackPane();
        root.getChildren().add(boton);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {launch(args);}

}