package view;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Artista extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		try {
			VBox root1 = (VBox) FXMLLoader.load(getClass().getResource("Artista.fxml"));
			Scene scene = new Scene(root1);
			stage.setScene(scene);
			stage.show();
			stage.setResizable(false);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
