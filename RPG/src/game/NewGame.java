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

		Weapon test = new Weapon("Sword", 20, 10, 0, 1); //name, damage, req. Strength, Intelligence and Level
		
		playerOne.equipWeapon(test);
		
		System.out.println("-----------------------------");
		System.out.println("Your weapon:");
		System.out.println(playerOne.weapon.getName());
		System.out.println(playerOne.weapon.getDamage()+" Damage");
		System.out.println("Requirements: ");
		System.out.println("Strength: "+playerOne.weapon.getRequiredStrength());
		System.out.println("Intelligence: "+playerOne.weapon.getRequiredIntelligence());
		System.out.println("Level: "+playerOne.weapon.getRequiredLevel());
		
		NonPlayerCharacter npcOne = new NonPlayerCharacter("Orc Warrior", 2, 52, 0, 20, 5);
		System.out.println("-----------------------------");
		System.out.println("NPC TEST");
		System.out.println("-----------------------------");
		System.out.println("Character ID: "+npcOne.getId());
		System.out.println("Level: "+npcOne.getLevel());
		System.out.println("Name: "+npcOne.getName());
		System.out.println("Maximum Health: "+npcOne.getMaxHealth());
		System.out.println("Current Health: "+npcOne.getCurrentHealth());
		System.out.println("Maximum Mana: "+npcOne.getMaxMana());
		System.out.println("Current Mana: "+npcOne.getCurrentMana());
		System.out.println("Strength: "+npcOne.getStrength());
		System.out.println("Intelligence: "+npcOne.getIntelligence());
		
		Weapon test2 = new Weapon("Axe", 10, 10, 0, 2); //name, damage, req. Strength, Intelligence and Level
		npcOne.equipWeapon(test2);
		
		Combat testCombat = new Combat(playerOne, npcOne);
		testCombat.startCombat();
		
		Inventory testInventory		= new Inventory(playerOne);
		Item testItemHealingPotion	= new Consumable("healingPotion", 20, 0);//name, restoredHealth, restoredMana
		Armour testArmour 			= new Armour("Test Armour", 30, 0, 5, 90);//name, requiredStrength, requiredIntelligence, requiredLevel, armourValue
		testInventory.addItem(testItemHealingPotion);
		testInventory.addItem(test);//should add the sword from line 34
		playerOne.inventory.addItem(testArmour);//alternative method to add items

		playerOne.inventory.showInventory();
	}

}
