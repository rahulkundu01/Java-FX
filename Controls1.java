package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 * Created by rk on 8/29/2017.
 */
public class Controls1 extends Application{

    public static void main(String args[]){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        //Checkboxes
        CheckBox cb1 = new CheckBox("RED");
        CheckBox cb2 = new CheckBox("GREEN");
        Button btnClick = new Button("Click");
        btnClick.setOnAction(e-> checkAction(cb1,cb2));


        VBox vb = new VBox(10);
        vb.setPadding(new Insets(10,10,10,10));
        vb.getChildren().addAll(cb1,cb2,btnClick);


        Scene scene = new Scene(vb,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void checkAction(CheckBox cb1, CheckBox cb2){
        String message;
        if(cb1.isSelected()){
            message = "Red";
        }
        else{
            message="Green";
        }
        System.out.println(message);
    }
}
