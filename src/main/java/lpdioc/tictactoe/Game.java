package lpdioc.tictactoe;


/**
 * A minimalistic contract for a game.
 * 
 * @author leberre
 *
 */
public interface Game {

	/**
	 * Let the player make a move.
	 * 
	 * @param move the move of the player given as a mark
	 * @param x the column of the move, starting at 1
	 * @param y the row of the move, starting at 1
	 */
	void performMove(String move, int x, int y);
	
	/**
	 * Detect if the game is finished.
	 * 
	 * @return true iff the game is finished.
	 */
	boolean finished();
}
