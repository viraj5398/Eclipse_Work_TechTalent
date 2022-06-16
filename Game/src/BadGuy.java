
public class BadGuy extends Character {
	
	String vehicle;
	int currX = 3, currY = 3;
	
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
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
	
	BadGuy(){};
	
	public BadGuy(String name, int health, String vehicle)
	{
		super(name, health);
		this.vehicle =vehicle;
		
	}
	
	public void printInfo()
	{
		System.out.println("Name: "+ this.name +"Health: "+ this.health + "Vehicle : "+ this.getVehicle());
	}
	
}
