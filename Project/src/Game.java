
public class Game {

	private Map grid;
	private Player player;
	private Enemy e;
	private Wave wave;
	//private ScienceTower tower;
	
	public Game(int[][] map)
	{
		grid = new Map(map);
		player = new Player(grid);
		e = new Enemy(Graphics.QuickLoad("enemy"), grid.GetTile(1, 2), grid, 64, 64, 12);
		wave = new Wave(10, e);
		//tower = new ScienceTower(Graphics.QuickLoad("cannonBase"), grid.GetTile(3, 3), 10);
	}
	
	public void update()
	{
		grid.Draw();
		player.Update();
		Time.Update();
		wave.Update();
		//tower.draw();
		
	}
	
	
}
