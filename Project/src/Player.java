import java.util.ArrayList;
import java.util.Scanner;

import org.lwjgl.input.Mouse;

public class Player {
	
	private Map grid;
	private boolean leftClick;
	private ArrayList<ScienceTower> towerList;
	
	
	public Player(Map grid) {
		this.grid = grid;
		this.leftClick = false;
		this.towerList = new ArrayList<ScienceTower>();
		
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
		
		
	}*/
	
	
	
	public void Update()
    {
		for (ScienceTower t : towerList)
		{
			t.update();
		}
		/*
        System.out.print("Where do you want to build a tower? (Input x value, then y value.)");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        if (x < 10 && x > -1 && y < 10 && y > -1)
        	SetTile(x, y);
        else {
        	System.out.println("Please enter two integers within the bounds of the grid.");
        	Update();
        }*/
		
		if(Mouse.isButtonDown(0) && !leftClick && grid.GetTile(Mouse.getX() / 64, (Graphics.HEIGHT - Mouse.getY() -1) / 64).getType() == TileType.Snow)
		{
			towerList.add(new ScienceTower(Graphics.QuickLoad("sTower"), grid.GetTile(Mouse.getX() / 64, (Graphics.HEIGHT - Mouse.getY() -1) / 64), 10));
		}
		leftClick = Mouse.isButtonDown(0);
    }
    
}
