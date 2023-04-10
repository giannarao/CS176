package edu.monmouth.cs176.s1319673.mp2;

public class ShoppingTripTester {

	public static void main(String[] args) {
		ShoppingTrip shoppingTrip = new ShoppingTrip("Costco", "4/1/2023");
	
		
		shoppingTrip.enterPurchase(7.00, ShoppingTrip.ItemCategory.FOOD, "Tomato Sauce");
		shoppingTrip.enterPurchase(15.00,  ShoppingTrip.ItemCategory.CLOTHING, "Shirt");
		shoppingTrip.enterPurchase(10.00,  ShoppingTrip.ItemCategory.UTENSILS, "Spoon");
		shoppingTrip.enterPurchase(20.00,  ShoppingTrip.ItemCategory.GARDEN, "Flowers");
		shoppingTrip.enterPurchase(50.00,  ShoppingTrip.ItemCategory.HOUSEHOLD, "Chair");
		
		shoppingTrip.print();
		
	}

}
