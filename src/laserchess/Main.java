package laserchess;

public class Main {

	public static void main(String[] args) {
		Board game = new Board("ace");
		
		game.moveFriendly('C', 2, 'C', 1); // Red Turn 1
		game.rotateFriendly('F', 8, "right"); // Blue Turn 1
		
		game.moveFriendly('F', 4, 'F', 3); // Red Turn 2
		game.moveFriendly('H', 7, 'H', 8); // Blue Turn 2
		
		game.moveFriendly('F', 3, 'F', 2); // Red Turn 3
		game.moveFriendly('J', 4, 'J', 3); // Blue Turn 3
		
		game.moveFriendly('F', 2, 'E', 1); // Red Turn 4
		game.moveFriendly('J', 4, 'J', 3); // J4 has no piece, fails!
		game.moveFriendly('J', 3, 'J', 2); // Blue Turn 5
		
		game.rotateFriendly('E', 1, "up"); // Red Turn 5
		game.rotateFriendly('J', 2, "down"); // Blue Turn 5
		
		game.rotateFriendly('A', 5, "left"); // Red Turn 6
		game.moveFriendly('J', 5, 'I', 5); // Blue Turn 6
		
		game.moveFriendly('E', 4, 'F', 3); // Red Turn 7
		game.rotateFriendly('I', 5, "left"); // Blue Turn 7
		
		game.moveFriendly('C', 1, 'B', 1); // Fails because B1 is a white helix
		game.moveFriendly('E', 1, 'F', 1); // Fails because switches can't swap with kings
		game.moveFriendly('F', 3, 'F', 2); // Red Turn 9
		game.rotateFriendly('I', 5, "down"); // Blue Turn 8
	}

}
