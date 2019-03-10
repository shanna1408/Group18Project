import java.util.Scanner;

public class Player {
	
	private Map grid;
	
	Scanner keyboard = new Scanner(System.in);
	
	public Player(Map grid) {
		this.grid = grid;
		
	}
	
	/*
	public void SetTile(int x, int y) {
		if (grid.GetTile(x, y).getType() == TileType.Buildable) {
			grid.SetTile(x, y, TileType.Tower);
		}
		else {
			System.out.println("You cannot build here because this tile is not buildable.");
			Update();
		}
		
		
	}
	
	public void Update()
    {
        System.out.print("Where do you want to build a tower? (Input x value, then y value.)");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        if (x < 10 && x > -1 && y < 10 && y > -1)
        	SetTile(x, y);
        else {
        	System.out.println("Please enter two integers within the bounds of the grid.");
        	Update();
        }
    }
    */
}
