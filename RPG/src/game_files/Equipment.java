package game_files;

public class Equipment extends Item {
	
	protected String equipmentSlot;
	protected int requiredStrength;
	protected int requiredIntelligence;
	protected int requiredLevel;
//	protected int bonusStrength;
//	protected int bonusIntelligence;
	
	public String getEquipmentSlot() {
		return equipmentSlot;
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
/*	public int getBonusStrength() {
		return bonusStrength;
	}
	public int getBonusIntelligence() {
		return bonusIntelligence;
	}
*/	
	public Equipment(String name, String equipmentSlot, int requiredStrength, int requiredIntelligence, int requiredLevel) {
		super (name);
		this.equipmentSlot			= equipmentSlot;
		this.requiredStrength 		= requiredStrength;
		this.requiredIntelligence	= requiredIntelligence;
		this.requiredLevel			= requiredLevel;
	}
}
