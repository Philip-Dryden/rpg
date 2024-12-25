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

		Weapon Test = new Weapon("Sword", 20, 10, 0, 1); //name, damage, req. Strength, Intelligence and Level
		
		playerOne.equipWeapon(Test);
		
		System.out.println("-----------------------------");
		System.out.println("Your weapon:");
		System.out.println(playerOne.weapon.getName());
		System.out.println(playerOne.weapon.getDamage()+" Damage");
		System.out.println("Requirements: ");
		System.out.println("Strength: "+playerOne.weapon.getRequiredStrength());
		System.out.println("Intelligence: "+playerOne.weapon.getRequiredIntelligence());
		System.out.println("Level: "+playerOne.weapon.getRequiredLevel());
		
	}

}
