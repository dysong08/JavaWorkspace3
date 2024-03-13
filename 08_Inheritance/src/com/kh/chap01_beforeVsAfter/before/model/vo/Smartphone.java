package com.kh.chap01_beforeVsAfter.before.model.vo;

public class Smartphone {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String agenct;
	
	public Smartphone() {}
	public Smartphone(String brand, String pCode, String pName, int price, String agenct) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.agenct = agenct;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getpCode() {
		return pCode;
	}


	public void setpCode(String pCode) {
		this.pCode = pCode;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getAgenct() {
		return agenct;
	}


	public void setAgenct(String agenct) {
		this.agenct = agenct;
	}
	
	
	
	
	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price + agenct;
		
	}
	
	
	
	
}
