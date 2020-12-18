package lpdioc.tictactoe;


import java.io.Console;

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

	private String player1;

	private String player2;

	private String actual;

	// TODO some additional fields may be needed
	
	public TicTacToe(String board) {
		String[] rows = board.split("\n");
		this.nbRows = rows.length;
		this.nbCols = rows[0].length();
		this.grid = new String[nbRows][nbCols];
		this.toFill = this.nbRows*this.nbCols;
		this.player1 = "";
		this.player2 = "";
		this.actual = player1;
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
		this.player1 = "";
		this.player2 = "";
		this.actual = player1;
	}

	
	private boolean aLineCompleted() {
		for (int i = 0; i<this.nbRows; i++) {
			if (this.grid[i][0] != null) {
				String move = this.grid[i][0];
				for (int j = 0; j < this.nbCols; j++) {
					if (this.grid[i][j] == null || !this.grid[i][j].equals(move)){
						break;
					}
					else if (j == this.nbCols - 1 && this.grid[i][j].equals(move)) {
						return true;
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
					if (this.grid[j][i] == null || !this.grid[j][i].equals(move)){
						break;
					}
					else if (j == this.nbRows - 1 && this.grid[j][i].equals(move)) {
						return true;
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
				if (this.grid[i][i] == null || !this.grid[i][i].equals(move)){
					break;
				}
				else if (i == this.nbRows - 1 && this.grid[i][i].equals(move)) {
					return true;
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
				if (this.grid[i][var] == null || !this.grid[i][var].equals(move)){
					break;
				}
				else if (i == this.nbRows - 1 && this.grid[i][var].equals(move)) {
					return true;
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
		System.out.println(this.actual);
		if (this.player1.equals("") && !this.player2.equals(move)){
			this.player1 = move;
		}
		else if (this.player2.equals("") && !this.player1.equals(move)){
			this.player2 = move;
		}
		else if(!this.player1.equals(move) && !this.player2.equals(move)) {
			throw new IllegalArgumentException("can only use two marks for this game");
		}

		if(x>this.nbCols || y>this.nbRows || x<=0 || y<=0) {
			throw new IllegalArgumentException("incorrect position");
		}
		else if(this.grid[y-1][x-1] !=null){
			throw new IllegalArgumentException("cell not empty");
		}
		else if(this.grid[y-1][x-1] !=null && this.grid[y-1][x-1].equals(move) || move.equals(this.actual)){
			throw new IllegalArgumentException("cannot make twice the same move");
		}
		else {
			this.grid[y-1][x-1] = move;
			this.toFill--;
		}
		if(this.actual.equals(this.player1)){
			this.actual =this.player2;
		}
		else {
			this.actual =this.player1;
		}
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
