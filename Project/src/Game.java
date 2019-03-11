
public class Game {

	private Map grid;
	private Player player;
	private Enemy e;
	private Wave wave;
	private UI pickTower;
	//private ScienceTower tower;
	
	public Game(int[][] map)
	{
		grid = new Map(map);
		player = new Player(grid);
		e = new Enemy(Graphics.QuickLoad("enemy"), grid.GetTile(1, 2), grid, 64, 64, 12);
		wave = new Wave(10, e);
		setupUI();
		//tower = new ScienceTower(Graphics.QuickLoad("cannonBase"), grid.GetTile(3, 3), 10);
	}
	
	private void setupUI()
	{
		pickTower = new UI();
		pickTower.addButton("ScienceTowe", "sTower", 1344, 128);
	}
	
	public void update()
	{
		Graphics.DrawQuadTex(Graphics.QuickLoad("selectorBackground"), 1280, 0, 520, 960);
		grid.Draw();
		player.Update();
		Time.Update();
		wave.Update();
		pickTower.draw();
		//tower.draw();
		
	}
	
	
}
