package com.gaylord.view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import org.controlsfx.dialog.Dialogs;

import Classes.Accounts.IAccountsAccess;

import com.gaylord.MainApp;

public class LoginController {

	@FXML
	private TextField username;

	@FXML
	private TextField password;

	@FXML
	private Button loginButton;

	@FXML
	private Button cancelButton;
	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@SuppressWarnings("deprecation")
	@FXML
	private void initialize() {
		// get a handle to the stage
		Stage stage = MainApp.STAGE;
		stage.setTitle("Login");
		loginButton.setOnAction((event) -> {
			if (IAccountsAccess.INSTANCE.login(username.getText(), password.getText())) {
				try {
					

					stage.hide();
					// Load root layout from fxml file.
					FXMLLoader loader = new FXMLLoader();

					switch (IAccountsAccess.INSTANCE.getAccountType(username.getText())) {
					case GUEST:
						loader.setLocation(LoginController.class.getResource("GuestRootLayout.fxml"));
						break;
					case CUSTOMER_SERVICE:
						loader.setLocation(LoginController.class.getResource("ServiceRootLayout.fxml"));
						break;
					case MANAGER:
						loader.setLocation(LoginController.class.getResource("ManagerRootLayout.fxml"));
						break;
					case STAFF:
						loader.setLocation(LoginController.class.getResource("StaffRootLayout.fxml"));
						break;
					default:
						break;
					}
					BorderPane loginLayout = (BorderPane) loader.load();

					// Show the scene containing the root layout.
					Scene scene = new Scene(loginLayout);
					stage.setScene(scene);
					stage.setResizable(true);
					stage.setMinHeight(800);
					stage.setMinWidth(1300);
					stage.setWidth(loginLayout.getPrefWidth());
					stage.setHeight(loginLayout.getPrefHeight());
					stage.show();
					stage.centerOnScreen();

				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				Dialogs.create()
				.owner((Stage) loginButton.getScene().getWindow())
				.title("Login Failed")
				.masthead("Incorrect user credentials.")
				.message("Please try again!")
				.showWarning();
			}
		});


		cancelButton.setOnAction((event) -> {
			// close
			stage.close();
		});
	}

}
