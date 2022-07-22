package net.muzz.choc.model;

public class chock {
	private int id;
	private String prd_name;
	private float price;
	private int quantity;
	
	public chock(int id, String prd_name, float price, int quantity) {
		super();
		this.id = id;
		this.prd_name = prd_name;
		this.price = price;
		this.quantity = quantity;
	}
	public chock(String prd_name, float price, int quantity) {
		super();
		this.prd_name = prd_name;
		this.price = price;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrd_name() {
		return prd_name;
	}
	public void setPrd_name(String prd_name) {
		this.prd_name = prd_name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
