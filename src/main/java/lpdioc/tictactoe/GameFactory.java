package lpdioc.tictactoe;


public class GameFactory {

    private GameFactory() {
        throw new IllegalStateException("Utility class");
    }

    public static Game createGame(String name, int nbCols, int nbRows) {
        if ("tictactoe".equalsIgnoreCase(name)) {
            return new TicTacToe(nbCols, nbRows);
        }
        throw new IllegalArgumentException(name + " is not a supported game");
    }

    public static Game createGame(String name, String board) {
        if ("tictactoe".equalsIgnoreCase(name)) {
            return new TicTacToe(board);
        }
        throw new IllegalArgumentException(name + " is not a supported game");
    }
}
