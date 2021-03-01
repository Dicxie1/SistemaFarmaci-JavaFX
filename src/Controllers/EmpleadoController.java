package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import view.Artista;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
public class EmpleadoController implements Initializable {
	@FXML private TextField txtTexto;
	@FXML private PasswordField txtContrasenia;
	@FXML private Label lblUsuario;
	@FXML private Button btnCancelar;
	@FXML private Button btnAccion;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {}
	@FXML 
	public void handlerBtnAccionOnAccion(ActionEvent e) {
		txtTexto.setText("");
		txtContrasenia.setText("");
		lblUsuario.requestFocus();
		
	}
	@FXML 
	public void handlerBtnCancelarOnAction(ActionEvent e) throws Exception {
		Artista stage = new Artista();
		stage.start(new Stage());
		
	}
	
	

}
