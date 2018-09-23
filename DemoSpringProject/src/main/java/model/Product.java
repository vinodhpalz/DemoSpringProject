package model;

public class Product {
	private String pName;
	private String pCost;
	
	public Product() {
		
	}
	public Product(String pName, String pCost) {
		this.pName = pName;
		this.pCost = pCost;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCost() {
		return pCost;
	}
	public void setpCost(String pCost) {
		this.pCost = pCost;
	}
	
}
