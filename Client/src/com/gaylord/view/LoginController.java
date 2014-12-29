package com.gaylord.view;

import org.controlsfx.dialog.Dialogs;

import Classes.Accounts.IAccountsAccess;

import com.gaylord.MainApp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
		loginButton.setOnAction((event) -> {
			if (IAccountsAccess.INSTANCE.login(username.getText(), password.getText())) {
				
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
			// get a handle to the stage
			Stage stage = (Stage) cancelButton.getScene().getWindow();
			// do what you have to do
			stage.close();
		});
	}

}
