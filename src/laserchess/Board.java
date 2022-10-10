package laserchess;

public class Board {
	
	private Piece[][] layout = new Piece[8][10];
	private Team teamBlue = new Team("Blue");
	private Team teamRed = new Team("Red");
	private Team currentTeam = null;
	private Team winner = null;

	public Board() {
		this("ace");
	}
	
	public void setupAce() {
		currentTeam = teamRed;
		
		// TEAM RED
		layout[0][0] = new LaserCannonPiece(teamRed, 2, this);
		
		layout[0][4] = new DefenderPiece(teamRed, 2, this);
		layout[0][5] = new KingPiece(teamRed, this);
		layout[0][6] = new DefenderPiece(teamRed, 2, this);
		layout[0][7] = new DeflectorPiece(teamRed, 1, this);
		
		layout[1][2] = new DeflectorPiece(teamRed, 2, this);
		
		layout[3][0] = new DeflectorPiece(teamRed, 0, this);
		layout[3][4] = new SwitchPiece(teamRed, 0, this);
		layout[3][5] = new SwitchPiece(teamRed, 1, this);
		layout[3][7] = new DeflectorPiece(teamRed, 1, this);
		
		layout[4][0] = new DeflectorPiece(teamRed, 1, this);
		layout[4][7] = new DeflectorPiece(teamRed, 0, this);
		
		layout[5][6] = new DeflectorPiece(teamRed, 1, this);
		
		// TEAM BLUE
		layout[7][9] = new LaserCannonPiece(teamBlue, 0, this);
		
		layout[7][2] = new DeflectorPiece(teamBlue, 3, this);
		layout[7][3] = new DefenderPiece(teamBlue, 0, this);
		layout[7][4] = new KingPiece(teamBlue, this);
		layout[7][5] = new DefenderPiece(teamBlue, 0, this);
		
		layout[6][7] = new DeflectorPiece(teamBlue, 0, this);
		
		layout[4][2] = new DeflectorPiece(teamBlue, 3, this);
		layout[4][4] = new SwitchPiece(teamBlue, 1, this);
		layout[4][5] = new SwitchPiece(teamBlue, 0, this);
		layout[4][9] = new DeflectorPiece(teamBlue, 2, this);
		
		layout[3][2] = new DeflectorPiece(teamBlue, 2, this);
		layout[3][9] = new DeflectorPiece(teamBlue, 3, this);
		
		layout[2][3] = new DeflectorPiece(teamBlue, 3, this);
	}
	
	public void setupCuriosity() {
		currentTeam = teamRed;
		
		// TEAM RED
		layout[0][0] = new LaserCannonPiece(teamRed, 2, this); //
		
		layout[0][4] = new DefenderPiece(teamRed, 2, this); //
		layout[0][5] = new KingPiece(teamRed, this); //
		layout[0][6] = new DefenderPiece(teamRed, 2, this); //
		layout[0][7] = new SwitchPiece(teamRed, 1, this); //
		
		layout[2][6] = new DeflectorPiece(teamRed, 0, this); //
		
		layout[3][0] = new DeflectorPiece(teamRed, 0, this); //
		layout[3][5] = new SwitchPiece(teamRed, 1, this);
		layout[3][8] = new DeflectorPiece(teamRed, 1, this); //
		
		layout[4][0] = new DeflectorPiece(teamRed, 1, this); //
		layout[4][5] = new DeflectorPiece(teamRed, 3, this); //
		layout[4][8] = new DeflectorPiece(teamRed, 0, this); //
		
		layout[5][6] = new DeflectorPiece(teamRed, 1, this);
		
		// TEAM BLUE
		layout[7][9] = new LaserCannonPiece(teamBlue, 0, this);
		
		layout[7][2] = new SwitchPiece(teamBlue, 1, this); //
		layout[7][3] = new DefenderPiece(teamBlue, 0, this); // 
		layout[7][4] = new KingPiece(teamBlue, this); //
		layout[7][5] = new DefenderPiece(teamBlue, 0, this); //
		
		layout[5][3] = new DeflectorPiece(teamBlue, 2, this);
		
		layout[4][1] = new DeflectorPiece(teamBlue, 3, this); //
		layout[4][4] = new SwitchPiece(teamBlue, 1, this);
		
		layout[4][9] = new DeflectorPiece(teamBlue, 2, this);
		
		layout[3][1] = new DeflectorPiece(teamBlue, 2, this); //
		layout[3][4] = new DeflectorPiece(teamBlue, 1, this); //
		layout[3][9] = new DeflectorPiece(teamBlue, 3, this); //
		
		layout[2][3] = new DeflectorPiece(teamBlue, 3, this); //
	}
	
