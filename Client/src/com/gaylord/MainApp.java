package com.gaylord;


import java.io.IOException;

import Classes.Accounts.AccountType;
import Classes.Accounts.IManageAccounts;
import Classes.Restaurants.IRestaurantsManage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainApp extends Application {
    public static Stage STAGE;
    private AnchorPane loginLayout;

    @SuppressWarnings("static-access")
	@Override
    public void start(Stage primaryStage) {
        this.STAGE = primaryStage;
        this.STAGE.setTitle("Login");

		//  remove this when persistance works
		IManageAccounts.INSTANCE.addAccount("guest", "guest", AccountType.GUEST);
		IManageAccounts.INSTANCE.addAccount("customerservice", "customerservice", AccountType.CUSTOMER_SERVICE);
		IManageAccounts.INSTANCE.addAccount("staff", "staff", AccountType.STAFF);
		IManageAccounts.INSTANCE.addAccount("manager", "manager", AccountType.MANAGER);
		IRestaurantsManage.INSTANCE.addRestaurant("Anders korvmoj");
		IRestaurantsManage.INSTANCE.addRestaurant("Tikkas bögkäk");
		IRestaurantsManage.INSTANCE.addRestaurant("Charlies bordellklubb");
        
        initLoginLayout();
    }

    /**
     * Initializes the root layout.
     */
    public void initLoginLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/Login.fxml"));
            loginLayout = (AnchorPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(loginLayout);
            STAGE.initStyle(StageStyle.DECORATED);
            STAGE.setScene(scene);
            STAGE.show();
            STAGE.setResizable(false);
            STAGE.centerOnScreen();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}