package lpdioc.tictactoe;


/**
 * Simple TicTacToe game.
 * 
 * Each player in turn puts a mark in an empty cell of the grid until either the
 * grid is completed or the marks fill in a row, a column or a diagonal.
 * 
 * Note that the game allows non square grids.
 * 
 * @author leberre
 *
 */
public class TicTacToe implements Game {

	/**
	 * The grid, with the moves of the players.
	 */
	private final String[][] grid;
	/**
	 * The number of columns of the grid.
	 */
	private final int nbCols;
	
	/**
	 * The number of rows of the grid.
	 */
	private final int nbRows;

	/**
	 * The number of empty cells in the grid
	 */
	private int toFill;

	// TODO some additional fields may be needed
	
	public TicTacToe(String board) {
		String[] rows = board.split("\n");
		this.nbRows = rows.length;
		this.nbCols = rows[0].length();
		this.grid = new String[nbRows][nbCols];
		this.toFill = this.nbRows*this.nbCols;
		char car;
		for (int y = 0; y < this.nbRows; y++) {
			if (rows[y].length() != this.nbCols) {
				throw new IllegalArgumentException("Incorrect textual board game");
			}
			for (int x = 0; x < this.nbCols; x++) {
				car = rows[y].charAt(x);
				if (car != '.') {
					grid[y][x] = Character.toString(car);
					this.toFill--;
				}
			}
		}
	}

	/**
	 * Create a TicTacToe game of a given size.
	 * 
	 * @param nbCols
	 *            the number of columns
	 * @param nbRows
	 *            the number of rows
	 */
	public TicTacToe(int nbCols, int nbRows) {
		this.nbCols = nbCols;
		this.nbRows = nbRows;
		this.grid = new String[nbRows][nbCols];
		this.toFill = nbCols * nbRows;
	}

	
	private boolean aLineCompleted() {
		// TODO
		return false;
	}

	private boolean aColumnCompleted() {
		// TODO
		return false;
	}

	private boolean firstDiagonalCompleted() {
		// TODO
		return false;
	}

	private boolean secondDiagCompleted() {
		// TODO
		return false;
	}


	@Override
	public boolean finished() {
		return full() || aLineCompleted() || aColumnCompleted() || firstDiagonalCompleted() || secondDiagCompleted();
	}


	@Override
	public void performMove(String move, int x, int y) {
		// TODO 
	}

	@Override
	public String toString() {
		StringBuilder stb = new StringBuilder();
		for (int y = 0; y < nbRows; y++) {
			for (int x = 0; x < nbCols; x++) {
				if (grid[y][x] == null) {
					stb.append('.');
				} else {
					stb.append(grid[y][x]);
				}
			}
			if (y < nbRows - 1) {
				stb.append(System.lineSeparator());
			}
		}
		return stb.toString();
	}

	private boolean full() {
		return toFill == 0;
	}
}
