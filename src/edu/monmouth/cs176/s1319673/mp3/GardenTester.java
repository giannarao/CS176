package edu.monmouth.cs176.s1319673.mp3;

public class GardenTester {

	public static void main(String[] args) {
		Garden g1 = new Garden("My garden");
		Garden g2 = new Garden("My garden 2");
		
		g1.insertPlant("Spirea", 10.00);
		g1.insertPlant("MINT", 5.00);
		g1.insertFlower("Hydrangea", 30.00, true, "lilac");
		g1.insertFlower("Rose", 25.00, false, "red");
		
		g2.insertPlant("Basil", 10.00);
		g2.insertPlant("Evergreen", 30.00);
		g2.insertFlower("Tulip", 20.00, false, "blue");
		g2.insertFlower("Sunflower", 20.00, false, "yellow");
		
		
		g1.printOutContents();
	
		System.out.println();
		
		g2.printOutContents();
		

	}

}
