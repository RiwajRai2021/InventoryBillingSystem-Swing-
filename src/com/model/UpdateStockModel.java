package com.model;

public class UpdateStockModel {
	
	private int Id; 
	private String ProductName; 
	private String QuantityAvailable; 
	private String QuantityAdded; 
	private String MRP;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getQuantityAvailable() {
		return QuantityAvailable;
	}
	public void setQuantityAvailable(String quantityAvailable) {
		QuantityAvailable = quantityAvailable;
	}
	public String getQuantityAdded() {
		return QuantityAdded;
	}
	public void setQuantityAdded(String quantityAdded) {
		QuantityAdded = quantityAdded;
	}
	public String getMRP() {
		return MRP;
	}
	public void setMRP(String mRP) {
		MRP = mRP;
	} 
	
	
}
