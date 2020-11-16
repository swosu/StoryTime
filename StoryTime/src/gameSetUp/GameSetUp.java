package gameSetUp;

import java.util.Random;
import java.util.Scanner;

public class GameSetUp {
	private int numberOfTeams;
	private String theme;
	private String[] teamTheme;

	public void setUpStoryTime(Scanner input, Random rnd) {
		this.getNumberOfTeams(input);
		this.assignThemes(rnd);
		this.printThemes();
	}

	private void getNumberOfTeams(Scanner input) {
		System.out.println("How many teams would you like to have?");
		System.out.print("Please enter an integer: ");
		this.numberOfTeams = input.nextInt();
		System.out.println("You asked for " + this.numberOfTeams + " teams.");
	}

	private void assignThemes(Random rnd) {
		this.teamTheme = new String[this.numberOfTeams];

		for(int teamIndex = 0; teamIndex < this.numberOfTeams; teamIndex++)
		{
			this.teamTheme[teamIndex] = this.getTheme(getDiceNumber(rnd), rnd);
		}
	}

	private void printThemes() {
		for(int teamIndex = 0; teamIndex < this.numberOfTeams; teamIndex++)
		{
			System.out.println("Team: " + teamIndex + " will code about " +this.teamTheme[teamIndex]);
		}
	}

	private String getTheme(int diceNumber, Random rnd) {
		int sideChoice = rnd.nextInt(7);
		switch(diceNumber)
		{
		case 0:
			switch(sideChoice)
			{
			case 0: this.theme = "dice"; break;
			case 1: this.theme = "hand"; break;
			case 2: this.theme = "beetle"; break;
			case 3: this.theme = "bubble wand"; break;
			case 4: this.theme = "scary shadow"; break;
			case 5: this.theme = "turtle"; break;
			}
		case 1:
			switch(sideChoice)
			{
			case 0: this.theme = "fish"; break;
			case 1: this.theme = "flower"; break;
			case 2: this.theme = "happy sad masks"; break;
			case 3: this.theme = "compas rose"; break;
			case 4: this.theme = "key hole"; break;
			case 5: this.theme = "parachuter"; break;
			}
		case 2:
			switch(sideChoice)
			{
			case 0: this.theme = "rainbow"; break;
			case 1: this.theme = "tree"; break;
			case 2: this.theme = "pyramid"; break;
			case 3: this.theme = "eye"; break;
			case 4: this.theme = "robot face"; break;
			case 5: this.theme = "castle"; break;
			}
		case 3:
			switch(sideChoice)
			{
			case 0: this.theme = "comment"; break;
			case 1: this.theme = "ten o clock"; break;
			case 2: this.theme = "light bulb"; break;
			case 3: this.theme = "arrow"; break;
			case 4: this.theme = "sleeping"; break;
			case 5: this.theme = "house"; break;
			}
		case 4:
			switch(sideChoice)
			{
			case 0: this.theme = "book"; break;
			case 1: this.theme = "abbacus"; break;
			case 2: this.theme = "bridge"; break;
			case 3: this.theme = "bee"; break;
			case 4: this.theme = "magic wand"; break;
			case 5: this.theme = "moon"; break;
			}
		}
		return theme;
	}

	private int getDiceNumber(Random rnd) {
		return rnd.nextInt(6);
	}
}
