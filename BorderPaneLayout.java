package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Embedding Layouts- How to add multiple Layout
 * Created by rk on 8/28/2017.
 */
public class BorderPaneLayout extends Application{

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox topmenu = new HBox();                              //Initializing Horizontal Box
        Button btnFile = new Button("File");
        Button btnEdit = new Button("Edit");
        Button btnView = new Button("View");
        topmenu.getChildren().addAll(btnFile,btnEdit,btnView);  // Adding Children to HBox object


        VBox leftmenu = new VBox();                         // Initializing Vertical Box
        Button btnHome = new Button("Home");
        Button btnContact = new Button("Contact");
        Button btnAddress = new Button("Address");
        leftmenu.getChildren().addAll(btnHome,btnContact,btnAddress);  // Adding Children to the VBox object

        BorderPane bp = new BorderPane();     // Initilizing Border Pane
        bp.setTop(topmenu);                    // Setting Menu for Top
        bp.setLeft(leftmenu);                  // Setting Munu for Left

        ////////////////// Setting Scene///////////////////////////

        Scene bplScene = new Scene(bp,400,400);
        primaryStage.setScene(bplScene);
        primaryStage.show();
    }

}
