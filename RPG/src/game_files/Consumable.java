package game_files;

public class Consumable extends Item{
	
	private int restoredHealth;
	private int restoredMana;
	
	public Consumable (String name, int restoredHealth, int restoredMana) {
		super (name);
		this.restoredHealth	= restoredHealth;
		this.restoredMana	= restoredMana;
		
	}

}
