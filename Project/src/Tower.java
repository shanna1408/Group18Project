import org.newdawn.slick.opengl.Texture;

public abstract class Tower implements Default{
	
	private float x, y;
	private int width, height, damage;
	private Enemy target;
	private Texture[] textures;
	
	public Tower(TowerType type, Tile sTile)
	{
		this.textures = type.texture;
		this.damage = type.damage;
		this.x = sTile.getX();
		this.y = sTile.getY();
		this.width = sTile.getWidth();
		this.height = sTile.getHeight();
	}
	
	@Override
	public float getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	@Override
	public float getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}

	@Override
	public void setX(float x) {
		// TODO Auto-generated method stub
		this.x = x;
		
	}

	@Override
	public void setY(float y) {
		// TODO Auto-generated method stub
		this.y = y;
		
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		this.width = width;
		
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		this.height = height;
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		for(int i = 0; i < textures.length; i++)
			Graphics.DrawQuadTex(textures[i], x, y, width, height);
		
	}
	
}
