package com.gaylord.view;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import Classes.Restaurants.IRestaurantsAccess;

import com.gaylord.MainApp;

public class GuestRestaurantController {

	@FXML
	private ListView<String> restaurants;
	
	@FXML
	private Label restaurantName;


	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
		Stage stage = MainApp.STAGE;
		restaurants.setItems(FXCollections.observableArrayList(IRestaurantsAccess.INSTANCE.getAllRestaurantNames()));
		restaurants.getSelectionModel().selectedItemProperty().addListener((event) -> {
			restaurantName.textProperty().set(restaurants.getSelectionModel().selectedItemProperty().get());
		});
	}
}
