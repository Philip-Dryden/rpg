package game;

public class Armour extends Equipment {
	
	private int armourValue;

	public int getArmourValue() {
		return armourValue;
	}


	public Armour (String name, int requiredStrength, int requiredIntelligence, int requiredLevel, int armourValue) {
		super(name, requiredStrength, requiredIntelligence, requiredLevel);
		this.armourValue = armourValue;
		
	}

}
