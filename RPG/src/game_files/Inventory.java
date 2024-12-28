package game_files;
import java.util.ArrayList;

public class Inventory {
	
//	private int inventorySlots;
	private ArrayList<Item> inventory;
	private Character inventoryOwner;
	
	public Inventory(Character inventoryOwner) {
		this.inventory 		= new ArrayList<>();
		this.inventoryOwner	= inventoryOwner;
		inventoryOwner.setInventory(this);
	}
	
	public void addItem(Item item) {
		inventory.add(item);
	}
	
	public void removeItem(int indexNumber) {
		inventory.remove(indexNumber);
	}
	
	public void showInventory() {
		System.out.println("Inventory:");
		System.out.println("*********:");
		for (int i = 0; i < inventory.size(); i++) {
			Item item = inventory.get(i);
			System.out.println("Entry number "+i+" "+item.getName());
		}
	}
	

}
