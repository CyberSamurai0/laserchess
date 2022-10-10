package laserChess;

public class LaserCannonPiece extends Piece {

	public LaserCannonPiece() {
		// TODO Auto-generated constructor stub
	}

	public LaserCannonPiece(int orientation) {
		super(orientation);
		// TODO Auto-generated constructor stub
	}

	public LaserCannonPiece(Team team, int orientation) {
		super(team, orientation);
		// TODO Auto-generated constructor stub
	}

	public LaserCannonPiece(Team team, int orientation, Board board) {
		super(team, orientation, board);
		// TODO Auto-generated constructor stub
	}
	
	public boolean move(int row, int col) {
		return false;
	}
	
	public boolean setOrientation(int orientation) {
		if (this.getTeam().getName() == "Blue" && this.getOrientation() == 0 || this.getOrientation() == 3) {
			super.setOrientation(orientation);
			return true;
		} else if (this.getTeam().getName() == "Red" && this.getOrientation() == 1 || this.getOrientation() == 2) {
			super.setOrientation(orientation);
			return true;
		}
		return false;
	}
	
	public boolean rotate() {
		if (this.getTeam().getName() == "Blue" && this.getOrientation() == 0) {
			super.setOrientation(3);
			return true;
		} else if (this.getTeam().getName() == "Blue" && this.getOrientation() == 3) {
			super.setOrientation(0);
			return true;
		} else if (this.getTeam().getName() == "Red" && this.getOrientation() == 1) {
			super.setOrientation(2);
			return true;
		} else if (this.getTeam().getName() == "Red" && this.getOrientation() == 2) {
			super.setOrientation(1);
			return true;
		}
		return false;
	}
	
	public class LaserBeam {
		
		private Board board;
		private int row;
		private int col;
		private int orientation;
		private boolean debug = false; // Toggle on in class to demonstrate algorithm

		public LaserBeam(Board board, int row, int col, int orientation) {
			this.board = board;
			this.row = row;
			this.col = col;
			this.orientation = orientation;
		}
		
		public Piece step() {
			char[] yvals = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
			String[] orientations = {"up", "right", "down", "left"};
			if (orientation == 0) {
				row -= 1; // Step
				if (row < 0) return null; // If goes off board
				if (debug) System.out.println("[DEBUG] " + yvals[col] + (row + 1) + " facing " + orientations[orientation]);
				Piece p = board.getPiece(row, col);
				if (p == null) return step();
				else {
					int result = checkPiece(p);
					if (result == 0) {
						return p;
					} else if (result == 1) {
						return null;
					} else {
						return step();
					}
				}
			} else if (orientation == 1) {
				col += 1; // Step
				if (col >= board.getLayout()[0].length) return null; // If goes off board
				if (debug) System.out.println("[DEBUG] " + yvals[col] + (row + 1) + " facing " + orientations[orientation]);
				Piece p = board.getPiece(row, col);
				if (p == null) return step();
				else {
					int result = checkPiece(p);
					if (result == 0) {
						return p;
					} else if (result == 1) {
						return null;
					} else {
						return step();
					}
				}
			} else if (orientation == 2) {
				row += 1; // Step
				if (row >= board.getLayout().length) return null; // If goes off board
				if (debug) System.out.println("[DEBUG] " + yvals[col] + (row + 1) + " facing " + orientations[orientation]);
				Piece p = board.getPiece(row, col);
				if (p == null) return step();
				else {
					int result = checkPiece(p);
					if (result == 0) {
						return p;
					} else if (result == 1) {
						return null;
					} else {
						return step();
					}
				}
			} else if (orientation == 3) {
				col -= 1; // Step
				if (col < 0) return null; // If goes off board
				if (debug) System.out.println("[DEBUG] " + yvals[col] + (row + 1) + " facing " + orientations[orientation]);
				Piece p = board.getPiece(row, col);
				if (p == null) return step();
				else {
					int result = checkPiece(p);
					if (result == 0) {
						return p;
					} else if (result == 1) {
						return null;
					} else {
						return step();
					}
				}
			}
			
			return null;
		}
		
		private int checkPiece(Piece p) {
			String[] orientations = {"up", "right", "down", "left"};
			if (p instanceof KingPiece) return 0;
			else if (p instanceof DefenderPiece) {
				if (debug) {System.out.println("[DEBUG] DefenderPiece facing " + orientations[p.getOrientation()]);}
				if (Math.abs(p.getOrientation() - orientation) == 2) {
					return 1;
				} else return 0;
			} else if (p instanceof DeflectorPiece) {
				if (debug) {System.out.println("[DEBUG] DeflectorPiece facing " + orientations[p.getOrientation()]);}
				if ((p.getOrientation() == 2 && orientation == 0) || (p.getOrientation() == 1 && orientation == 3) || (p.getOrientation() == 3 && orientation == 1) || (p.getOrientation() == 0 && orientation == 2)) {
					rotate(-1);
					return 2;
				} else if ((p.getOrientation() == 1 && orientation == 0) || (p.getOrientation() == 2 && orientation == 1) || (p.getOrientation() == 3 && orientation == 2) || (p.getOrientation() == 0 && orientation == 3)) {
					rotate(1);
					return 2;
				} else return 0;
			} else if (p instanceof SwitchPiece) {
				if (debug) {System.out.println("[DEBUG] SwitchPiece facing " + orientations[p.getOrientation()]);}
				if (p.getOrientation() == 0) {
					if (orientation == 0 || orientation == 2) {
						rotate(-1);
						return 2;
					} else {
						rotate(1);
						return 2;
					}
				} else {
					if (orientation == 0 || orientation == 2) {
						rotate(1);
						return 2;
					} else {
						rotate(-1);
						return 2;
					}
				}
			} else if (p instanceof LaserCannonPiece) return 1;
			else return 0;
		}
		
		private void rotate(int amt) {
			String[] orientations = {"up", "right", "down", "left"};
			if (debug) System.out.println("[DEBUG] Laser moving " + orientations[orientation]);
			orientation += amt;
			if (orientation < 0) orientation += 4;
			else if (orientation >= 4) orientation -= 4;
			if (debug) System.out.println("[DEBUG] Laser reflected " + orientations[orientation]);
		}

	}
	
	public Piece fire() {
		Board b = this.getBoard();
		LaserBeam beam = new LaserBeam(b, b.locatePiece(this)[0], b.locatePiece(this)[1], this.getOrientation());
		
		return beam.step();
	}
	
	public String getName() {
		return "Cannon";
	}

}
