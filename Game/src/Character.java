
public class Character {

	public String name;
	public int health;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	Character(String name, int health)
	{
		this.name = name;
		this.health = health;
	}
	
	Character()
	{
		
	}
	
	public void printInfo()
	{
		System.out.println("Name: "+ this.name +"Health: "+ this.health);
	}
	
	
	
}
