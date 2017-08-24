package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by rk on 8/22/2017.
 * Program to Navigte from one scene to another
 */
public class Demo3 extends Application {

    Stage stage;
    Scene mango, banana;

    public static void main(String args[]){

        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;

        Label mangolabel = new Label("This is Mango scene");
        Button mangobutton = new Button("Click to switch");
        mangobutton.setOnAction(e-> stage.setScene(banana));

        StackPane sp = new StackPane();
        sp.getChildren().addAll(mangolabel,mangobutton);
        mango = new Scene(sp,300,300);

        Label bananalabel = new Label("This is Banana scene");
        StackPane sp1 = new StackPane();
        sp1.getChildren().add(bananalabel);
        banana = new Scene(sp1,200,200);

        stage.setScene(mango);
        stage.show();





    }
}
