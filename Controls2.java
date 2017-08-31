package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Program to demonstrate Choice box
 * Created by rk on 8/30/2017.
 */
public class Controls2 extends Application {


    public static void main(String args[]) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        //Choice boxes
       ChoiceBox<String> cb = new ChoiceBox();
       cb.getItems().add("Red");
       cb.getItems().add("Blue");
       cb.getItems().addAll("Pink","Green","Yellow");
       cb.setValue("Blue");

        Button btnClick = new Button("Click");
        btnClick.setOnAction(e -> checkAction(cb));


        VBox vb = new VBox(10);
        vb.setPadding(new Insets(20, 20, 20, 20));
        vb.getChildren().addAll(cb, btnClick);


        Scene scene = new Scene(vb, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void checkAction(ChoiceBox<String> cb) {
        String message = cb.getValue();
        System.out.println(message);
    }
}
