package quest_system;
import game_files.NonPlayerCharacter;

public class KillObjective extends QuestObjective {
	
	private NonPlayerCharacter killTarget;
	private int requiredKills;
	private int killCount;
	
	public NonPlayerCharacter getKillTarget() {
		return killTarget;
	}
	public int getRequiredKills() {
		return requiredKills;
	}
	public int getKillCount() {
		return killCount;
	}
	
	public KillObjective(String objectiveName, NonPlayerCharacter killTarget, int requiredKills){
		super(objectiveName);
		this.killTarget		= killTarget;
		this.requiredKills	= requiredKills;
		this.killCount		= 0;
	}
	
	public void increaseKillCount () {
		++killCount;
		checkIfCompleted();
	}
	
	public void checkIfCompleted () {
		if (killCount  >= requiredKills) {
			isCompleted = true;
		}
	}
	
	

}
