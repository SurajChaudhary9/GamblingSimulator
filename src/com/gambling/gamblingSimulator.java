package com.gambling;

public class gamblingSimulator {
	public static int STAKE = 100;
	public static int BET = 1;
	public static final int WIN = 1;
	public static int stake = 0;

	public static void checkForWinner() {

		int TRIAL = (int) Math.floor(Math.random() * 2);// Random Value
		System.out.println("Value Is " + TRIAL);

		if (TRIAL == 0) {
			System.out.println("Gambler Wins the game");
			STAKE++;
			// Print Results as per Random value
			System.out.println("Gambler looses the game");
			STAKE--;
		}

		System.out.println("Gambler having stake after bet are of $ " + STAKE);// Stake Value
	}

	public static void checkForResign() {
		int totalStake = 0;
		while (stake != 50 && stake != -50) {
			checkForWinner();
		}
		totalStake = stake + STAKE;
		System.out.println("Total stake for resign for a day is  " + totalStake);

	}

	public static void monthlyWinCheck() {
		int day;
		for (day = 1; day <= 20; day++) {
			System.out.printf("day %d\n", day);
			checkForResign();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation");
		checkForWinner();
		checkForResign();
		monthlyWinCheck();
	}
}
