package gameSetUp;

import java.util.Random;
import java.util.Scanner;

public class AssignThemes {

	private static int numberOfTeams;
	private static String[] teamTheme;
	private static String theme;

	public static void makeAssignments(Scanner input, Random rnd) {
		getNumberOfTeams(input);
		assignThemes(rnd);
		printThemes();
		
	}
	
	private static void getNumberOfTeams(Scanner input) {
		System.out.println("How many teams would you like to have?");
		System.out.print("Please enter an integer: ");
		numberOfTeams = input.nextInt();
		System.out.println("You asked for " + numberOfTeams + " teams.");
	}
	
	private static void assignThemes(Random rnd) {
		teamTheme = new String[numberOfTeams];

		for(int teamIndex = 0; teamIndex < numberOfTeams; teamIndex++)
		{
			teamTheme[teamIndex] = getTheme(rnd);
		}	
	}

	private static void printThemes() {
		for(int teamIndex = 0; teamIndex < numberOfTeams; teamIndex++)
		{
			System.out.println(
					"Team: " + (teamIndex + 1) + " will code about " 
			+ teamTheme[teamIndex]);
		}
		
	}



	private static String getTheme(Random rnd) {
		int sideChoice = rnd.nextInt(6);
		//System.out.println("side choice was: " + sideChoice);
		int diceChoice = rnd.nextInt(8);
		//System.out.println("dice choice was: " + diceChoice);
		switch(diceChoice)
		{
		case 0:
			switch(sideChoice)
			{
			case 0: theme = "dice"; break;
			case 1: theme = "hand"; break;
			case 2: theme = "beetle"; break;
			case 3: theme = "bubble wand"; break;
			case 4: theme = "scary shadow"; break;
			case 5: theme = "turtle"; break;
			}
		case 1:
			switch(sideChoice)
			{
			case 0: theme = "fish"; break;
			case 1: theme = "flower"; break;
			case 2: theme = "happy sad masks"; break;
			case 3: theme = "compas rose"; break;
			case 4: theme = "key hole"; break;
			case 5: theme = "parachuter"; break;
			}
		case 2:
			switch(sideChoice)
			{
			case 0: theme = "rainbow"; break;
			case 1: theme = "tree"; break;
			case 2: theme = "pyramid"; break;
			case 3: theme = "eye"; break;
			case 4: theme = "robot face"; break;
			case 5: theme = "castle"; break;
			}
		case 3:
			switch(sideChoice)
			{
			case 0: theme = "comment"; break;
			case 1: theme = "ten o clock"; break;
			case 2: theme = "light bulb"; break;
			case 3: theme = "arrow"; break;
			case 4: theme = "sleeping"; break;
			case 5: theme = "house"; break;
			}
		case 4:
			switch(sideChoice)
			{
			case 0: theme = "book"; break;
			case 1: theme = "abbacus"; break;
			case 2: theme = "bridge"; break;
			case 3: theme = "bee"; break;
			case 4: theme = "magic wand"; break;
			case 5: theme = "moon"; break;
			}
		case 5:
			switch(sideChoice)
			{
			case 0: theme = "apple"; break;
			case 1: theme = "office building"; break;
			case 2: theme = "Earth"; break;
			case 3: theme = "Passenger Air Plane"; break;
			case 4: theme = "Worried and Happy Face"; break;
			case 5: theme = "flashlight"; break;
			}
		case 6:
			switch(sideChoice)
			{
			case 0: theme = "The letter L"; break;
			case 1: theme = "night dragon"; break;
			case 2: theme = "sheep"; break;
			case 3: theme = "bare foot print"; break;
			case 4: theme = "paddalock"; break;
			case 5: theme = "horseshoe magnet"; break;
			}
		case 7:
			switch(sideChoice)
			{
			case 0: theme = "skeleton key"; break;
			case 1: theme = "Teepee"; break;
			case 2: theme = "Worried and Sad Face"; break;
			case 3: theme = "big question mark"; break;
			case 4: theme = "shooting star"; break;
			case 5: theme = "fountain"; break;
			}
		}
		return theme;
	}



}
