package consoleJackNPoy;

import java.util.Random;

public class Computer extends Player{  //inherits the PLAYER class methods and attributes

	public int takeAiInput()  //method to get the AI choice
	{
		Random rd  =  new Random(); //create random object
		
		int aiChoice = rd.nextInt(3) + 1;  //get AI choice range from 0 - 2 (+1)
		
		return aiChoice;  //return the AI choice after generating random integer
	}

}
