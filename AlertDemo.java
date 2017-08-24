package com.company;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by rk on 8/22/2017.
 */
public class AlertDemo {

    public static  void display(String title, String message){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Alert Box");
        stage.setMaxWidth(300);

        ////////////////////

        Label label = new Label();
        label.setText(message);

        ///////////////////

        Button button = new Button("Click to close");
        button.setOnAction(e-> stage.close());

        VBox vbox = new VBox();
        vbox.getChildren().add(button);
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.CENTER_RIGHT);

        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.showAndWait();


    }
}
