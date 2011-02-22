package jbb.engine;

import javax.swing.ImageIcon;

public abstract class Hero extends Avatar {
	
	private int points;
	
	public Hero(ImageIcon image, int hitPoints, int lives, Board board, Position position) {
		super(image, hitPoints, lives, board, position);
		points = 0;
	}
	
	public void addPoints(int amount) {
		points += amount;
	}
	
	public void subtractPoints(int amount) {
		points -= amount;
	}
	
	public int getPoints() {
		return points;
	}
	
}
