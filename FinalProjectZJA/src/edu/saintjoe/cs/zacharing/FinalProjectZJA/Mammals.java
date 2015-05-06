package edu.saintjoe.cs.zacharing.FinalProjectZJA;

//Zachary Aring Final Project
//May 6, 2015

public class Mammals {
	
	private String type;
	private int weight;
	
/*---------------------------------------------------*/
	
	public Mammals(String animalType, int animalWeight) {
		type = animalType;
		weight = animalWeight;
	}
	
	public String toString() {
		return "Mammal Type: " + type + " " + "Weight: " + weight;
	}
	//Accessor
	public String getType() {
		return type;
	}
	//Accessor
	public int getWeight() {
		return weight;
	}
	//Mutator
	public void setType(String newType) {
		type = newType;
	}
	//Mutator
	public void setWeight(int newWeight) {
		weight = newWeight;
	}
	
}

