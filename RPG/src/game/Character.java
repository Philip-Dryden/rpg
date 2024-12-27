package game;

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
	protected Weapon weapon;
	protected Inventory inventory;
	
	public Character(String name, int level, int maxHealth, int maxMana, int strength, int intelligence) {
		this.id				= ++idCounter;
		this.level			= level;
		this.name			= name;
		this.maxHealth		= maxHealth;
		this.currentHealth	= maxHealth;
		this.maxMana		= maxMana;
		this.currentMana	= maxMana;	
		this.strength		= strength;
		this.intelligence	= intelligence;
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
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	
	public void setInventory (Inventory inventory) {
		this.inventory = inventory;
	}
	
	public void equipWeapon(Weapon weapon) {
		if (weapon != null && canEquipWeapon(weapon)) {
		setWeapon(weapon);
		} else {
			System.out.println("Can't equip this weapon.");
		}
	}
	
	protected boolean canEquipWeapon(Weapon weapon) {
		if (weapon.getRequiredStrength() <= getStrength() && 
			weapon.getRequiredIntelligence() <= getIntelligence() &&
			weapon.getRequiredLevel() <= getLevel()) {
			return true;
		} else {
			return false;
			}
		}
	
	protected void setWeapon(Weapon weapon) {
		this.weapon = weapon;
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
