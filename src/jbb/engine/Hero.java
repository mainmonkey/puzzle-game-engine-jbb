/**
 * Hero is the user controlled character in the game. It collects points.
 */

package jbb.engine;

import javax.swing.ImageIcon;

public abstract class Hero extends Avatar {
	
	private int points;
	
	public Hero(ImageIcon image, int lives, Position position, Board board) {
		super(image, lives, position, board);
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
