package game;
import java.util.HashMap;

public class CharacterEquipment {
	
	private Character equipmentOwner;
	private HashMap <String, Equipment> characterEquipment;
	
	
	public CharacterEquipment(Character character) {
		this.equipmentOwner = character;
		characterEquipment  = new HashMap<>();
		characterEquipment.put("head",		null);
		characterEquipment.put("neck",		null);
		characterEquipment.put("shoulder",	null);
		characterEquipment.put("chest", 	null);
		characterEquipment.put("belt", 		null);
		characterEquipment.put("legs", 		null);
		characterEquipment.put("feet", 		null);
		characterEquipment.put("wrist",		null);
		characterEquipment.put("gloves", 	null);
		characterEquipment.put("ring", 		null);
		characterEquipment.put("trinket", 	null);
		characterEquipment.put("cloak", 	null);
		characterEquipment.put("mainHand", 	null);
		characterEquipment.put("offHand", 	null);
	}
	
	
	
}
