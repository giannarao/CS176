package edu.monmouth.cs176.s1319673.mp2;

public class Item {

	private double price;
	private ShoppingTrip.ItemCategory category;
	private String specifics;
	
	public Item(double price, ShoppingTrip.ItemCategory category, String specifics) {
		this.price = price;
		this.category = category;
		this.specifics = specifics;
	}

	public double getPrice() {
		return price;
	}
	
	public ShoppingTrip.ItemCategory getCategory(){
		return category;
	}
	
	public String getSpecifics() {
		return specifics;
	}

	
	
}
