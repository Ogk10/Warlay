package com.mycompany.warlay.controller;

import static javafx.application.Application.launch;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
      
    @Override
    public void start(Stage stage) throws Exception {   
        
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Main.css");
        
        stage.setTitle("Warlay");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();        
        
        stage.setOnCloseRequest( e-> Platform.exit());
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}