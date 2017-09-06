package com.company;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Program to demonstrate the use of TreeView
 * Created by rk on 9/5/2017.
 */
public class DemoTreeView extends Application{

    TreeView<String> tree;
    public static void main(String args[]){

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        TreeItem<String> root,food,drinks;
        //Setting Up the root
        root = new TreeItem();
        root.setExpanded(true);

        //Setting Up the food branch
        food = setBranch("Food",root);
        setBranch("Burger", food);
        setBranch("Samosa", food);
        setBranch("Kachori", food);
        setBranch("Bhajji", food);

        //Setting Up drinks branch
        drinks = setBranch("Drinks",root);
        setBranch("Tea", drinks);
        setBranch("Coffee", drinks);
        setBranch("Lassi", drinks);
        setBranch("Butter Milk", drinks);


        //Creating new Tree
        tree = new TreeView<>(root);
        tree.setShowRoot(false);


        // Layout
        VBox vb = new VBox(10);
        vb.setPadding(new Insets(20, 20, 20, 20));
        vb.getChildren().addAll(tree    );


        Scene scene = new Scene(vb, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    //Creating setBranch method
    public TreeItem<String> setBranch(String title, TreeItem<String> parent){

        TreeItem<String> item  = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}
