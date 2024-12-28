package game_files;

public class PlayerCharacter extends Character {
	
	private int exp;
	private int maxExpThisLevel;
	private int skillPoints;
	
	public int getExp() {
		return exp;
	}
	
	public int getMaxExpThisLevel() {
		return maxExpThisLevel;
	}
	
	public int getSkillPoints() {
		return skillPoints;
	}

	public PlayerCharacter(String name) {
		super(name,1, 40, 20, 10, 10);//name, level, maxHealth, maxMana, strength, intelligence
		this.exp = 0;
		this.maxExpThisLevel = CharacterLevels.getExpMap(this.level);
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
		this.skillPoints += 10;
		this.maxHealth += 12;
		this.currentHealth = this.maxHealth;
		this.currentMana = this.maxMana;
	}
	

		
		
	}


