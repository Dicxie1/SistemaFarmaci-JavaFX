package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ListView;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
public class Prueba implements Initializable {
	@FXML HBox pnRoot;
	@FXML public ListView<String> lstProductos;
	@FXML public ListView<String> lstStockMinimo;
	@FXML public PieChart sucursalPieChart;
	@FXML public PieChart empleadoPieChart;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		fillLstProductos();
		fillStockMinimo();
		fillSucursalPie();
		sucursalPieChart.getData().forEach(this::installTooltip);
	}
	@FXML 
	private void handlerMouseClicked(MouseEvent e) {
		System.out.print(e.getSource().toString());
		System.out.print(" Click sobre el objeto\n");
	}
	private void fillLstProductos() {
		lstProductos.getItems().add("1) Asetaminofem");
		lstProductos.getItems().add("2) Diclifenac");
		lstProductos.getItems().add("3) Asetaminofem");
		lstProductos.getItems().add("4) Omeprasol");
		lstProductos.getItems().add("5) Nitroglicerina");
		lstProductos.getItems().add("6) Sulfato de magnecio");
		lstProductos.getItems().add("7) Morfina");
		lstProductos.getItems().add("8) Isoprotenerol");
		lstProductos.getItems().add("9) Ratidina");
		lstProductos.getItems().add("10) Glucosa");
		
	}
	private void fillStockMinimo() {
		lstStockMinimo.getItems().add("1) Verapamino(-40)");
		lstStockMinimo.getItems().add("2) Valproato Sódico (-49)");
		lstStockMinimo.getItems().add("3) Propafenoma (-64)");
		lstStockMinimo.getItems().add("4) Omeprasol (-64)");
		lstStockMinimo.getItems().add("5) Nitroglicerina (-74)");
		lstStockMinimo.getItems().add("6) Naloxona (-80)");
		lstStockMinimo.getItems().add("7) Morfina (-100)");
		lstStockMinimo.getItems().add("8) Isoprotenerol(-120)");
		lstStockMinimo.getItems().add("9) Ratidina (-143)");
		lstStockMinimo.getItems().add("10) Glucosa (-145)");
	}
	private void fillSucursalPie() {
		ObservableList<PieChart.Data> observableList = FXCollections.observableArrayList(
				new PieChart.Data("Loma fresca", 20000),
				new PieChart.Data("Caminante", 10000),
				new PieChart.Data("Los angeles", 56000)
				);
		sucursalPieChart.setData(observableList);
	}
	
	private void installTooltip(PieChart.Data d) {
		String msg = String.format("%s : %s", d.getName(), d.getPieValue());
		Tooltip tt = new Tooltip(msg);
		tt.setStyle("-fx-background-color: gray; "
				+ "-fx-text-fill: whitesmoke;");
		Tooltip.install(d.getNode(), tt);
		
	}

}
