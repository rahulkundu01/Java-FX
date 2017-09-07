package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Program to demonstrate the use of Menu
 * Created by rk on 9/6/2017.
 */
public class DemoMenu extends Application {


    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Menu topmenu = new Menu("File");  // Declaring Menu

        MenuItem New = new MenuItem("New"); //Declaring Menu Items
        New.setOnAction(e-> System.out.println("New is selected"));

        topmenu.getItems().add(New);              // Adding Items to the Menu
        topmenu.getItems().add(new MenuItem("Open"));
        topmenu.getItems().add(new MenuItem("Save"));
        topmenu.getItems().add(new SeparatorMenuItem());
        topmenu.getItems().add(new MenuItem("Exit"));


        CheckMenuItem autosave = new CheckMenuItem("Auto Save");
        topmenu.getItems().add(autosave);
        autosave.setOnAction(e->{
        if(autosave.isSelected()){
            System.out.println("Auto Save is Enabled");
        }
        else{
            System.out.println("Auto Save is Disabled");
        }
        });

        Menu gender = new Menu("Gender");
        ToggleGroup toggleGroup = new ToggleGroup();
        RadioMenuItem male = new RadioMenuItem("Male");
        RadioMenuItem female = new RadioMenuItem("Female");

        male.setToggleGroup(toggleGroup);
        female.setToggleGroup(toggleGroup);

        gender.getItems().addAll(male,female);

        MenuBar menubar = new MenuBar();      //Declaring Menu Bar
        menubar.getMenus().addAll(topmenu,gender);  //Adding all the menus into Menu Bar

        BorderPane bpl = new BorderPane();
        bpl.setTop(menubar);
        Scene scene = new Scene(bpl,500,400);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
