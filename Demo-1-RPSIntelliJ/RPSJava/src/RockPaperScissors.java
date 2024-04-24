// Create a rock paper scissors game
// 1. ask user to input rock paper or scissors
// 2. have the computer delect a random choice
// 3. compare the user's choice to the computer's choice
// 4. ask the winner to play again

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        String userChoice;
        String computerChoice;
        String playAgain;

        do {
            // Prompt the user to enter their choice
            System.out.println("Enter rock, paper, or scissors: ");
            userChoice = input.nextLine();
            // trow and error if they enter an invalid choice
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                throw new IllegalArgumentException("Invalid choice. Please enter rock, paper, or scissors.");
            }
        
            
            // Get the computer's choice
            computerChoice = getComputerChoice();
            System.out.println("The computer chose: " + computerChoice);
            
            // Determine and print the winner
            System.out.println("The winner is: " + determineWinner(userChoice, computerChoice));
            
            // Ask the user if they want to play again
            System.out.println("Would you like to play again? (yes or no): ");
            playAgain = input.nextLine();
        } while (playAgain.equals("yes")); // Continue playing as long as the user says "yes"
    }

    public static String getComputerChoice() {
        // Define the possible choices
        String[] choices = {"rock", "paper", "scissors"};
        
        // Generate a random index
        int randomIndex = (int) (Math.random() * choices.length);
        
        // Return the choice at the randomly selected index
        return choices[randomIndex];
    }

        public static String determineWinner(String userChoice, String computerChoice) {
            // If the user's choice is the same as the computer's choice, it's a tie
            if (userChoice.equals(computerChoice)) {
                return "It's a tie!";
            } else {
                // Implement the winner determination logic here
                if (userChoice.equals("rock")) {
                    if (computerChoice.equals("scissors")) {
                        return "User wins!";
                    } else { // computerChoice is "paper"
                        return "Computer wins!";
                    }
                } else if (userChoice.equals("paper")) {
                    if (computerChoice.equals("rock")) {
                        return "User wins!";
                    } else { // computerChoice is "scissors"
                        return "Computer wins!";
                    }
                } else { // userChoice is "scissors"
                    if (computerChoice.equals("paper")) {
                        return "User wins!";
                    } else { // computerChoice is "rock"
                        return "Computer wins!";
                    }
                }
            }
        }
    } // Add this closing brace to complete the class body
