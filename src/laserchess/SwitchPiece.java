package laserchess;

public class SwitchPiece extends Piece {

	public SwitchPiece() {
		// TODO Auto-generated constructor stub
	}

	public SwitchPiece(int orientation) {
		super(orientation);
		// TODO Auto-generated constructor stub
	}

	public SwitchPiece(Team team, int orientation) {
		super(team, orientation);
		// TODO Auto-generated constructor stub
	}

	public SwitchPiece(Team team, int orientation, Board board) {
		super(team, orientation, board);
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return "Switch";
	}
	
	public boolean setOrientation(int orientation) {
		if (Math.abs(this.getOrientation() - orientation) % 2 == 1) {
			return super.setOrientation(orientation);
		}
		return false;
	}

}
