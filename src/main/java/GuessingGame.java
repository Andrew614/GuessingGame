import java.util.Random;

public class GuessingGame {

	Random rand = new Random();
	int winningNum = rand.nextInt(10);

	public String guess(int num) {
			if(num < -1 || num > 10) {
				return "Invalid number";
			}
			else if(num == winningNum) {
				return "You win!";
			}
			else if(num == 0) {
				return "Guess a number between 1 and 10";
			}
			else if(num == -1) {
				return "You are exiting the game.";
			}
			else if(num > winningNum) {
				return "The secret number is < than " + num;
			}
			else if(num < winningNum) {
				return "The secret number is > than " + num;
			}
			return "You lose";
	}
}
