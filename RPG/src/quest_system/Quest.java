package quest_system;

import java.util.ArrayList;

public class Quest {
	
	private String questName;
	private boolean isCompleted;//all objectives completed
	private boolean isFinished;//quest delivered and finished
	private ArrayList<KillObjective> killObjectiveList;
	//one arraylist for any type of QuestObjective (kill, fetch, dialogue)
	
	public String getQuestName() {
		return questName;
	}
	public boolean getIsCompleted() {
		return isCompleted;
	}
	
	public void checkAllKillObjectives () {
		boolean allKillObjectivesCompleted = true;
		for (KillObjective killObjective: killObjectiveList) {
			if (killObjective.getIsCompleted() == false) {
				allKillObjectivesCompleted = false;
			}
		}
		isCompleted = allKillObjectivesCompleted;
	}
	
	public boolean getIsFinished() {
		return isFinished;
	}
	public ArrayList<KillObjective> getKillObjectiveList() {
		return killObjectiveList;
	}
	
	public Quest(String questName) {
		this.questName			= questName;
		this.killObjectiveList	= new ArrayList<KillObjective>();
	}
	
	public void addKillObjective (KillObjective killObjective) {
		killObjectiveList.add(killObjective);
	}

	
	
	

}
