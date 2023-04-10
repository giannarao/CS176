package edu.monmouth.cs176.s1319673.mp2;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ShoppingTrip {
	private String store;
	private String date;
	
	private Map<ItemCategory, Double> categoryTotals;
	private List<Item> itemArr;
	
	
	private double grandTotal;
	
	public enum ItemCategory{
		FOOD, CLOTHING, UTENSILS, HOUSEHOLD, GARDEN
	}
	
	public ShoppingTrip(String store, String date) {
		this.store = store;
		this.date = date;
		this.itemArr = new ArrayList<>();
		
		this.grandTotal = 0.0;
		
		this.categoryTotals = new HashMap<>();
		for (ItemCategory category: ItemCategory.values()) {
			categoryTotals.put(category, 0.0);
		}
		
	}
	
	public void enterPurchase(double price, ItemCategory category, String specifics) {
		Item item = new Item(price, category, specifics);
		
		itemArr.add(item);
		
		grandTotal = grandTotal + price;
	}
	
	public void print() {
		System.out.println("Store: " + store);
		System.out.println("Date: " + date);
		System.out.println();
		
		for (ItemCategory category : ItemCategory.values()) {
			List<Item> categoryItemsList = new ArrayList<>();
			for(Item item: itemArr) {
				if(item.getCategory() == category){
					categoryItemsList.add(item);
				}
			}
			
				System.out.println(category + " Items");
			
				for (Item item: categoryItemsList) {
					System.out.println("$" + item.getPrice() + " " + item.getSpecifics());
					double categoryTotal = 0.0;
					categoryTotal = categoryTotal + item.getPrice();
					System.out.println("Category total: $" + categoryTotal);
					System.out.println();
				}
		
	
			
		}
		System.out.println("Grand Total: $" + grandTotal);
	}
}
