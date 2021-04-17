package consoleJackNPoy;

import java.util.HashMap;

public class Player {  //a super class for both AI and USER
	
	private int choice;

	public String getChoice() {
		HashMap <Integer, String> hm = new HashMap<>();  //create hashmap object for jey value pairs
		hm.put(1, "BATO");
		hm.put(2, "GUNTING");
		hm.put(3, "PAPEL");
		return hm.get(this.choice);
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

}
