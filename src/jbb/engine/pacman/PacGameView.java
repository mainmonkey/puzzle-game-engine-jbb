package jbb.engine.pacman;

import jbb.engine.BoardView;

public class PacGameView extends BoardView {

	public PacGameView(PacWorld board) {
		super(board);
	}
	
	public static void main(String[] args) {
		PacWorld pw = new PacWorld();
		@SuppressWarnings("unused")
		PacGameView game = new PacGameView(pw);
	}

}