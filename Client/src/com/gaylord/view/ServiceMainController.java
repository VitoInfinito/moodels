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

public class ServiceMainController {
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
	private Button customersButton;
	
	@FXML
	private Button guestsButton;

	@FXML
	private Button roomsButton;
	
	@FXML
	private Button bookingsButton;
	
	@FXML
	private Button feedbackButton;
	
	@FXML
	private Button inventoryButton;

	@FXML
	private Button logOutButton;


	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
		Stage stage = MainApp.STAGE;
		stage.setTitle("Customer service");
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
			// TODO
		});

		servicesButton.setOnAction((event) -> {
			// TODO
		});

		customersButton.setOnAction((event) -> {
			// TODO
		});
		
		guestsButton.setOnAction((event) -> {
			// TODO
		});
		
		roomsButton.setOnAction((event) -> {
			// TODO
		});
		
		bookingsButton.setOnAction((event) -> {
			// TODO
		});
		
		feedbackButton.setOnAction((event) -> {
			// TODO
		});
		
		inventoryButton.setOnAction((event) -> {
			// TODO
		});
	}
}
