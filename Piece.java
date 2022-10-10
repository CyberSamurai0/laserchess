package laserChess;

public class Piece {

	// Members
	
	private Board board;
	private Team team;
	private int orientation;
	
	// Constructors
	
	public Piece() {
		this(new Team("Unassigned"), 0);
	}
	
	public Piece(int orientation) {
		this(new Team("Unassigned"), orientation, null);
	}
	
	public Piece(Team team, int orientation) {
		this(team, orientation, null);
	}
	
	public Piece(Team team, int orientation, Board board) {
		team.addPiece(this);
		this.orientation = orientation;
		this.board = board;
	}
	
	// Accessor Methods
	
	public Board getBoard() {
		return board;
	}
	
	public Team getTeam() {
		return team;
	}
	
	public int getOrientation() {
		return orientation;
	}
	
	public String getName() {
		return "Piece";
	}
	
	// Mutator Methods
	
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public boolean move(int row, int col) {
		return board.move(this, row, col);
	}
	
	public boolean setOrientation(int orientation) {
		this.orientation = orientation;
		return true;
	}
	
	

}
