import java.io.IOException;
import java.util.Scanner;

public class Map 
{
	
	int currX, currY;
	
	Scanner sc = new Scanner(System.in);
	GoodGuy g = new GoodGuy();
	BadGuy ba = new BadGuy();
	
	
	public void currentPosition()
	{
		System.out.println(" Current Position of GoodGuy : "+ g.getCurrX() + "*" + g.getCurrY());
	
		System.out.println(" Current Position of GoodGuy : "+ ba.getCurrX() + "*" + ba.getCurrY());
	
		
	}
	
	
	int winx;
	int winy;
	
	public void WinningPosition()
	{
//		try {
			System.out.println("Winning X value : ");
			winx = sc.nextInt();
		System.out.println("Winning Y value : ");
		winy = sc.nextInt();
	}
	
	
	Float distG, distB;
	public void HowFar()
	{
		int a = winx - g.getCurrX();
		int b = winy - g.getCurrY();
		int c = winx - ba.getCurrX();
		int d = winy - ba.getCurrY();
		
		
		
		distG = (float) Math.abs(Math.sqrt(a^2 + b^2));
		
		System.out.println(" Distance need to travel by good guy for winning position :  " + distG);
		
		
		
		distB = (float) Math.abs( Math.sqrt(c^2 + d^2));
		
		System.out.println(" Distance need to travel by Bad guy for winning position :  " + distB);
	}
		
	

	
	
	public void nextStep(char Direction) throws Exception
	{
		
	
		
		if(Direction == 'N')
		{
			g.setCurrY(g.getCurrY()+1);
			if(g.getCurrX() == winx && g.getCurrY() == winy)
			{
				
				System.out.println("Winnerrrr!");
				
			}
			else
			{
				
				System.out.println("play hard!!!");
			}
		}
		else if(Direction == 'S')
		{
			g.setCurrY(g.getCurrY()-1);
			if(g.getCurrX() == winx && g.getCurrY() == winy)
			{
				System.out.println("Winnerrrr!");
				
			}
			else
			{
				
				System.out.println("play hard!!!");
			}
		}
		else if(Direction == 'W')
		{
			g.setCurrX(g.getCurrX()-1);
			if(g.getCurrX() == winx && g.getCurrY() == winy)
			{
				System.out.println("Winnerrrr!");
			}
			else
			{
				
				System.out.println("play hard!!!");
			}
		}
		else if(Direction == 'E')
		{
			g.setCurrX(g.getCurrX()+1);
			if(g.getCurrX() == winx && g.getCurrY() == winy)
			{
				
				System.out.println("Winnerrrr!");
			}
			else
			{
				
				System.out.println("play hard!!!");
			}
		}
		
	else
	{	
			System.out.println("There is no direction like this!");
	
	}
	
	
	}
	
}
