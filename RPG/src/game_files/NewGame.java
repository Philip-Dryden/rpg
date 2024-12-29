package game_files;
import quest_system.Quest;
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
		Weapon testSword			= new Weapon("Sword", "mainHand",25, 0,0,0);
		playerOne.characterEquipment.equip(testSword);
		playerOne.characterEquipment.equip(testHelmet);

		
		System.out.println(playerOne.characterEquipment);
		playerOne.characterEquipment.showCharacterEquipment();
		System.out.println("******************************");
		Weapon orcWeapon			= new Weapon("Orc Axe", "mainHand", 10, 0, 0, 1);
		NonPlayerCharacter orc 		= new NonPlayerCharacter("Orc Warrior", 1, 100, 0, 5, 0);
		CharacterEquipment orcEq	= new CharacterEquipment(orc);
		orc.characterEquipment.equip(orcWeapon);
		

		
		Quest testQuest				= new Quest("kill an Orc");
		KillObjective testKill		= new KillObjective("Orc killed", "Orc Warrior", 1);
		KillObjective testKill2		= new KillObjective("5 Wolfs killed", "Wolf", 5);
		testQuest.addKillObjective(testKill);
		testQuest.addKillObjective(testKill2);
		for (KillObjective killObjective: testQuest.getKillObjectiveList()) {
			System.out.println(killObjective.getObjectiveName());
			System.out.println(killObjective.getKillTarget());
			System.out.println(killObjective.getRequiredKills());
			System.out.println(killObjective.getKillCount());
			System.out.println(killObjective.getIsCompleted());
			System.out.println("******************************");
		}


		Combat testCombat			= new Combat(playerOne, orc);
		testCombat.startCombat();
		System.out.println("killed NPC is: "+testCombat.getNonPlayerCharacter().getName());
		for (KillObjective killObjective: testQuest.getKillObjectiveList()) {
			if (killObjective.getKillTarget() == testCombat.getNonPlayerCharacter().getName()) {
				killObjective.increaseKillCount();
				System.out.println("Kill Count of "+killObjective.getObjectiveName()+ " has increased by 1!");
			}
		}
		
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
		
		for (int i = 0; i < 7; i++) {
			System.out.println("******************************");
			System.out.println("new Wolf");
			playerOne.healCompletely();
			Weapon wolfFangs			= new Weapon("Wolf Fangs", "mainHand", 5, 0, 0, 1);
			NonPlayerCharacter wolf		= new NonPlayerCharacter("Wolf", 1, 10, 0, 5, 0);
			CharacterEquipment wolfEq	= new CharacterEquipment(wolf);
			wolf.characterEquipment.equip(wolfFangs);
			Combat test2Combat			= new Combat(playerOne, wolf);
			test2Combat.startCombat();
			System.out.println("killed NPC is: "+test2Combat.getNonPlayerCharacter().getName());
			for (KillObjective killObjective: testQuest.getKillObjectiveList()) {
				if (killObjective.getKillTarget() == test2Combat.getNonPlayerCharacter().getName()) {
					killObjective.increaseKillCount();
					System.out.println("Kill Count of "+killObjective.getObjectiveName()+ " has increased by 1!");
					System.out.println("Kill Count of "+killObjective.getObjectiveName()+ " is now "+killObjective.getKillCount());
				}
			}
			System.out.println(testQuest.getIsCompleted());
			
			testQuest.checkAllKillObjectives();
			System.out.println(testQuest.getIsCompleted());
		}
		
	}

}
