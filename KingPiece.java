package laserChess;

public class KingPiece extends Piece {

	public KingPiece() {
		// TODO Auto-generated constructor stub
	}

	public KingPiece(int orientation) {
		super(orientation);
		// TODO Auto-generated constructor stub
	}

	public KingPiece(Team team) {
		super(team, 0);
		// TODO Auto-generated constructor stub
	}
	
	public KingPiece(Team team, Board board) {
		super(team, 0, board);
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return "King";
	}
	
	public boolean setOrientation(int orientation) {
		return false;
	}

}
