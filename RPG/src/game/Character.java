package game;

public abstract class Character {

	protected int id;
	protected String name;
	protected int level;
	protected int maxHealth;
	protected int currentHealth;
	protected int maxMana;
	protected int currentMana;
	protected int strength;
	protected int intelligence;
	//private Weapon weapon;
	
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
	/*
	public Weapon getWeapon() {
		return weapon;
	}
	*/

	
	

	/*
	public abstract void triggerEquipWeapon();
	
	public void equipWeapon(Weapon weapon) {
		if (weapon != null && canEquipWeapon(weapon)) {
		setWeapon(weapon);
		} else {
			System.out.println("Can't equip this weapon.");
		}
	}
	
	private boolean canEquipWeapon(Weapon weapon) {
		if (weapon.getRequiredStrength() <= getStrength() && 
			weapon.getRequiredIntelligence() <= getIntelligence() &&
			weapon.getRequiredLevel() <= getLevel()) {
			return true;
		} else {
			return false;
			}
		}
	
	private void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	*/
}
