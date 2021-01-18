package com.bohomaz_pavel.clicker_game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.bohomaz_pavel.clicker_game.game_screen.Start;

public class ClickerGame extends Game {

	public SpriteBatch batch;
	public BitmapFont font;

	@Override
	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		setScreen(new Start(this));
	}

	public void render() {
		super.render();
	}

	public void dispose() {
		batch.dispose();
		font.dispose();
	}
}
