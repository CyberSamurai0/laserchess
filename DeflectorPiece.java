package laserChess;

public class DeflectorPiece extends Piece {

	public DeflectorPiece() {
		// TODO Auto-generated constructor stub
	}

	public DeflectorPiece(int orientation) {
		super(orientation);
		// TODO Auto-generated constructor stub
	}

	public DeflectorPiece(Team team, int orientation) {
		super(team, orientation);
		// TODO Auto-generated constructor stub
	}

	public DeflectorPiece(Team team, int orientation, Board board) {
		super(team, orientation, board);
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return "Deflector";
	}

}
