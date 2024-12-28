package src.game;

public class Armour extends Equipment {
	
	private int armourValue;

	public int getArmourValue() {
		return armourValue;
	}


	public Armour (String name, String equipmentSlot, int requiredStrength, int requiredIntelligence, int requiredLevel, int armourValue) {
		super(name, equipmentSlot, requiredStrength, requiredIntelligence, requiredLevel);
		this.armourValue = armourValue;
		
	}

}
