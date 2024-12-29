package quest_system;

import java.util.ArrayList;

public class QuestLog {

	private static ArrayList<Quest> activeQuests	= new ArrayList<>();
	private static ArrayList<Quest> finishedQuests	= new ArrayList<>();
	private static ArrayList<Quest> failedQuests	= new ArrayList<>();
	
	public static void addQuest(Quest quest) {
		activeQuests.add(quest);
	}
	public static void finishQuest(Quest quest) {
		finishedQuests.add(quest);
		activeQuests.remove(quest);
	}
	public static void failQuest(Quest quest) {
		failedQuests.add(quest);
		activeQuests.remove(quest);
	}
	
	public static void checkForKillTarget(String killedNPC) {
			for (Quest quest: activeQuests) {
				for (KillObjective killObjective: quest.getKillObjectiveList()) {
					if (killObjective.getKillTarget() == killedNPC) {
						killObjective.increaseKillCount();
						System.out.println("Kill Count of "+killObjective.getObjectiveName()+ " has increased by 1!");
						System.out.println("Kill Count of "+killObjective.getObjectiveName()+ " is now "+killObjective.getKillCount());
						checkQuest(quest);
					}
				}
			}
	}
	
	public static void checkQuest(Quest quest) {
		quest.checkAllKillObjectives();
		if (quest.getIsCompleted()) {
			System.out.println(quest.getQuestName()+" is completed!");
		} else {
			System.out.println(quest.getQuestName()+" is not completed yet!");
		}
		
	}
				
			
			
			
			
			
	
	
}
