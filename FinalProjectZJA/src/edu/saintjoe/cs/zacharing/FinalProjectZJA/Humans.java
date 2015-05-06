package edu.saintjoe.cs.zacharing.FinalProjectZJA;

public class Humans {
	
	private String type;
	private int weight;
	private int iqscore;
	
/*---------------------------------------------------*/
	
	public void FinalProject(String humanType, int humanWeight, int humanIqscore) {
		type = humanType;
		weight = humanWeight;
		iqscore = humanIqscore;
	}
	
	public String toString() {
		return "Human Type:" + type + "Weight:" + weight + "IQ Score:" + iqscore;
	}
	//Accessor
	public String getType() {
		return type;
	}
	//Accessor
	public int getWeight() {
		return weight;
	}
	
	public int getIqscore() {
		return iqscore;
	}
	//Mutator
	public void setType(String newType) {
		type = newType;
	}
	//Mutator
	public void setWeight(int newWeight) {
		weight = newWeight;
	}
	
	public void setIqscore(int newIqscore) {
		iqscore = newIqscore;
	}

}
