package consoleJackNPoy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
	
	private static int player = 0;
	private static int ai = 0;
	
	
	public static int getRounds()
	{
		int rounds  = 0;
		Scanner get = new Scanner(System.in);
		
		System.out.println("PLEASE CHOOSE BELOW HOW MANY ROUNDS DO YOU WANT?");
		System.out.println("[1] 3 ROUNDS");
		System.out.println("[2] 5 ROUNDS");
		System.out.println("[3] 7 ROUNDS");
		try {
			rounds = get.nextInt();


		}catch (InputMismatchException e) {
			System.out.println("PLEASE ENTER ONLY NUMBERS FROM OPION !!!");
		}

		if(rounds == 1)
		{
			return 3;
		}
		else if (rounds == 2)
		{
			return 5;
		}
		else if (rounds == 3)
		{
			return 7;
		}
		else
		{
			return 0;
		}

		
	}
	public static void printGame()  //method for print the game's options
	{
		System.out.println("======= WELCOME TO JACK N' POY ========");
		System.out.println("[1] BATO");
		System.out.println("[2] GUNTING");
		System.out.println("[3] PAPEL");
	}
	
	public static void compareChoices(int pChoice, int aiChoice) //method to compare the ai and user's choice
	{
		
		//BATO
		if(pChoice == 1 && aiChoice == 2)
		{
			player++;
		}
		else if(pChoice == 1 && aiChoice == 3)
		{
			ai++;
		}
		
		//GUNTING
		else if (pChoice == 2 && aiChoice == 1)
		{
			ai++;
		}
		else if (pChoice == 2 && aiChoice == 3)
		{
			player++;
		}
		
		//PAPEL
		else if (pChoice == 3 && aiChoice == 1)
		{
			player++;
		}
		else if (pChoice == 3 && aiChoice == 2)
		{
			ai++;
		}
		
		//TIE
		else
		{
			
		}
		
	}
	
	
//	public static void printScores()  //method to print the score (YOU NEED TO INVOKE THE METHOD compareChoices first before calling this method)
//	{
//
//		System.out.print("USER: " + player + "\n");
//		System.out.print("AI:   " + ai);
//
//	}
	
//	public static void printUserScore()
//	{
//		System.out.println("USER: " + player);
//	}
//	
//	public static void printAiScore()
//	{
//		System.out.println("AI: " + ai);
//	}
	
	public static int getPlayerScore()
	{
		return player;
	}
	
	public static int getAiScore()
	{
		return ai;
	}
	
	public static void printWinner()  //method to print the winner (YOU NEED TO INVOKE THE METHOD compareChoices first before calling this method)
	{
		if(player > ai)
		{
			System.out.println("=======================================");
			System.out.println("===  YOU WIN ! CONGRATULATIONS !!! ====");
			System.out.println("=======================================");
		}
		else if(ai > player) 
		{
			System.out.println("=======================================");
			System.out.println("====     AI WINS ! YOU LOSE       =====");
			System.out.println("=======================================");
		}
		else
		{
			System.out.println("=======================================");
			System.out.println("======        IT'S A TIE        =======");
			System.out.println("=======================================");
		}
	}
	

}
