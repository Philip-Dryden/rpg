package game_files;

import quest_system.QuestLog;

public class Combat {
	
	private PlayerCharacter player;
	private NonPlayerCharacter npc;
	private boolean playerAlive;
	private boolean npcAlive;
	private int rounds;
	
	public  NonPlayerCharacter getNonPlayerCharacter () {
		return npc;
	}
	
	public Combat (PlayerCharacter player, NonPlayerCharacter npc) {
		this.player	= player;
		this.npc	= npc;
		playerAlive = true;
		npcAlive	= true;
		rounds		= 0;
	}
	
	public void startCombat () {
		do {
			combatRound();
		}		
		while (playerAlive == true && npcAlive == true);
	}
	
	private void combatRound() {//TODO: Replace this with a better system with less redundancies
								//one central check if both are still alive should be enough
		while (playerAlive == true && npcAlive == true) {
			++rounds;
			playerTurn();		
			npcTurn();		
		} ;
	}
	
	private void playerTurn() {
		if (playerAlive == true && npcAlive == true) {
			attack(player, npc);
		}
	}
	
	public void npcTurn() {	
		if (playerAlive == true && npcAlive == true) {
			attack(npc, player);
		}
	}
	
	public void attack(Character attacker, Character defender) {
		int dmg = attacker.characterEquipment.getEquippedWeapon("mainHand").getDamage() + attacker.getStrength(); 
		double damageMitigation = defender.characterEquipment.getArmourValue() / 10;
		int damageResult = (int) Math.round(dmg * (1 - damageMitigation / 100));	
		int damagePrevented = dmg - damageResult;
		System.out.println(attacker.getName()+" attacks "+defender.getName()+" with "+attacker.characterEquipment.getEquippedWeapon("mainHand").getName()+" and deals "+dmg+" damage.");
		System.out.println(defender.getName()+"'s armour prevents "+damagePrevented+".");
		System.out.println(defender.getName()+" takes "+damageResult+" damage.");
		defender.takeDamage(this, attacker, damageResult);
		
	}
	
	public void attackResult(Character attacker, Character defender, double damage) {
		System.out.println(defender.getName()+" loses "+damage+" Health Points and now has "+defender.getCurrentHealth()+" Health Points left.");	
	}
	
	public void killFighter (Character deadFighter) {
		System.out.println(deadFighter.getName()+" has died!"); 
		if (deadFighter == player){
			System.out.println("Game Over!");
			//TODO: gameOver method
			playerAlive = false;
		}
		else if (deadFighter == npc) {
			System.out.println("Victory!");
			QuestLog.checkForKillTarget(deadFighter.getName());//informs the QuestLog that this NPC was killed and lets it check if this is relevant to a Quest Objective
			//TODO: generate Loot, Exp and add Quest functionality
			npcAlive = false;
			
		}
		else {System.out.println("Error: Variable deadFighter is neither player nor npc: "+deadFighter);}
	}

}
