
import org.newdawn.slick.opengl.Texture;

public enum TowerType {

	sTower(new Texture[]{Graphics.QuickLoad("sTower")}, 10, 10);
	
	Texture[] texture;
	int damage, range;
	
	TowerType(Texture[] texture, int damage, int range)
	{
		this.texture = texture;
		this.damage = damage;
		this.range = range;
	}
}
