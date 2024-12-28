package game_files;

public abstract class Item {
	
	protected String name;
//	protected int value;
//	protected int stackSize;
	
	
	public String getName() {
		return name;
	}
/*	public int getValue() {
		return value;
	}
	public int getStackSize() {
		return stackSize;
	}
*/	
	public Item (String name) {
		this.name	=	name;
	}
}
