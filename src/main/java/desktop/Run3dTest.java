package desktop;

import static graphics.Constants.screenHeight;
import static graphics.Constants.screenWidth;
import graphics.Basic3DTest;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Run3dTest {

	public static void main(String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = screenWidth;
		config.height = screenHeight;

    new LwjglApplication(new Basic3DTest(), config);
	}

}
