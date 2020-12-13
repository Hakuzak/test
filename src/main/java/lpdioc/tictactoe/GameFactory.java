package lpdioc.tictactoe;


public class GameFactory {

    private GameFactory() {
        // pour empêcher la création d'une instance de cette classe
    }

    public static Game createGame(String name, int nbCols, int nbRows) {
        if ("tictactoe".equals(name.toLowerCase())) {
            return new TicTacToe(nbCols, nbRows);
        }
        throw new IllegalArgumentException(name + " is not a supported game");
    }

    public static Game createGame(String name, String board) {
        if ("tictactoe".equals(name.toLowerCase())) {
            return new TicTacToe(board);
        }
        throw new IllegalArgumentException(name + " is not a supported game");
    }
}
