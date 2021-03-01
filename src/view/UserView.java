package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UserView extends Application {

	
	public void start(Stage stage) throws Exception {
		AnchorPane root = FXMLLoader.load(getClass().getResource("UserView.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Usuario");
		stage.setResizable(false);
		stage.show();
	}
	public static void main(String[] args) {launch(args);}
}
