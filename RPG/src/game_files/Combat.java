package game_files;

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
		System.out.println(attacker.getName()+" attacks "+defender.getName()+" with "+attacker.characterEquipment.getEquippedWeapon("mainHand").getName()+" and deals "+dmg+" damage.");
		//later this will include damage mitigation like armour
		defender.takeDamage(this, attacker, dmg);
		
	}
	
	public void attackResult(Character attacker, Character defender, int damage) {
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
			//TODO: generate Loot, Exp and add Quest functionality
			npcAlive = false;
			
		}
		else {System.out.println("Error: Variable deadFighter is neither player nor npc: "+deadFighter);}
	}

}
