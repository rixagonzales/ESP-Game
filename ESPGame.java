
/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek 
 * Description: The only class used in this project is called ESPGame in which the user is asked to guess a number and if guessed right they 
                earn a correct guess. The correct color is chosen by the program using the Random class that generates a random number, a do while 
                loop is used for input validation and a for loop for a number of 11 iterations. 
 * Due: 02/05/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Rixa Dubon
*/

package Rdubongo_Assignment1;

import java.util.Scanner;
import java.util.Random; 

public class ESPGame {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		String userName;                 //holds the name entered by the user 
		String userDescription;          //holds the description entered my the user 
		String dueDate;                  //holds the projects due date
		String usersGuess;               //holds the guess entered by the user 
		
		String randomColor;              //holds the colors from where a random one is chosen and holds it
		int randomNumber;                //holds the randomly generated number
		int numCorrectGuesses = 0;       //initialized to 0 and holds the number of correct guesses by the user
		
		final String RED_COLOR = "Red";       //constant variable that holds the red color
		final String GREEN_COLOR = "Green";   //constant variable that holds the green color
		final String BLUE_COLOR = "Blue";     //constant variable that holds the blue color
		final String ORANGE_COLOR = "Orange"; //constant variable that holds the orange color
		final String YELLOW_COLOR = "Yellow"; //constant variable that holds the yellow color
		
		//display and prompt to enter user's name 
		System.out.print("Enter your name: ");
		userName = in.nextLine();
		
		//display and prompt user to enter a description
		System.out.print("Describe yourself: ");
		userDescription = in.nextLine();
		
		//Display and prompt to enter a due Date 
		System.out.print("Due Date:  ");
		dueDate = in.nextLine();
		
		//display assignments number and topic
		System.out.println("CMSC203 Assignmemnt 1: Test your ESP skills!");
		
		//iteration to display the number of rounds from 1-11
		for(int rounds = 1; rounds <=11; rounds++) {
			System.out.print("Round "+ rounds + "\n");
		
			//display an statement and question for user to pick a color 
			System.out.println("\nI am thinkin of a color." + 
			"\nIs it Red, Green, Blue, Orange, or Yellow?");
			
			randomNumber = random.nextInt(5);  //randomly choose a number from 0-5
			
			//using the random chosen number, using the switch statement the color with the matched number will be the correct one
			switch(randomNumber) {
			case 0 : 
				randomColor = RED_COLOR;
				 break;
			case 1 :
				randomColor = GREEN_COLOR; 
				 break;
			case 2 : 
				randomColor = BLUE_COLOR;
				break;
			case 3 : 
				randomColor = ORANGE_COLOR;
				break;
			case 4 : 
				randomColor = YELLOW_COLOR;
				break;
			default :
			    randomColor = "";
			    
			}
			    //do while loop checks for input validation on the provided colors to the user 
			    do {			
			    	
			    	//prompt user to enter a guess 
			    	System.out.print("Enter your guess: ");
			    	usersGuess = in.nextLine();
			    	
			    	//error message is displayed if the entered color is not one of the options 
			    	if (!usersGuess.equalsIgnoreCase("Red")&&
			    		!usersGuess.equalsIgnoreCase("Green")&&
			    		!usersGuess.equalsIgnoreCase("Blue")&&
			    		!usersGuess.equalsIgnoreCase("Orange")&&
			    		!usersGuess.equalsIgnoreCase("Yellow"))
			    		
			    	//prompt user to enter a guess again 
			    		System.out.println("You entered incorrect color. " + 
			    		 "\nIs it Red, Green, Blue, Orange, or Yellow?" + "Enter your guess again");
			    	
			    	 
				
			    		
			    	
			    }while(!usersGuess.equalsIgnoreCase("Red")&&
			    	    !usersGuess.equalsIgnoreCase("Green")&&
			    	    !usersGuess.equalsIgnoreCase("Blue")&&
			    	    !usersGuess.equalsIgnoreCase("Orange")&&
			    	    !usersGuess.equalsIgnoreCase("Yellow"));
			    
			    //number of correct guesses is incremented if the guess is correct
			    if(usersGuess.equalsIgnoreCase(randomColor))
			    	 numCorrectGuesses++;
			    
			//display the message of the random color chosen 
			System.out.println("\nI was thinking of " + randomColor);
		}
			//display game over message
			System.out.println("Game over\n");
			
			//display the number of correct guesses 
			System.out.println("\nYou guessed " + numCorrectGuesses + " out of 10 colors correctly"); 
			
			//display students name
			System.out.println("Students Name: " + userName);
			
			//display users description and due date 
			System.out.println("User Description: " + userDescription +
					           "\nDue Date: " + dueDate);

		
		//scanner is closed 
		in.close();
		
		
	}
}
	