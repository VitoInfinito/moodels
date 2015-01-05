package com.gaylord.view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import com.gaylord.MainApp;

public class ManagerMainController {
	@FXML
	private ImageView headerImage;

	@FXML
	private ImageView footerImage;

	@FXML
	private BorderPane pane;

	@FXML
	private Button restaurantsButton;

	@FXML
	private Button servicesButton;

	@FXML
	private Button roomsButton;
	
	@FXML
	private Button statisticsButton;
	
	@FXML
	private Button bookingsButton;
	
	@FXML
	private Button accountsButton;
	
	@FXML
	private Button feedbackButton;
	
	@FXML
	private Button inventoryButton;
	
	@FXML
	private Button employeesButton;

	@FXML
	private Button logOutButton;
	
	@FXML
	private Button customersButton;
	
	@FXML
	private Button guestsButton;


	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
		Stage stage = MainApp.STAGE;
		stage.setTitle("Hotel management");
		headerImage.fitWidthProperty().bind(stage.widthProperty()); 
		footerImage.fitWidthProperty().bind(stage.widthProperty());

		logOutButton.setOnAction((event) -> {
			try {
				stage.hide();
				// Load root layout from fxml file.
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainApp.class.getResource("view/Login.fxml"));
				AnchorPane loginLayout = (AnchorPane) loader.load();

				
				// Show the scene containing the root layout.
				Scene scene = new Scene(loginLayout);
				stage.setScene(scene);
				stage.setMinHeight(1);
				stage.setMinWidth(1);
				stage.setWidth(400.0);
				stage.setHeight(300);
				stage.setTitle("Login");
				stage.setResizable(false);
				stage.show(); 
				stage.centerOnScreen();




			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		restaurantsButton.setOnAction((event) -> {
			
		});

		servicesButton.setOnAction((event) -> {
			
		});

		roomsButton.setOnAction((event) -> {
			
		});
		
		statisticsButton.setOnAction((event) -> {
			
		});
		
		bookingsButton.setOnAction((event) -> {
			
		});
		
		accountsButton.setOnAction((event) -> {
			
		});
		
		feedbackButton.setOnAction((event) -> {
			
		});
		
		inventoryButton.setOnAction((event) -> {
			
		});
		
		employeesButton.setOnAction((event) -> {
			
		});
		
		customersButton.setOnAction((event) -> {
			
		});
		
		guestsButton.setOnAction((event) -> {
			
		});
	}
}
