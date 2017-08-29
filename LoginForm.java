package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Example to Demonstrate Login form.
 * Created by rk on 8/28/2017.
 */
public class LoginForm extends Application {

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

        Label lblUname = new Label("User Name");
        //GridPane.setConstraints(lname,0,0);
        gp.add(lblUname,0,0);

        TextField tfUname = new TextField("Enter User Name Here");
        //GridPane.setConstraints(Tname,1,0);
        gp.add(tfUname,1,0);

        Label lblPassword = new Label("Password");
        //GridPane.setConstraints(lcontact,0,1);
        gp.add(lblPassword,0,1);

        PasswordField tfPassword = new PasswordField();
        // GridPane.setConstraints(Tcontact,1,1);
        gp.add(tfPassword,1,1);

        Button btnAdd = new Button("Add");
        //GridPane.setConstraints(btnAdd,1,2);
        gp.add(btnAdd,1,2);
        btnAdd.setOnAction(e-> Validation(tfPassword));

        //gp.getChildren().addAll(lname,Tname,lcontact,Tcontact,btnAdd);

        Scene scene = new Scene(gp,200,300);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    private  void Validation(PasswordField password){
        String newPass = password.getText();

        if(newPass.equals("admin123")){
            System.out.println("Valid User");

        }
        else {
            System.out.println("Invalid User");
        }

    }
}
