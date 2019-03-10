public class Map {
	
	public Tile[][] grid;
	
	public Map() {
		grid = new Tile[20][15];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				// each element of grid = 64x64 pixels at given spot with Snow tile type
				grid[i][j] = new Tile(i*64, j*64, 64, 64, TileType.Snow);
			}
		}
	}
	
	public Map(int[][] newGrid) {
		grid = new Tile[20][15];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				switch (newGrid[j][i]) {
				case 0:
					grid[i][j] = new Tile(i*64, j*64, 64, 64, TileType.Snow);
					break;
				case 1:
					grid[i][j] = new Tile(i*64, j*64, 64, 64, TileType.Path);
					break;
				}
			}
		}
	}
	
	
	

	public void SetTile(int x, int y, TileType type) {
		grid[x][y] = new Tile(x*64, y*64, 64, 64, type);
	}
	
	public Tile GetTile(int xPlace, int yPlace) {
		return grid[xPlace][yPlace];
	}
	
	
	
	
	
	public void Draw() {
        for (int i=0; i < grid.length; i++) {
        	for (int j = 0; j < grid[i].length; j++) {
        		Graphics.DrawQuadTex(grid[i][j].getTexture(), grid[i][j].getX(), grid[i][j].getY(), grid[i][j].getWidth(), grid[i][j].getHeight());
        	}
        }
	}
}
	