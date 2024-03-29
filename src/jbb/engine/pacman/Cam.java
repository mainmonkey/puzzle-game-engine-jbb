package jbb.engine.pacman;

import javax.swing.ImageIcon;

import jbb.engine.Board;
import jbb.engine.Position;


@SuppressWarnings("serial")
public class Cam extends Ghost {

	public Cam(Position position, Board board) {
		super(new ImageIcon("img/Ghost-C.png"),position, board);
	}
	
	
	@Override
	/**
	 * basic NPC movement
	 */
	public Position getNextPosition(Position position) {
		return super.getNextPosition(position);
	}
	//copy constructor
	public Cam(Cam cam){
		this(new Position(cam.position.getRow(), cam.position.getCol()), cam.board);
		this.setLives(cam.getLives());
	}

}
