package game;

public class PlayerCharacter extends Character {
	
	private int exp;
	private int maxExpThisLevel;
	
	public int getMaxExpThisLevel() {
		return maxExpThisLevel;
	}

	public PlayerCharacter() {
		super();
		this.level = 1;
		this.exp = 0;
		this.maxExpThisLevel = CharacterLevels.getExpMap(this.level);
	}
	
	public int getExp() {
		return exp;
	}
	
	public void gainExp(int exp) {
		this.exp += exp;
		if (this.exp >= this.maxExpThisLevel) {
			levelUp();
		}
	}
	
	private void levelUp() {
		this.exp -=  this.maxExpThisLevel;
		++this.level;
		this.maxExpThisLevel = CharacterLevels.getExpMap(this.level);
	}

}
