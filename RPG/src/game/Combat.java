package game;
import java.util.Scanner;

public class Combat {
	
	private PlayerCharacter player;
	private NonPlayerCharacter npc;
	private int rounds;
	
	public Combat (PlayerCharacter player, NonPlayerCharacter npc) {
		this.player	= player;
		this.npc	= npc;
	}
	
	public void startCombat () {
		do {
			combatRound();
		}		
		while (player.getCurrentHealth() > 0 && npc.getCurrentHealth() > 0);
	}
	
	private void combatRound() {	
		++rounds;
		playerTurn();
		npcTurn();		
	}
	
	private void playerTurn() {
		String playerCombatAbilities [] = new String [] {"Attack"};
		Scanner combatInput = new Scanner(System.in);
		System.out.println("Your Turn!");
		System.out.println("----------");
		for (int i = 0; i < playerCombatAbilities.length; i++) {
			System.out.println(playerCombatAbilities[i]+"["+i+"]");
		}
		String playerChoice = combatInput.nextLine();
		if (playerChoice.equals("Attack")) {
			attack(player, npc); 
		}
		combatInput.close();
		//unfinished
		
	}
	
	private void npcTurn() {}
	
	private void attack(Character attacker, Character defender) {
		
	int dmg = attacker.weapon.getDamage() + attacker.getStrength();
	System.out.println(attacker+" attacks "+defender+" with "+attacker.weapon+" and deals "+dmg+" damage.");
	//later this will include damage mitigation like armour
	defender.takeDamage(dmg);
	System.out.println(defender+" loses "+dmg+" Health Points and now has "+defender.getCurrentHealth()+" Health Points left.");
		
		
	}

}
