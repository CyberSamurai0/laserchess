package laserChess;

public class DefenderPiece extends Piece {

	public DefenderPiece() {
		// TODO Auto-generated constructor stub
	}

	public DefenderPiece(int orientation) {
		super(orientation);
		// TODO Auto-generated constructor stub
	}

	public DefenderPiece(Team team, int orientation) {
		super(team, orientation);
		// TODO Auto-generated constructor stub
	}

	public DefenderPiece(Team team, int orientation, Board board) {
		super(team, orientation, board);
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return "Defender";
	}

}
