import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       validateGuess();
    }

    public static void validateGuess()
    {
        Scanner scan = new Scanner(System.in);
        String playAgain;
        do
        {
            int answer = (int)(Math.random() * 100 + 1);
            int guess = 0;
            while (guess != answer)
            {
                System.out.println("Guess a number between 1 and 100 (Type 0 to stop playing): ");
                guess = scan.nextInt();
                if (guess == 0)
                {
                    System.out.println("You have stopped playing.");
                    System.exit(0);
                }
                else if (guess < answer)
                {
                    System.out.println(guess + " is too low. Try again.");
                }
                else if (guess > answer)
                {
                    System.out.println(guess + " is too high. Try again.");
                }
                else
                {
                    System.out.println(guess + " is correct. You win!");
                }
            }
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
    }
}