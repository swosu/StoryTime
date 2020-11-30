package gameSetUp;

import java.util.Random;
import java.util.Scanner;
import treeGame.TreeGame;

public class GameSetUp {
	
	private int numberOfTeams;
	private String theme;
	private String[] teamTheme;
	
	public void setUpStoryTime(Scanner input, Random rnd) {
		boolean hasStoryPrompt = this.askUserIfTheyNeedAStoryPrompt(input);
		if(hasStoryPrompt)
		{
			AssignThemes.makeAssignments(input, rnd);
		}
	}
	
	private boolean askUserIfTheyNeedAStoryPrompt(Scanner input) {
		boolean needStoryPropmt = false;
		System.out.println("Do you need some ideas for a story?");
		System.out.print("Press 1 for yes, and any other number for no:");
		if(1 == input.nextInt()) {
			needStoryPropmt = true;
		}
		return needStoryPropmt;
	}

	public void playGames(Scanner input, Random rnd) {
		// TODO Auto-generated method stub
		
	}


}
