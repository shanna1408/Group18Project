import org.newdawn.slick.opengl.Texture;

public class ScienceTower {

	private float x, y;
	private int width, height, damage;
	private Texture texture;
	private Tile startTile;
	
	public ScienceTower(Texture tex, Tile sTile, int damage)
	{
		this.texture = tex;
		this.startTile = sTile;
		this.damage = damage;
		this.x = sTile.getX();
		this.y = sTile.getY();
		this.width = (int) sTile.getWidth();
		this.height = (int) sTile.getHeight();
	}
	
	public void update()
	{
		draw();
	}
	
	public void draw()
	{
		Graphics.DrawQuadTex(texture, x, y, width, height);
	}
	
}
