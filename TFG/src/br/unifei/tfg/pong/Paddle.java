package br.unifei.tfg.pong;

import java.awt.Graphics;

public interface Paddle {

	public void draw(Graphics g);
	public void move();
	public int getY();
	
}