	public void setupGrail() {
		currentTeam = teamRed;
		
		// TEAM RED
		layout[0][0] = new LaserCannonPiece(teamRed, 2, this);
		
		layout[0][4] = new DeflectorPiece(teamRed, 2, this);
		layout[0][5] = new DefenderPiece(teamRed, 2, this);
		layout[0][6] = new DeflectorPiece(teamRed, 1, this);
		
		layout[1][5] = new KingPiece(teamRed, this);
		
		layout[2][0] = new DeflectorPiece(teamRed, 0, this);
		layout[2][4] = new DeflectorPiece(teamRed, 2, this);
		layout[2][5] = new DefenderPiece(teamRed, 2, this);
		layout[2][6] = new SwitchPiece(teamRed, 1, this);
		
		layout[3][0] = new DeflectorPiece(teamRed, 1, this);
		layout[3][2] = new SwitchPiece(teamRed, 0, this);
		
		layout[4][3] = new DeflectorPiece(teamRed, 3, this);
		layout[4][5] = new DeflectorPiece(teamRed, 1, this);
		
		// TEAM BLUE
		layout[7][9] = new LaserCannonPiece(teamBlue, 0, this);
		
		layout[7][3] = new DeflectorPiece(teamBlue, 3, this);
		layout[7][4] = new DefenderPiece(teamBlue, 0, this);
		layout[7][5] = new DeflectorPiece(teamBlue, 0, this);
		
		layout[6][4] = new KingPiece(teamBlue, this);
		
		layout[5][3] = new SwitchPiece(teamBlue, 1, this);
		layout[5][4] = new DefenderPiece(teamBlue, 0, this);
		layout[5][5] = new DeflectorPiece(teamBlue, 0, this);
		layout[5][9] = new DeflectorPiece(teamBlue, 2, this);
		
		layout[4][7] = new SwitchPiece(teamBlue, 0, this);
		layout[4][9] = new DeflectorPiece(teamBlue, 3, this);
		
		layout[3][4] = new DeflectorPiece(teamBlue, 3, this);
		layout[3][6] = new DeflectorPiece(teamBlue, 1, this);
	}
	
	public void setupMercury() {
		currentTeam = teamRed;
		
		// TEAM RED
		layout[0][0] = new LaserCannonPiece(teamRed, 1, this);
		
		layout[0][4] = new DeflectorPiece(teamRed, 2, this);
		layout[0][5] = new KingPiece(teamRed, this);
		layout[0][6] = new DeflectorPiece(teamRed, 1, this);
		
		layout[1][5] = new DefenderPiece(teamRed, 2, this);
		layout[1][6] = new DeflectorPiece(teamRed, 1, this);
		
		layout[2][0] = new DeflectorPiece(teamRed, 1, this);
		layout[2][3] = new SwitchPiece(teamRed, 1, this);
		layout[2][5] = new DefenderPiece(teamRed, 2, this);
		
		layout[3][0] = new DeflectorPiece(teamRed, 0, this);
		
		layout[4][1] = new DeflectorPiece(teamRed, 0, this);
		layout[4][5] = new DeflectorPiece(teamRed, 1, this);
		
		layout[7][0] = new SwitchPiece(teamRed, 1, this);
		
		// TEAM BLUE
		layout[7][9] = new LaserCannonPiece(teamBlue, 3, this);
		
		layout[7][3] = new DeflectorPiece(teamBlue, 3, this);
		layout[7][4] = new KingPiece(teamBlue, this);
		layout[7][5] = new DeflectorPiece(teamBlue, 0, this);
		
		layout[6][3] = new DeflectorPiece(teamBlue, 3, this);
		layout[6][4] = new DefenderPiece(teamBlue, 0, this);
		
		layout[5][4] = new DefenderPiece(teamBlue, 0, this);
		layout[5][6] = new SwitchPiece(teamBlue, 1, this);
		layout[5][9] = new DeflectorPiece(teamBlue, 3, this);
		
		layout[4][9] = new DeflectorPiece(teamBlue, 2, this);
		
		layout[3][4] = new DeflectorPiece(teamBlue, 3, this);
		layout[3][8] = new DeflectorPiece(teamBlue, 2, this);
		
		layout[0][9] = new SwitchPiece(teamBlue, 1, this);
	}

