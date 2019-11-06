/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311.form1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author czm355
 */
public class Form1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("IST 311-Form 1"); 
        
        {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Scene scene = new Scene(grid,300,275); 
        scene.getStylesheets().add(Form1.class.getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene); 
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setId("welcome-text");
        //scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        // Text Control
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        //Event Handler
        btn.setOnAction(new EventHandler<ActionEvent>() {
         @Override
        public void handle(ActionEvent e) {
        //actiontarget.setFill(Color.FIREBRICK);
        actiontarget.setId("actiontarget");
        actiontarget.setText("Sign in button pressed");
        }
        }); 
        
        
        
        
        primaryStage.show();
        
        
        
        
        
        // grid line view
        // grid,setGridLinesVisible(true); 
    }

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        launch(args);
    }
    */ 
 }
}