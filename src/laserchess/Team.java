package laserchess;

public class Team {

	// Members
	
	private String name;
	private Piece[] pieces;
	
	// Constructors
	
	public Team() {
		this("Unnamed", new Piece[0]);
	}
	
	public Team(String name) {
		this(name, new Piece[0]);
	}
	
	public Team(String name, Piece[] pieces) {
		this.name = name;
		this.pieces = pieces;
	}
	
	// Accessor Methods
	
	public Piece[] getPieces() {
		return pieces;
	}
	
	public String getName() {
		return name;
	}
	
	// Mutator Methods
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addPiece(Piece piece) {
		Piece[] temp = new Piece[pieces.length + 1];
		for (int x = 0; x < pieces.length; x++) {
			temp[x] = pieces[x];
		}
		temp[temp.length - 1] = piece;
		pieces = temp;
		piece.setTeam(this);
	}
	
	public void removePiece(Piece piece) {
		int position = -1;
		for (int x = 0; x < pieces.length; x++) {
			if (pieces[x].equals(piece)) {
				position = x;
				break;
			}
		}
		if (position != -1) {
			Piece[] temp = new Piece[pieces.length - 1];
			for (int x = 0; x < pieces.length; x++) {
				if (x != position) {
					temp[x] = pieces[x];
				}
			}
		} else {
			//System.out.println("Did not find piece " + piece.getPosition() + " on team to remove.");
		}
	}

}
