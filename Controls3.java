package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 * Created by rk on 8/30/2017.
 */
public class Controls3 extends Application {

    public static void main(String []args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        ComboBox<String> cb = new ComboBox();
        cb.getItems().addAll("Red", "Green", "Blue", "Yellow", "White", "Black");
        cb.setPromptText("Red");
        cb.setOnAction(e-> System.out.println(cb.getValue()));

        VBox vb = new VBox(10);
        vb.setPadding(new Insets(20, 20, 20, 20));
        vb.getChildren().addAll(cb);


        Scene scene = new Scene(vb, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
