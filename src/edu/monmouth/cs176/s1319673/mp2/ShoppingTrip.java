package edu.monmouth.cs176.s1319673.mp2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale.Category;


public class ShoppingTrip {
	private String store;
	private String date;
	public int MAX_SIZE = 30;
	
	Item[] itemArr = new Item[MAX_SIZE];
	
	private double grandTotal;
	
	
	
	
	public enum ItemCategory{
		FOOD, CLOTHING, UTENSILS, HOUSEHOLD, GARDEN
	}
	
	public ShoppingTrip(String store, String date) {
		this.store = store;
		this.date = date;	
		this.grandTotal = 0.0;
		
		
		
	}
	
	private int counter = 0;
	public void enterPurchase(double price, ItemCategory category, String specifics) {
		Item item = new Item(price, category, specifics);
		itemArr[counter] = item;
		counter = counter + 1;
		 
		
		
		
		grandTotal = grandTotal + price;
	}
	
	public void print() {
		System.out.println("Store: " + store);
		System.out.println("Date: " + date);
		System.out.println();
		
		double subtotal = 0.0;
		
		
		
		for (ItemCategory category : ItemCategory.values()) {
			subtotal = 0.0;
			
			for(int i=0; i<counter; i++) {
				if(itemArr[i].getCategory() == category){
					System.out.println("$" + itemArr[i].getPrice() + " " + itemArr[i].getSpecifics() + " Category: " + itemArr[i].getCategory()); 
					subtotal = subtotal + itemArr[i].getPrice();
					
					
			

				System.out.println(itemArr[i].getCategory() + " Subtotal: $" + subtotal);
				System.out.println();
				}
		}
		
		
	
		
	
}
		System.out.println("Grand Total: $" + grandTotal);
	}
}
