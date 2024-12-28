package game_files;

import java.util.HashMap;

public class CharacterLevels {

	private static final int MAX_LEVEL = 50;
	private static final HashMap<Integer, Integer> expMap = new HashMap<>();

	static {
		for (int i = 1; i <= MAX_LEVEL; i++) {
			expMap.put(i, i*500);
		}
	}
	
	public static int getExpMap(int level) {
		if (expMap.containsKey(level)) {
			return expMap.get(level);
		} else {
		 System.out.println("Invalid value. "+level+" is not contained in CharacterLevels.");
		 return -1;
		}
	}
}
