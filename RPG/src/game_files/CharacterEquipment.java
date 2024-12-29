package game_files;
import java.util.HashMap;
import java.util.Map;

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
	
	public void equip(Equipment equipment){	
		if (canEquip(equipment)) {
			String slot = equipment.getEquipmentSlot();
			if (characterEquipment.containsKey(slot)) {
				characterEquipment.put(slot, equipment);
				System.out.println("Successfully equipped "+equipment.getName()+"!");
			} else {
				System.out.println("Can't equip "+equipment+" since HashMap doesn't contain its equipment slot "+equipment.getEquipmentSlot());
			}
		} else {
			System.out.println("Can't equip "+equipment.getName()+" because the requirements aren't met.");
		}
	}
	
	private Boolean canEquip(Equipment equipment) {
		if (equipment.getRequiredStrength() 	<= equipmentOwner.getStrength()		 && 
			equipment.getRequiredIntelligence() <= equipmentOwner.getIntelligence()	 &&
			equipment.getRequiredLevel() 		<= equipmentOwner.getLevel()) {
				return true;
			} else {
				return false;
				}
	}
	public void showCharacterEquipment() {
		for (Map.Entry<String, Equipment> entry: characterEquipment.entrySet()) {
			if (entry.getValue() == null) {
				System.out.println("Equipment Slot "+entry.getKey()+" is empty!");
			} else {
			System.out.println("Equipment Slot "+entry.getKey()+" contains "+entry.getValue().getName());
			}
		}
	}
	public Equipment getEquipmentSlot(String equipmentSlot) {
		return characterEquipment.get(equipmentSlot);
	}
	public Weapon getEquippedWeapon(String weaponSlot) {
		return (Weapon)characterEquipment.get(weaponSlot);
	}
}

	

