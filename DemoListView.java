package com.company;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Program to demonstrate the use of ListView
 * Created by rk on 9/5/2017.
 */
public class DemoListView extends Application {

    ListView <String> lstView;

    public static void main(String []args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        lstView = new ListView();
        lstView.getItems().addAll("Item1", "Item2","Item3","Item4");
        lstView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        Button btnClick = new Button("Click");
        btnClick.setOnAction(e-> buttonClicked());


        VBox vb = new VBox(10);
        vb.setPadding(new Insets(20, 20, 20, 20));
        vb.getChildren().addAll(lstView,btnClick);


        Scene scene = new Scene(vb, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void buttonClicked(){

        String message = "";
        ObservableList<String> items;
        items = lstView.getSelectionModel().getSelectedItems();

        for(String m:items){
            message+=m +"\n";
        }
        System.out.println(message);
    }
}
