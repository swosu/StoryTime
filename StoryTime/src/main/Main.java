package main;

import java.util.Random;
import java.util.Scanner;
import gameSetUp.GameSetUp;

import introduction.Greetings;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rnd = new Random(System.currentTimeMillis());
		System.out.println("Program Begin");
		Greetings.printGreeting();
		GameSetUp Cs2Game = new GameSetUp();
		Cs2Game.setUpStoryTime(input, rnd);
		System.out.println("Program End");
	}

}
