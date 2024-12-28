package src.game;

import java.util.Scanner;

public class NewGame {

	public static void main(String args[]) {
		
		Scanner playerInput = new Scanner(System.in);
		
		System.out.println("Welcome! Please enter your name!");
		
		String characterName = playerInput.nextLine();
		
		PlayerCharacter playerOne	= new PlayerCharacter(characterName);
		
		CharacterEquipment playerEq	= new CharacterEquipment(playerOne);
		
		Equipment testHelmet		= new Armour("Test Helmet", "head", 10, 0, 1, 20);//name,equipmentSlot, requiredStrength, requiredIntelligence, requiredLevel, armourValue
		
		playerOne.characterEquipment.equip(testHelmet);
		
		System.out.println(playerOne.characterEquipment);
		playerOne.characterEquipment.showCharacterEquipment();
	}

}
