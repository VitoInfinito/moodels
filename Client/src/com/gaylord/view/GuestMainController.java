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

public class GuestMainController {
	@FXML
	private ImageView headerImage;

	@FXML
	private ImageView footerImage;

	@FXML
	private BorderPane pane;

	@FXML
	private Button restaurantButton;

	@FXML
	private Button roomServiceButton;

	@FXML
	private Button billsButton;

	@FXML
	private Button logOutButton;


	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
		Stage stage = MainApp.STAGE;
		headerImage.fitWidthProperty().bind(stage.widthProperty()); 
		footerImage.fitWidthProperty().bind(stage.widthProperty());

		logOutButton.setOnAction((event) -> {
			try {
				// Load root layout from fxml file.
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainApp.class.getResource("view/Login.fxml"));
				AnchorPane loginLayout = (AnchorPane) loader.load();

				stage.hide();
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

		restaurantButton.setOnAction((event) -> {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainApp.class.getResource("view/GuestRestaurantLayout.fxml"));
				BorderPane layout = (BorderPane) loader.load();
				
				pane.setCenter(layout);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		roomServiceButton.setOnAction((event) -> {

		});

		billsButton.setOnAction((event) -> {

		});
	}
}
