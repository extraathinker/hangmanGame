
import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		String word = "buffalo";
		String guess = "_".repeat(word.length());
		String guessWord = "";
		int guessCount = 3;
		
		System.out.println("Your game begins....");
		System.out.println("Your word is: " + guess);
		

		while (!guess.equals(word) && guessCount > 0) {
			System.out.print("Enter your guess: ");
			char nextGuess = keyboardInput.next().charAt(0);

			if (!word.contains(String.valueOf(nextGuess))) {
				System.out.println("Wrong Guess!");
				guessCount = guessCount - 1;
				System.out.println("You have " + guessCount + " no. of guesses.");
			} else {
				
				for (int i = 0; i < word.length(); i++) {
			        if (word.charAt(i) == nextGuess) {
				        guessWord = guessWord + word.charAt(i);
					} else {
						guessWord = guessWord + guess.charAt(i);
					}
				}
					guess = guessWord;
					guessWord = "";
					    
			}
			System.out.println(guess);	
		}
		if (guessCount == 0) {
			System.out.println("you are out of guesses.");
		} else {
			System.out.println("You win.");
		}
		}
		
		  
	}


