package game_files;

public abstract class Character {

	protected int id;
	protected static int idCounter = 0;
	protected String name;
	protected int level;
	protected int maxHealth;
	protected int currentHealth;
	protected int maxMana;
	protected int currentMana;
	protected int strength;
	protected int intelligence;
	protected Inventory inventory;
	protected CharacterEquipment characterEquipment;
	
	public Character(String name, int level, int maxHealth, int maxMana, int strength, int intelligence) {
		this.id					= ++idCounter;
		this.level				= level;
		this.name				= name;
		this.maxHealth			= maxHealth;
		this.currentHealth		= maxHealth;
		this.maxMana			= maxMana;
		this.currentMana		= maxMana;	
		this.strength			= strength;
		this.intelligence		= intelligence;
		this.inventory			= new Inventory(this);
		this.characterEquipment = new CharacterEquipment(this);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}
	
	public int getCurrentHealth() {
		return currentHealth;
	}
	
	public void healCompletely() {
		this.currentHealth = this.maxHealth;
	}
	
	public int getMaxMana() {
		return maxMana;
	}
	
	public int getCurrentMana() {
		return currentMana;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	
	public void setInventory (Inventory inventory) {
		this.inventory = inventory;
	}
		
	public int takeDamage(Combat combat, Character attacker, int damage) {
		currentHealth -= damage;
		combat.attackResult(attacker, this, damage);
		if (currentHealth <= 0) {
			combat.killFighter(this);
		}
		return currentHealth;
	}
	
}
