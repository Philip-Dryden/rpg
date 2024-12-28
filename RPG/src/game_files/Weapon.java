package game;

public class Weapon extends Equipment {

	private int damage;

	public int getDamage() {
		return damage;
	}

	public Weapon(String name, String equipmentSlot, int damage, int requiredStrength, int requiredIntelligence, int requiredLevel) {
		super(name, equipmentSlot, requiredStrength, requiredIntelligence, requiredLevel);
		this.damage = damage;
	}
	

}
