package lpdioc.tictactoe;


public class GameFactory {

	public static Game createGame(String name, int nbCols, int nbRows) {
		switch (name.toLowerCase()) {
		case "tictactoe":
			return new TicTacToe(nbCols, nbRows);
		default:
			throw new IllegalArgumentException(name + " is not a supported game");
		}
	}

	public static Game createGame(String name, String board) {
		switch (name.toLowerCase()) {
		case "tictactoe":
			return new TicTacToe(board);
		default:
			throw new IllegalArgumentException(name + " is not a supported game");
		}
	}

}
