package lpdioc.tictactoe;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class GameBDD {

	private Game game;
	private Exception ex;

	@Given("a $gamename board of size $nbCols per $nbRows")
	public void newGame(String gamename, int nbCols, int nbRows) {
		try {
			game = GameFactory.createGame(gamename,nbCols, nbRows);
		} catch (Exception e) {
			this.ex = e;
		}
	}
	
	@Given("a $gamename board like $board")
	public void newGame(String gamename, String board) {
		try {
			game = GameFactory.createGame(gamename,board);
		} catch (Exception e) {
			this.ex = e;
			e.printStackTrace();
		}
	}
	
	@When("the player plays $move at ($x,$y)")
	public void eval(String move, int x, int y) {
		try {
			game.performMove(move, x, y);
			this.ex = null;
		} catch (Exception e) {
			this.ex = e;
		}
	}

	@Then("the result should be $expectedValue")
	public void checkValue(String expectedValue) {
		assertNull(ex);
		assertThat(game.toString(), equalTo(expectedValue));
	}

	@Then("the result should display the error message $message")
	public void checkError(String message) {
		assertThat("No exception launched?", ex, is(notNullValue()));
		assertThat(ex.getMessage(), equalTo(message));
	}
	
	@Then("the game is finished")
	public void checkFinished() {
		assertTrue(game.finished());
	}
	
	@Then("the game is not finished")
	public void checkNotFinished() {
		assertFalse(game.finished());
	}
}