	public void setupSophie() {
		currentTeam = teamRed;
		
		// TEAM RED
		layout[0][0] = new LaserCannonPiece(teamRed, 2, this);
		
		layout[0][4] = new KingPiece(teamRed, this);
		layout[0][6] = new DeflectorPiece(teamRed, 1, this);
		
		layout[1][3] = new DefenderPiece(teamRed, 2, this);
		layout[1][5] = new DefenderPiece(teamRed, 1, this);
		
		layout[2][0] = new DeflectorPiece(teamRed, 0, this);
		layout[2][4] = new DeflectorPiece(teamRed, 2, this);
		layout[2][5] = new DeflectorPiece(teamRed, 1, this);
		
		layout[3][7] = new SwitchPiece(teamRed, 0, this);
		
		layout[5][0] = new DeflectorPiece(teamRed, 1, this);
		layout[5][2] = new SwitchPiece(teamRed, 1, this);
		
		layout[6][0] = new DeflectorPiece(teamRed, 0, this);
		
		layout[7][4] = new DeflectorPiece(teamRed, 1, this);
		
		// TEAM BLUE
		layout[7][9] = new LaserCannonPiece(teamBlue, 0, this);
		
		layout[7][3] = new DeflectorPiece(teamBlue, 3, this);
		layout[7][5] = new KingPiece(teamBlue, this);
		
		layout[6][4] = new DefenderPiece(teamBlue, 3, this);
		layout[6][6] = new DefenderPiece(teamBlue, 0, this);
		
		layout[5][4] = new DeflectorPiece(teamBlue, 3, this);
		layout[5][5] = new DeflectorPiece(teamBlue, 0, this);
		layout[5][9] = new DeflectorPiece(teamBlue, 2, this);
		
		layout[4][2] = new SwitchPiece(teamBlue, 0, this);
		
		layout[2][7] = new SwitchPiece(teamBlue, 1, this);
		layout[2][9] = new DeflectorPiece(teamBlue, 3, this);

		layout[2][9] = new DeflectorPiece(teamBlue, 2, this);
		
		layout[0][5] = new DeflectorPiece(teamBlue, 3, this);
	}
	
	public Board(String startLayout) {
		if (startLayout.toLowerCase().equals("ace")) {
			setupAce();
		} else if (startLayout.toLowerCase().equals("curiosity")) {
			setupCuriosity();
		} else if (startLayout.toLowerCase().equals("grail")) {
			setupGrail();
		} else if (startLayout.toLowerCase().equals("mercury")) {
			setupMercury();
		} else if (startLayout.toLowerCase().equals("sophie")) {
			setupSophie();
		} else {
			setupAce();
		}
		this.toString(true);
		System.out.println("Let us begin.");
		this.getCurrentTeamName(true);
	}
	
	public Piece[][] getLayout() {
		return layout;
	}
	
	public Piece getPiece(int row, int col) {
		if (row >= 0 && row < layout.length && col >= 0 && col < layout[row].length) {
			return layout[row][col];
		}
		return null;
	}
	
	public Team getCurrentTeam() {
		return currentTeam;
	}
	
	public String getCurrentTeamName(boolean print) {
		if (print) System.out.println("It's " + currentTeam.getName() + "'s Turn!");
		return currentTeam.getName();
	}
	
	public boolean move(int row_init, int col_init, int row_final, int col_final) {
		return move(getPiece(row_init, col_init), row_final, col_final);
	}
	
