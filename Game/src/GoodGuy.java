
public class GoodGuy extends Character {

	private String power;
	int currX = 3;
	int currY = 2;
	
	
	
	public String getpower() {
		return power;
	}
	
	public void setpower(String power) {
		this.power = power;
	}
	
	public int getCurrX() {
		return currX;
	}
	public void setCurrX(int currX) {
		this.currX = currX;
	}
	public int getCurrY() {
		return currY;
	}
	public void setCurrY(int currY) {
		this.currY = currY;
	}

	GoodGuy(){};
	
	public GoodGuy(String name, int health, String catchphrase)
	{
		super(name, health);
		this.power = power;
		
	}
	
	public void printInfo()
	{
		System.out.println("Name: "+ this.name +"Health: "+ this.health + "power: "+ this.power );
	}
	
	
	
}
