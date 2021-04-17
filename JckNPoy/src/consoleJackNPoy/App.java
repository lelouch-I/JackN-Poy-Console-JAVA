package consoleJackNPoy;

public class App {

	public static void main(String[] args) {
		int test = 0;
		int counter = 0;
		int limit = 0;
		System.out.println("======= WELCOME TO JACK N' POY ========");
		while(true)
		{
			limit = Game.getRounds();
			if(limit != 0)
			{
				break;
			}
			else
			{
				System.out.println("PLEASE ENTER ONLY 1 - 3");
			}
		}

		
		printBlankSpace();
		Game.printGame();
		
		Computer ai = new Computer(); 	//create Ai object
		User player = new User(); 		//create User object
		
		while(counter < limit) //loop the game depending on how many rounds user's chose
		{
			int userChoice = player.takePLayerInput();  //get user choice put it in a variable
			int aiChoice = ai.takeAiInput();			// get AI choice put it in a variable
			if(validateInput(userChoice))  //validate user input if it is from 1 - 3 before starting the round; otherwise start again the loop
			{
				counter++;  //increment the counter
				player.setChoice(userChoice);  //set the player's choice
				ai.setChoice(aiChoice);			//set the ai's choice 
				
				Game.compareChoices(userChoice, aiChoice);			//call the method to compare the choices
				
				System.out.println();
				System.out.print("**********************************\n");
				System.out.print("|\t\t|\t\t |\n");
				System.out.print("| USER: " + player.getChoice() + "\t|  " + "USER: " + Game.getPlayerScore() + "\t |\n");   //prints the choice of user (THIS WILL PRINT THE VALUE)
				System.out.print("| AI:   " + ai.getChoice() + "\t|  " + "AI:   " + Game.getAiScore() + "\t |\n");		//prints the choice of ai (THIS WILL PRINT THE VALUE)
				System.out.println("|\t\t|\t\t |");
				System.out.println("**********************************");
//				Game.printScores();  //call the method to print the score
			}
			else
			{
				System.out.println("ENTER ONLY FORM 1 -3");  //print the accepted input range or print the optons
			}

			
	
		}
		Game.printWinner();  //after the round, call the method to print the score
		
	}
		
	private static boolean validateInput(int input)  //method to validate input of user before incrementing the counter
	{
		boolean bool = false;

		if(input > 0 && input < 4)
		{

			return bool = true;

		}

		else
		{
			return bool;	
		}

	}
	
	public static void printBlankSpace()
	{
		for(int i = 0; i <= 20; i++)
		{
			System.out.println("\n");
		}
	}

	
		
	}
