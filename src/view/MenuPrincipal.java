package view;

import javafx.application.Application;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
public class MenuPrincipal extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("MenuPrincipal.fxml"));
		//AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("ListView.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setMinWidth(650);
		stage.setMinHeight(460);	
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
