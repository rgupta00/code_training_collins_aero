package com.day7.session2.mcq.q7;

import java.util.Random;

class Dice {
	private int face;

	public int throwDice() {
		Random random = new Random();
		return random.nextInt(6) + 1;
	}
}

class Play {
	private Dice dice1 = new Dice();
	private Dice dice2 = new Dice();

	public void rollTwoDices() {
		int sum = 0;
		int counter=0;
		do {
			sum = dice1.throwDice() + dice2.throwDice();
			System.out.println(sum);
			counter++;
		} while (sum != 12);
		System.out.println("you have won now you have taken : "+ counter + " chances..");
	}

}

public class Demo {

	public static void main(String[] args) {
		Play play = new Play();
		play.rollTwoDices();
	}

}
