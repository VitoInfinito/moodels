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

import com.gaylord.MainApp;

import Classes.Accounts.AccountType;
import Classes.Accounts.IAccountsAccess;
import Classes.Accounts.IManageAccounts;

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
				try {
					// get a handle to the stage
					Stage stage = MainApp.STAGE;
					
		            // Load root layout from fxml file.
		            FXMLLoader loader = new FXMLLoader();
		            loader.setLocation(LoginController.class.getResource("GuestRootLayout.fxml"));
		            BorderPane loginLayout = (BorderPane) loader.load();

		            // Show the scene containing the root layout.
		            Scene scene = new Scene(loginLayout);
		            stage.hide();
		            stage.setScene(scene);
		            stage.setResizable(true);
		            stage.setMinHeight(800);
		            stage.setMinWidth(1000);
		            stage.setWidth(loginLayout.getWidth());
		            stage.setHeight(loginLayout.getHeight());
		            MainApp.STAGE.setTitle("Guest services");
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
			// get a handle to the stage
			Stage stage = (Stage) cancelButton.getScene().getWindow();
			// do what you have to do
			stage.close();
		});
	}

}
