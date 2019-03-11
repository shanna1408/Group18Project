import org.lwjgl.input.Mouse;
import org.newdawn.slick.opengl.Texture;


public class MainMenu {

	private Texture background;
	private UI menuUI;
	
	public MainMenu()
	{
		background = Graphics.QuickLoad("mainmenu");
		menuUI = new UI();
		menuUI.addButton("Play", "playButton", Graphics.WIDTH / 2 -128, (int) (Graphics.HEIGHT * 0.45f));
		//menuUI.addButton("Editor", "editorButton", Graphics.WIDTH / 2 -128, (int) (Graphics.HEIGHT * 0.55f));
		menuUI.addButton("Quit", "quitButton", Graphics.WIDTH / 2 -128, (int) (Graphics.HEIGHT * 0.55f));
	}
	
	private void updateButtons()
	{
		if(Mouse.isButtonDown(0))
		{
			if(menuUI.isButtonClicked("Play"))
			{
				StateManager.setState(StateManager.GameState.GAME);
			}
		}
	}
	
	public void update()
	{
		Graphics.DrawQuadTex(background, 0, 0, 2048, 1024);
		menuUI.draw();
		updateButtons();
	}
	
}
