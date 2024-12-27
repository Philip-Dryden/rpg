package game;

public class Equipment extends Item {
	
	protected int requiredStrength;
	protected int requiredIntelligence;
	protected int requiredLevel;
//	protected int bonusStrength;
//	protected int bonusIntelligence;
	
	
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
	public Equipment(String name, int requiredStrength, int requiredIntelligence, int requiredLevel) {
		super (name);
		this.requiredStrength 		= requiredStrength;
		this.requiredIntelligence	= requiredIntelligence;
		this.requiredLevel			= requiredLevel;
	}
}
