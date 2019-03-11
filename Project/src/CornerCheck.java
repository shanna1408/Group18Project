
public class CornerCheck {
	
	private Tile tile;
	private int xDirection, yDirection;
	
	public CornerCheck(Tile tile, int xDirection, int yDirection) {
		this.tile = tile;
		this.xDirection = xDirection;
		this.yDirection = yDirection;
	}
	
	
	public Tile getTile() {
		return tile;
	}
	
	public int getXDirection() {
		return xDirection;
	}
	
	public int getYDirection() {
		return yDirection;
	}
	
}
