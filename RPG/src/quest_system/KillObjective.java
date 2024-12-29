package quest_system;

public class KillObjective extends QuestObjective {
	
	private String killTarget;
	private int requiredKills;
	private int killCount;
	
	public String getKillTarget() {
		return killTarget;
	}
	public int getRequiredKills() {
		return requiredKills;
	}
	public int getKillCount() {
		return killCount;
	}
	
	public KillObjective(String objectiveName, String killTarget, int requiredKills){
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
