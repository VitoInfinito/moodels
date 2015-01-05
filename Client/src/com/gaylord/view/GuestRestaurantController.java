package com.gaylord.view;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import Classes.Restaurants.IRestaurantsAccess;

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
		restaurants.setItems(FXCollections.observableArrayList(IRestaurantsAccess.INSTANCE.getAllRestaurantNames()));
		restaurants.getSelectionModel().selectedItemProperty().addListener((event) -> {
			restaurantName.textProperty().set(restaurants.getSelectionModel().selectedItemProperty().get());
		});
		
		restaurants.getSelectionModel().select(0);
	}
}
