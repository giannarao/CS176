package edu.monmouth.cs176.s1319673.mp3;

public class Flower extends Plant {

	String colorOfFlowers;
	boolean isAnnual;
	
	public Flower(String name, double cost, boolean isAnnual, String colorOfFlowers) {
		super(name, cost);
		this.isAnnual = isAnnual;
		this.colorOfFlowers = colorOfFlowers;
	}
	
	public void setColor(String colorOfFlowers) {
		this.colorOfFlowers = colorOfFlowers;
	}
	
	public String getColor() {
		 return colorOfFlowers;
	}
	
	@Override
	public void printInfo() {
		System.out.println("Flower name: " + name);
		System.out.println("Cost: $" + cost);
		System.out.println("Annual: " + isAnnual);
		System.out.println("Color of flowers: " + colorOfFlowers);
		//return colorOfFlowers;
		
	}
	
}
