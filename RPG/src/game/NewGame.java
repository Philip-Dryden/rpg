package game;

import java.util.Scanner;

public class NewGame {

	public static void main(String args[]) {
		
		Scanner playerInput = new Scanner(System.in);
		
		System.out.println("Welcome! Please enter your name!");
		
		String characterName = playerInput.nextLine();
		
		PlayerCharacter playerOne = new PlayerCharacter(characterName);
		
		System.out.println("Welcome, "+playerOne.getName()+" !");
		System.out.println("These are your Stats: ");
		
		System.out.println("Character ID: "+playerOne.getId());
		System.out.println("Level: "+playerOne.getLevel());
		System.out.println("Name: "+playerOne.getName());
		System.out.println("Maximum Health: "+playerOne.getMaxHealth());
		System.out.println("Current Health: "+playerOne.getCurrentHealth());
		System.out.println("Maximum Mana: "+playerOne.getMaxMana());
		System.out.println("Current Mana: "+playerOne.getCurrentMana());
		System.out.println("Strength: "+playerOne.getStrength());
		System.out.println("Intelligence: "+playerOne.getIntelligence());
		System.out.println("Exp: "+playerOne.getExp());
		System.out.println("Exp needed for Levelup: "+playerOne.getMaxExpThisLevel());
		
		playerInput.close();

	}

}
