package consoleJackNPoy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User extends Player {  //inherits the PLAYER class methods and attributes
	
	public int takePLayerInput()
	{
		int playerChoice = 0;
		Scanner get = new Scanner(System.in);  //create Scanner object
		System.out.print("ENTER YOUR CHOICE: ");
		
		try{
			
			playerChoice = get.nextInt();
		
		}catch (InputMismatchException e) {  //catch the exception if user enters non-numeric value
			
			System.out.println("ENTER ONLY NUMBERS !!!"); //catch error if user enter non numeric value			
		}
		
		return playerChoice; //returns user's choice after going through try catch. This will ensure that this method will return integer only
	}
	

	
	
}
