package edu.monmouth.cs176.s1319673.mp3;

public class Plant {

	String name;
	double cost;
	
	public Plant(String name, double cost){
		this.name = name;
		this.cost = cost;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double getCost() {
		return cost;
	}

	public void printInfo() {
		System.out.println("Plant name: " + name);
		System.out.println("Cost: $" + cost);
		
	}
}
