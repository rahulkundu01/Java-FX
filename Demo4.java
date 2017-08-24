package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by rk on 8/22/2017.
 *
 * Progrm to domanstrate the use of Gridpane
 */
public class Demo4 extends Application {

    public static void main(String args[]){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("GridPane Experiment");

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(8,8,8,8));
        gp.setVgap(10);
        gp.setHgap(10);

        Label lname = new Label("Name");
        //GridPane.setConstraints(lname,0,0);
        gp.add(lname,0,0);

        TextField Tname = new TextField("Enter Name Here");
        //GridPane.setConstraints(Tname,1,0);
        gp.add(Tname,1,0);

        Label lcontact = new Label("Contact");
        //GridPane.setConstraints(lcontact,0,1);
        gp.add(lcontact,0,1);

        TextField Tcontact = new TextField("Enter contact Here");
       // GridPane.setConstraints(Tcontact,1,1);
        gp.add(Tcontact,1,1);

        Button btnAdd = new Button("Add");
        //GridPane.setConstraints(btnAdd,1,2);
        gp.add(btnAdd,1,2);

        //gp.getChildren().addAll(lname,Tname,lcontact,Tcontact,btnAdd);

        Scene scene = new Scene(gp,200,300);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
