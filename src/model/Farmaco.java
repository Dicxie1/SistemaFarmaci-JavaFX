package model;

public class Farmaco {
	private int id;
	private String nombre;
	private double presio;
	private int stockMinimo;
	private int stock;
	/***
	 * Constructor de la clase
	 */
	public Farmaco() {}
	/***
	 * Constructor de la clase inicializa el id 
	 */
	public Farmaco(int idfarmaco) {this.id = idfarmaco;}
	/***
	 * 
	 */
	public Farmaco(int idfarmaco, String nombreFarmaco) {}
	public Farmaco(int idfarmaco, String nombreFarmaco, int  stockMinimo, int  stock) {}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the presio
	 */
	public double getPresio() {
		return presio;
	}
	/**
	 * @param presio the presio to set
	 */
	public void setPresio(double presio) {
		this.presio = presio;
	}
	/**
	 * @return the stockMinimo
	 */
	public int getStockMinimo() {
		return stockMinimo;
	}
	/**
	 * @param stockMinimo the stockMinimo to set
	 */
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