	public boolean move(Piece p, int row, int col) {
		// Check if within board
		if (row >= 0 && row < layout.length && col >= 0 && col < layout[row].length && p != null) {
			// Check if within one tile
			if (Math.abs(locatePiece(p)[0] - row) <= 1 && Math.abs(locatePiece(p)[1] - col) <= 1) {
				// If red helix
				if (col == 0 || (col == 8 && (row == 0 || row == 7))) {
					if (p.getTeam() == teamRed) {
						// If destination is open
						if (layout[row][col] == null) {
							int[] old = locatePiece(p);
							layout[row][col] = p;
							layout[old[0]][old[1]] = null;
							return true;
						// Else if swappable
						} else if (layout[row][col] instanceof SwitchPiece) {
							if (layout[row][col].getTeam().getName() == p.getTeam().getName() && p instanceof DefenderPiece || p instanceof DeflectorPiece) {
								int[] old = locatePiece(p);
								layout[old[0]][old[1]] = layout[row][col];
								layout[row][col] = p;
								return true;
							}
						} else if (layout[row][col].getTeam().getName() == p.getTeam().getName() && layout[row][col] instanceof DefenderPiece || layout[row][row] instanceof DeflectorPiece) {
							if (p instanceof SwitchPiece) {
								int[] old = locatePiece(p);
								layout[old[0]][old[1]] = layout[row][col];
								layout[row][col] = p;
								return true;
							}
						}
					} else {
						return false;
					}
				// White Helix
				} else if (col == 9 || (col == 1 && (row == 0 || row == 7))) {
					if (p.getTeam() == teamBlue) {
						// If destination is open
						if (layout[row][col] == null) {
							int[] old = locatePiece(p);
							layout[row][col] = p;
							layout[old[0]][old[1]] = null;
							return true;
						// Else if swappable
						} else if (layout[row][col].getTeam() == p.getTeam() && layout[row][col] instanceof SwitchPiece) {
							if (p instanceof DefenderPiece || p instanceof DeflectorPiece) {
								int[] old = locatePiece(p);
								layout[old[0]][old[1]] = layout[row][col];
								layout[row][col] = p;
								return true;
							}
						} else if (layout[row][col].getTeam() == p.getTeam() && layout[row][col] instanceof DefenderPiece || layout[row][col] instanceof DeflectorPiece) {
							if (p instanceof SwitchPiece) {
								int[] old = locatePiece(p);
								layout[old[0]][old[1]] = layout[row][col];
								layout[row][col] = p;
								return true;
							}
						}
					} else {
						return false;
					}
				}
				// If not helix, check if destination is open
				else if (layout[row][col] == null) {
					int[] old = locatePiece(p);
					layout[row][col] = p;
					layout[old[0]][old[1]] = null;
					return true;
				// Else if swappable
				} else if (layout[row][col] instanceof SwitchPiece) {
					if (p instanceof DefenderPiece || p instanceof DeflectorPiece) {
						int[] old = locatePiece(p);
						layout[old[0]][old[1]] = layout[row][col];
						layout[row][col] = p;
						return true;
					}
				} else if (layout[row][col] instanceof DefenderPiece || layout[row][col] instanceof DeflectorPiece) {
					if (p instanceof SwitchPiece) {
						int[] old = locatePiece(p);
						layout[old[0]][old[1]] = layout[row][col];
						layout[row][col] = p;
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public void moveFriendly(char col_init, int row_init, char col_final, int row_final) {
		
		char[] col_vals = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		int ncol_init = -1;
		int ncol_final = -1;
		for (int p = 0; p < col_vals.length; p++) {
			if (col_vals[p] == col_init) ncol_init = p;
			if (col_vals[p] == col_final) ncol_final = p;
		}
		
		if (ncol_init == -1 || ncol_final == -1 || row_init - 1 >= layout.length || row_init - 1 < 0 || row_final - 1 >= layout.length || row_final - 1 < 0) {
			System.out.println("Attempted to move but received invalid input values!");
		} else if (Math.abs(row_init - row_final) > 1 && Math.abs(col_init - col_final) > 1) {
			System.out.println("Could not move " + col_init + row_init + " to " + col_final + row_final + " (Too far!)");
		} else if (getPiece(row_init - 1, ncol_init) == null) {
			System.out.println("Could not move " + col_init + row_init + " to " + col_final + row_final + " (No piece to move!)");
		} else if (getPiece(row_init - 1, ncol_init).getTeam() != currentTeam) {
			System.out.println("Could not move " + col_init + row_init + " to " + col_final + row_final + " (Not their piece!)");
		} else if (getPiece(row_final - 1, ncol_final) != null && getPiece(row_final - 1, ncol_final).getTeam() != currentTeam) {
			System.out.println("Could not swap " + col_init + row_init + " with " + col_final + row_final + " (Destination occupied by enemy!)");
		} else {
			boolean res = getPiece(row_init - 1, ncol_init).move(row_final - 1, ncol_final);
			if (res) {
				System.out.println("Moved " + col_init + row_init + " (" + getPiece(row_final - 1, ncol_final).getName() + ") to " + col_final + row_final + ".");
				endTurn();
			}
			else System.out.println("Could not move " + col_init + row_init + " to " + col_final + row_final + ".");
		}
	}
	
	public void rotateFriendly(char col, int row, String dir) {
		char[] col_vals = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		int ncol = -1;
		for (int p = 0; p < col_vals.length; p++) {
			if (col_vals[p] == col) ncol = p;
		}
		
		if (this.getPiece(row - 1, ncol) == null) System.out.println("There is no piece at " + col + row + " to rotate.");
		else if (ncol == -1 || row - 1 >= layout.length || row - 1 < 0) System.out.println("Attempted to rotate but received an invalid position!");
		else if (dir.toLowerCase().equals("up")) {
			Piece p = getPiece(row - 1, ncol);
			if (p.setOrientation(0)) {
				System.out.println("Successfully rotated the " + p.getName() + " at " + col + row + " to face up.");
				endTurn();
			} else {
				System.out.println("The " + p.getName() + " at " + col + row + " cannot be rotated to face up.");
			}
		} else if (dir.toLowerCase().equals("right")) {
			Piece p = getPiece(row - 1, ncol);
			if (p.setOrientation(1)) {
				System.out.println("Successfully rotated the " + p.getName() + " at " + col + row + " to face right.");
				endTurn();
			} else {
				System.out.println("The " + p.getName() + " at " + col + row + " cannot be rotated to face right.");
			}
		} else if (dir.toLowerCase().equals("down")) {
			Piece p = getPiece(row - 1, ncol);
			if (p.setOrientation(2)) {
				System.out.println("Successfully rotated the " + p.getName() + " at " + col + row + " to face down.");
				endTurn();
			} else {
				System.out.println("The " + p.getName() + " at " + col + row + " cannot be rotated to face down.");
			}
		} else if (dir.toLowerCase().equals("left")) {
			Piece p = getPiece(row - 1, ncol);
			if (p.setOrientation(3)) {
				System.out.println("Successfully rotated the " + p.getName() + " at " + col + row + " to face left.");
				endTurn();
			} else {
				System.out.println("The " + p.getName() + " at " + col + row + " cannot be rotated to face left.");
			}
		} else System.out.println("Attempted to rotate but received an invalid direction! Please use 'up', 'down', 'left', or 'right'.");
	}
	
	public int[] locatePiece(Piece p) {
		for (int row = 0; row < layout.length; row++)
			for (int col = 0; col < layout[row].length; col++) {
				if (layout[row][col] != null && layout[row][col].equals(p))
					return new int[] {row, col};
			}
		return null;
	}
	
	public void endTurn() {
		System.out.println("Rotating and firing the laser to end turn.");
		
		for (Piece p: currentTeam.getPieces()) {
			if (p instanceof LaserCannonPiece) {
				((LaserCannonPiece) p).rotate();
				Piece hitPiece = ((LaserCannonPiece) p).fire();
				if (hitPiece == null) {
					System.out.println("No pieces were hit by the laser.");
				} else if (hitPiece.getTeam() == currentTeam) {
					char[] rows = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
					System.out.println("Uh oh! " + currentTeam.getName() + " hit their own " + hitPiece.getName() + " at " + rows[locatePiece(hitPiece)[1]] + (locatePiece(hitPiece)[0] + 1) + ".");
					destroy(hitPiece);
				} else {
					char[] rows = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
					System.out.println("Nice! " + currentTeam.getName() + " hit their opponent's " + hitPiece.getName() + " at " + rows[locatePiece(hitPiece)[1]] + (locatePiece(hitPiece)[0] + 1) + ".");
					destroy(hitPiece);
				}
			}
		}
		
		if (currentTeam != null) {
			if (currentTeam.equals(teamBlue)) currentTeam = teamRed;
			else currentTeam = teamBlue;
			this.toString(true);
			System.out.println("It's " + currentTeam.getName() + "'s Turn!");
		} else {
			this.toString(true);
			System.out.println("The game is won! Congratulations " + winner.getName() + "!");
			layout = new Piece[8][10];
		}
	}
	
	public void destroy(Piece p) {
		int[] position = locatePiece(p);
		layout[position[0]][position[1]] = null;
		if (p instanceof KingPiece) {
			winner = currentTeam;
			currentTeam = null;
			
		}
	}
	
	public String toString() {
		String s = "\n  =================[Laser  Chess]=================\n   A    B    C    D    E    F    G    H    I    J\n";
		
		for (int row = 0; row < layout.length; row++) {
			s += row + 1 + " ";
			for (int col = 0; col < layout[row].length; col++) {
				s += "[";
				if (layout[row][col] == null) s += " ";
				else if (layout[row][col].getTeam().equals(teamBlue)) {

					if (layout[row][col] instanceof KingPiece) s += "k";
					
					else if (layout[row][col] instanceof LaserCannonPiece && layout[row][col].getOrientation() == 0) s += "↑";
					else if (layout[row][col] instanceof LaserCannonPiece && layout[row][col].getOrientation() == 1) s += "→";
					else if (layout[row][col] instanceof LaserCannonPiece && layout[row][col].getOrientation() == 2) s += "↓";
					else if (layout[row][col] instanceof LaserCannonPiece && layout[row][col].getOrientation() == 3) s += "←";
					
					else if (layout[row][col] instanceof DefenderPiece && layout[row][col].getOrientation() == 0) s += "┬";
					else if (layout[row][col] instanceof DefenderPiece && layout[row][col].getOrientation() == 1) s += "┤";
					else if (layout[row][col] instanceof DefenderPiece && layout[row][col].getOrientation() == 2) s += "┴";
					else if (layout[row][col] instanceof DefenderPiece && layout[row][col].getOrientation() == 3) s += "├";
					
					else if (layout[row][col] instanceof DeflectorPiece && layout[row][col].getOrientation() == 0) s += "◣";
					else if (layout[row][col] instanceof DeflectorPiece && layout[row][col].getOrientation() == 1) s += "◤";
					else if (layout[row][col] instanceof DeflectorPiece && layout[row][col].getOrientation() == 2) s += "◥";
					else if (layout[row][col] instanceof DeflectorPiece && layout[row][col].getOrientation() == 3) s += "◢";
					
					else if (layout[row][col] instanceof SwitchPiece && layout[row][col].getOrientation() % 2 == 0) s += "⧅";
					else if (layout[row][col] instanceof SwitchPiece && layout[row][col].getOrientation() % 2 == 1) s += "⧄";
				} else if (layout[row][col].getTeam().equals(teamRed)) {
					if (layout[row][col] instanceof KingPiece) s += "K";
					
					else if (layout[row][col] instanceof LaserCannonPiece && layout[row][col].getOrientation() == 0) s += "↑";
					else if (layout[row][col] instanceof LaserCannonPiece && layout[row][col].getOrientation() == 1) s += "→";
					else if (layout[row][col] instanceof LaserCannonPiece && layout[row][col].getOrientation() == 2) s += "↓";
					else if (layout[row][col] instanceof LaserCannonPiece && layout[row][col].getOrientation() == 3) s += "←";
					
					else if (layout[row][col] instanceof DefenderPiece && layout[row][col].getOrientation() == 0) s += "┳";
					else if (layout[row][col] instanceof DefenderPiece && layout[row][col].getOrientation() == 1) s += "┫";
					else if (layout[row][col] instanceof DefenderPiece && layout[row][col].getOrientation() == 2) s += "┻";
					else if (layout[row][col] instanceof DefenderPiece && layout[row][col].getOrientation() == 3) s += "┣";
					
					else if (layout[row][col] instanceof DeflectorPiece && layout[row][col].getOrientation() == 0) s += "⬕";
					else if (layout[row][col] instanceof DeflectorPiece && layout[row][col].getOrientation() == 1) s += "◩";
					else if (layout[row][col] instanceof DeflectorPiece && layout[row][col].getOrientation() == 2) s += "⬔";
					else if (layout[row][col] instanceof DeflectorPiece && layout[row][col].getOrientation() == 3) s += "◪";
					
					else if (layout[row][col] instanceof SwitchPiece && layout[row][col].getOrientation() % 2 == 0) s += "\\";
					else if (layout[row][col] instanceof SwitchPiece && layout[row][col].getOrientation() % 2 == 1) s += "/";
				}
				
				
				s += "]  ";
			}
			s += "\n";
		}
		
		s += "  ================Key: (Red, Blue)================\n      King: K k   Deflector: ◣ ⬕   Switch: \\ ⧅\n             Cannon: → ←  Defender: ┤ ┣\n  ================================================\n";
		return s;
	}

	public String toString(boolean print) {
		if (print) System.out.println(this.toString());
		return this.toString();
	}
}
