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
	
}
