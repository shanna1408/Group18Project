
public class Game {

	private Map grid;
	private Player player;
	
	public Game(int[][] map)
	{
		grid = new Map(map);
		player = new Player(grid);
	}
	
	public void update()
	{
		grid.Draw();
		
	}
	
	
}
