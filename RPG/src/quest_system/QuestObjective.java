package quest_system;

public abstract class QuestObjective {

	protected String objectiveName;
	protected boolean isCompleted;

	public String getObjectiveName() {
		return objectiveName;
	}
	
	public boolean getIsCompleted() {
		return isCompleted;
	}
	
	public QuestObjective(String objectiveName) {
		
		this.objectiveName	= objectiveName;	
		this.isCompleted	= false;
	}
}
