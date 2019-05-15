import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuessingGameTest {

	GuessingGame test = new GuessingGame();
	String response;

	@Test
	public void shouldInvalidGuessIsNegativeTwo() {
		response = test.guess(-2);
		assertEquals("Invalid number", response);
	}

	@Test
	public void shouldInvalidGuessIsEleven() {
		response = test.guess(11);
		assertEquals("Invalid number", response);
	}

	@Test
	public void shouldLoseGuessIsOne() {
		response = test.guess(1);
		assertEquals("You lose", response);
	}

	@Test
	public void shouldWinGuessIsSeven() {
		response = test.guess(7);
		assertEquals("You win!", response);
	}

	@Test
	public void shouldWinGuessIsZero() {
		response = test.guess(0);
		assertEquals("Guess a number between 1 and 10", response);
	}

	@Test
	public void shouldExitGuessIsNegativeOne() {
		response = test.guess(-1);
		assertEquals("You are exiting the game.", response);
	}
}
