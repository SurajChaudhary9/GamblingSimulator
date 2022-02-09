package com.gambling;

public class gamblingSimulator {
	public static int STAKE = 100;
	public static int BET = 1;
	
public static void checkForWinner() {
	
	int TRIAL = (int) Math.floor(Math.random() * 2);//Random Value
	System.out.println("Value Is " +TRIAL);
	
	if (TRIAL == 0) {   
		System.out.println("Gambler Wins the game");
		STAKE++; 
													//Print Results as per Random value
		System.out.println("Gambler looses the game");
		STAKE--;	
	}
	
	System.out.println("Gambler having stake after bet are of $ " + STAKE);//Stake Value
}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation");
		checkForWinner();
	}

}
