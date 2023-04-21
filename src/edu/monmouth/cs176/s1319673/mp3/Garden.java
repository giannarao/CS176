package edu.monmouth.cs176.s1319673.mp3;
import java.util.ArrayList;

public class Garden {

	public double totalCost = 0.0;
	
	ArrayList<Plant> arrayList= new ArrayList<Plant>();

	public String gardenName;

	
	Garden(String gardenName){
		this.gardenName = gardenName;
	}
	
	public void insertPlant(String name, double cost) {
		arrayList.add(new Plant(name, cost));
		
		
		}
	
	public void insertFlower(String name, double cost, boolean isAnnual, String colorOfFlowers) {
		arrayList.add(new Flower(name, cost, isAnnual, colorOfFlowers));
		
	}
	
	
	public void printOutContents() {
		
		System.out.println(gardenName);		
		
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.printf("Plant %d information: \n", i+1);
			
			totalCost = totalCost + arrayList.get(i).getCost();
			
			
			arrayList.get(i).printInfo();
		
			System.out.println();
			
		}
		System.out.println("Total Cost: $" + totalCost);
		
		
		
		
		
		
		
	}
}
