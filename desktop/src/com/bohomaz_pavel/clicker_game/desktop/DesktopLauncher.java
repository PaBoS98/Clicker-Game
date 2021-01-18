package com.bohomaz_pavel.clicker_game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bohomaz_pavel.clicker_game.ClickerGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Clicker Game";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new ClickerGame(), config);
	}
}
