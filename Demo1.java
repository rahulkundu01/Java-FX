package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

;

public class Demo1 extends Application {

    Button button1 = new Button(); Button button2 = new Button();
    Button button3 = new Button();

    public static void main(String[] args) {
	// write your code here

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    primaryStage.setTitle("This is Demo Title");
    button1.setText("Button 1");
    button2.setText("Button 2");
    button3.setText("Click Heare");

        Pane layout = new Pane();
        layout.getChildren().add(button1);
        layout.getChildren().add(button2);
        layout.getChildren().add(button3);

        button1.setLayoutX(100); button1.setLayoutY(100);
        button2.setLayoutX(100); button2.setLayoutY(150);
        button3.setLayoutX(100); button3.setLayoutY(200);

        Scene scene = new Scene(layout, 300,300);
        primaryStage.setScene(scene);
        primaryStage.show();


        button1.setOnAction(e -> System.out.println("Button1 is clicked"));
        button2.setOnAction(e -> System.out.println("Button2 is clicked"));
        button3.setOnAction(e-> AlertDemo.display("RK","Hi This is Alert Demo"));
    }
}
