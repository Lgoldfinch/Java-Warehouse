package fXPractice;

import java.beans.EventHandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FX extends Application {

	public static void main(String[] args) {
		launch(args);

	}
	private Button firstStage, submit;
private Button secondStage;
@Override
	public void start(Stage primaryStage) throws Exception {
	    
	    secondStage = new Button("Register");
	
		Label usernameLabel = new Label("Username:");
		usernameLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

		TextField usernameField = new TextField(); 
		usernameField.setMaxWidth(500);

		Label passwordLabel = new Label("Password:");
		passwordLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

		PasswordField password = new PasswordField(); 
		password.setMaxWidth(150); 

		Button btn1 = new Button("Log in");
		Button btn2 = new Button("Register");

		HBox h1 = new HBox(10);
		HBox h2 = new HBox(10);
		HBox h3 = new HBox(40); 
		VBox v = new VBox(10);

		h1.getChildren().addAll(usernameLabel,usernameField);
		h2.getChildren().addAll(passwordLabel,password);
		h3.getChildren().addAll(btn1, btn2);
		v.getChildren().addAll(h1,h2,h3);
		Scene scene = new Scene(v, 400,400);

		primaryStage.setTitle("Login Page");
		primaryStage.setScene(scene);
		secondStage.setOnAction(new javafx.event.
		EventHandler<ActionEvent>() {
		@Override 
		public void handle (ActionEvent event) {
			Stage secondaryStage = new Stage(); 
			try {
				register(secondaryStage);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		});
		primaryStage.show();
}

public void register(Stage secondaryStage)throws Exception {
	
	submit = new Button("Submit");
	
	firstStage = new Button("Back");
	
	Label emailLabel = new Label("Email:");
	emailLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

	TextField emailField = new TextField();
	emailField.setMaxWidth(500);

	Label passwordLabel = new Label("Password:");
	passwordLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

	TextField passwordField = new TextField();
	passwordField.setMaxWidth(500);

	Label confirmPasswordLabel = new Label("Confirm Password:");
	confirmPasswordLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

	TextField confirmPasswordField = new TextField();
	confirmPasswordField.setMaxWidth(500);

	HBox h1 = new HBox(10);
	HBox h2 = new HBox(10);
	HBox h3 = new HBox(10);
	HBox h4 = new HBox(10);
	VBox v = new VBox(10);

	h1.getChildren().addAll(emailLabel,emailField);
	h2.getChildren().addAll(passwordLabel, passwordField);
	h3.getChildren().addAll(confirmPasswordLabel,confirmPasswordField);
	h4.getChildren().addAll(submit, firstStage);
	v.getChildren().addAll(h1, h2, h3,h4);
	Scene scene = new Scene(v, 1000,1000);

	secondaryStage.setTitle("Register");
	secondaryStage.setScene(scene);
	firstStage.setOnAction(new javafx.event.
	EventHandler<ActionEvent>() {
		@Override
		public void handle (ActionEvent even) {
			secondaryStage.close();
		}
	});
	secondaryStage.show();  
}
}



