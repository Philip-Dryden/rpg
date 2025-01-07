package game_files;
import quest_system.Quest;
import quest_system.QuestLog;
import quest_system.KillObjective;

import java.util.Scanner;

public class NewGame {

	public static void main(String args[]) {
		
		Scanner playerInput = new Scanner(System.in);
		
		System.out.println("Welcome! Please enter your name!");
		
		String characterName = playerInput.nextLine();
		
		PlayerCharacter playerOne	= new PlayerCharacter(characterName);
		
		CharacterEquipment playerEq	= new CharacterEquipment(playerOne);
		
		Equipment testHelmet		= new Armour("Test Helmet", "head", 10, 0, 1, 20);//name,equipmentSlot, requiredStrength, requiredIntelligence, requiredLevel, armourValue
		Equipment testChest			= new Armour("Test Chest", "chest", 10, 0, 1, 50);
		Weapon testSword			= new Weapon("Sword", "mainHand",25, 0,0,0);
		playerOne.characterEquipment.equip(testSword);
		playerOne.characterEquipment.equip(testHelmet);
		playerOne.characterEquipment.equip(testChest);
		playerOne.characterEquipment.showCharacterEquipment();
		System.out.println("******************************");
		System.out.println("Total Armour Value: "+playerOne.characterEquipment.getArmourValue());
		
		
		Weapon orcWeapon			= new Weapon("Orc Axe", "mainHand", 10, 0, 0, 1);
		Equipment orcArmour			= new Armour("Orc Armour", "chest", 0, 0, 0, 110);
		NonPlayerCharacter orc 		= new NonPlayerCharacter("Orc Warrior", 1, 100, 0, 5, 0);
		CharacterEquipment orcEq	= new CharacterEquipment(orc);	
		orc.characterEquipment.equip(orcWeapon);
		orc.characterEquipment.equip(orcArmour);
		

		
		Quest testQuest				= new Quest("kill an Orc");
		KillObjective testKill		= new KillObjective("Orc killed", "Orc Warrior", 1);
		KillObjective testKill2		= new KillObjective("5 Wolfs killed", "Wolf", 5);
		testQuest.addKillObjective(testKill);
		testQuest.addKillObjective(testKill2);
		QuestLog.addQuest(testQuest);
		

		Combat testCombat			= new Combat(playerOne, orc);
		testCombat.startCombat();
		
		
		
		System.out.println(testQuest.getIsCompleted());
		for (KillObjective killObjective: testQuest.getKillObjectiveList()) {
			System.out.println(killObjective.getObjectiveName());
			System.out.println(killObjective.getKillTarget());
			System.out.println(killObjective.getRequiredKills());
			System.out.println(killObjective.getKillCount());
			System.out.println(killObjective.getIsCompleted());
			System.out.println("******************************");
		}
		
		System.out.println(testQuest.getIsCompleted());
		testQuest.checkAllKillObjectives();
		System.out.println(testQuest.getIsCompleted());
		
		for (int i = 0; i < 5; i++) {
			System.out.println("******************************");
			System.out.println("new Wolf");
			playerOne.healCompletely();
			Weapon wolfFangs			= new Weapon("Wolf Fangs", "mainHand", 5, 0, 0, 1);
			NonPlayerCharacter wolf		= new NonPlayerCharacter("Wolf", 1, 100, 0, 5, 0);
			CharacterEquipment wolfEq	= new CharacterEquipment(wolf);
			wolf.characterEquipment.equip(wolfFangs);
			Combat test2Combat			= new Combat(playerOne, wolf);
			test2Combat.startCombat();
			System.out.println("killed NPC is: "+test2Combat.getNonPlayerCharacter().getName());
			
			System.out.println(testQuest.getIsCompleted());
			
			testQuest.checkAllKillObjectives();
			System.out.println(testQuest.getIsCompleted());
		}
		
	
	}

}
