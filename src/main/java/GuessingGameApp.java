import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		GuessingGame game = new GuessingGame();
		playGame(game);
	}

	private static void playGame(GuessingGame game) {
		Scanner input = new Scanner(System.in);
		boolean lose = true;
		int guess;
		for(int i = 0; i < 3; i++) {
			System.out.println("Guess a number between 1 and 10 or type -1 to exit");
			guess = input.nextInt();
			System.out.println(game.guess(guess));
			if(guess == -1) {
				lose = false;
				break;
			}
			else if(guess == game.winningNum) {
				lose = false;
				break;
			}
		}
		input.close();
		if(lose) {
			System.out.println("You lose");
		}
		System.out.println("Thanks for playing");
	}
}