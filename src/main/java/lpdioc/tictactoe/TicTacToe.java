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
		for (int i = 0; i<this.nbRows; i++) {
			if (this.grid[i][0] != null) {
				String move = this.grid[i][0];
				for (int j = 0; j < this.nbCols; j++) {
					if (this.grid[i][j] != null){
						if (!this.grid[i][j].equals(move)){
							break;
						}
						else if (j == this.nbCols - 1 && this.grid[i][j].equals(move)) {
//							System.out.println(true);
							return true;
						}
					}
					else {
						break;
					}
				}
			}
		}
		return false;
	}

	private boolean aColumnCompleted() {
		for (int i = 0; i<this.nbCols; i++) {
			if (this.grid[0][i] != null) {
				String move = this.grid[0][i];
				for (int j = 0; j < this.nbRows; j++) {
					System.out.println(i + " " + j);
					if (this.grid[j][i] != null){
						if (!this.grid[j][i].equals(move)){
							break;
						}
						else if (j == this.nbRows - 1 && this.grid[j][i].equals(move)) {
							return true;
						}
					}
					else {
						break;
					}
				}
			}
		}
		return false;
	}

	private boolean firstDiagonalCompleted() {
		if (this.grid[0][0] != null){
			String move = this.grid[0][0];
			for (int  i = 0; i<nbRows; i++) {
				if (this.grid[i][i] != null){
					if (!this.grid[i][i].equals(move)){
						break;
					}
					else if (i == this.nbRows - 1 && this.grid[i][i].equals(move)) {
						return true;
					}
				}
				else {
					break;
				}
			}
		}
		return false;
	}

	private boolean secondDiagCompleted() {
		if (this.grid[0][nbCols-1] != null){
			String move = this.grid[0][nbCols-1];
			int var = this.nbCols-1;
			for (int  i = 0; i<nbRows; i++) {
				if (this.grid[i][var] != null){
					if (!this.grid[i][var].equals(move)){
						break;
					}
					else if (i == this.nbRows - 1 && this.grid[i][var].equals(move)) {
						return true;
					}
				}
				else {
					break;
				}
				var--;
			}
		}
		return false;
	}


	@Override
	public boolean finished() {
		return full() || aLineCompleted() || aColumnCompleted() || firstDiagonalCompleted() || secondDiagCompleted();
	}


	@Override
	public void performMove(String move, int x, int y) {
		this.grid[y-1][x-1] = move;
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
