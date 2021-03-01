package view;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
public class App extends Application {
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setMinWidth(823);
		stage.setMinHeight(400);
		HBox root = (HBox) FXMLLoader.load(getClass().getResource("prueba.fxml"));
		Scene scene = new Scene(root, 823, 400);
		stage.setScene(scene);
		stage.show();
	}
	
	public static Object ViewsLoader(String view) {
		Object node = null;
		try {
		node = FXMLLoader.load(App.class.getResource(view));
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return node;
	}

}
