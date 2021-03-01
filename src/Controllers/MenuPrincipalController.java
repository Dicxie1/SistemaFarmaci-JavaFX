package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.App;
import view.UserView;
import view.img.Img;
public class MenuPrincipalController implements Initializable {
	@FXML public BorderPane root;
	@FXML public Button btnInicio;
	@FXML public Button btnProveedores;
	@FXML public Button btnCliente;
	@FXML public Button btnFactura;
	@FXML public Button btnSucursal;
	@FXML public Button btnUsuario;
	@FXML public Button btnFarmacos;
	@FXML public Label lblLabelTitleBar;
	@FXML public Label lblInfoUsuario;
	@FXML public Label lblUsuario;
	@FXML public BorderPane pnFormulario;
	@FXML public AnchorPane formCenter;
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		lblLabelTitleBar.setText("Informacion de ventas");
		/*Add the button graphic*/
		lblUsuario.setText("Dicxie Madrigal");
		lblUsuario.setGraphic(Img.getButtonGraphic("user50px.png"));
		btnInicio.setGraphic(Img.getButtonGraphic("home24px.png"));
		addView("prueba.fxml");
	}
	public void handlerBtnInicioOnAction(ActionEvent e) {
		lblLabelTitleBar.setText("Informacion de ventas");
		addView("prueba.fxml");
		
	}
	public void handlerBtnProveedoresOnAction(ActionEvent e) {}
	public void handlerBtnClienteOnAction(ActionEvent e) {}
	public void handlerBtnFacturaAction(ActionEvent e) {}
	private void addView(String view) {
		
		Node formulario = (Node) App.ViewsLoader(view);
		ScrollPane nood = new ScrollPane();
		nood.setMinSize(450, 330);
		nood.setMaxHeight(pnFormulario.getMaxHeight()); 
		nood.setMaxWidth(pnFormulario.getMaxWidth());
		nood.setFitToHeight(true);
		nood.setFitToWidth(true);
		nood.setContent(formulario);
		formCenter.getChildren().add(nood);
		BorderPane.setAlignment(nood, Pos.CENTER);
		pnFormulario.setCenter(nood);
		
		
	}
	@FXML
	public void handlerLblUsuarioMouseCliked(MouseEvent e) throws Exception {
		UserView ventana = new UserView();
		Stage stage = new Stage();
		stage.centerOnScreen();
		ventana.start(stage);
	}
}

