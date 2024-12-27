package game;

public class Weapon extends Equipment {

	private int damage;

	public int getDamage() {
		return damage;
	}

	public Weapon(String name, int damage, int requiredStrength, int requiredIntelligence, int requiredLevel) {
		super(name, requiredStrength, requiredIntelligence, requiredLevel);
		this.damage = damage;
	}
	

}
