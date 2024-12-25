package game;

public class Weapon {

	private String name;
	private int damage;
	private int requiredStrength;
	private int requiredIntelligence;
	private int requiredLevel;
	
	public String getName() {
		return name;
	}
	public int getDamage() {
		return damage;
	}
	public int getRequiredStrength() {
		return requiredStrength;
	}
	public int getRequiredIntelligence() {
		return requiredIntelligence;
	}
	public int getRequiredLevel() {
		return requiredLevel;
	}
	
	public Weapon(String name, int damage, int requiredStrength, int requiredIntelligence, int requiredLevel) {
		super();
		this.name = name;
		this.damage = damage;
		this.requiredStrength = requiredStrength;
		this.requiredIntelligence = requiredIntelligence;
		this.requiredLevel = requiredLevel;
	}
	

}
