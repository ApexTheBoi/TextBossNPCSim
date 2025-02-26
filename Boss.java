import java.util.*;
public class Boss {

	private ArrayList<Player> partyList;

	private String name;
	private int health;
	private String arena;

	public Boss(String n, int h, String a) {
		name = n;
		health = h;
		arena = a;
	}

	@Override
	public String toString() {
		return "Boss: " + name + " | Has " + health + " health. | Located in: " + arena;
	}

	public void setPartyList(ArrayList<Player> p) {
		partyList = p;
	}
	
	public void choosePlayers(int n){
	    ArrayList<Player> targets = partyList; //have a second arraylist of targets
		for(int i = 0; i < n; i++) { //only attack n players
			int num = (int)(Math.random()*partyList.size());
			System.out.println(targets.get(num).getName() + " was hit!");
			targets.remove(num); //removes the player hit, so they dont get hit again.
			try {
				Thread.sleep(1500); // Sleep for 1.5 seconds
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	//Mechanics are methods

	public void swipe() {
		int num = (int)(Math.random() * 2); //chooses either 0 or 1

		if(num == 0) { //if 0, do left combo
			System.out.println("Boss begins casting leftward swipe.");
			System.out.println("Followed up by rightward swipe.");
		}

		else if(num == 1) { //if 1, do right combo
			System.out.println("Boss begins casting rightward swipe.");
			System.out.println("Followed up by leftward swipe.");
		}

		else {
			System.out.println("Number besides 1 or 0 acknowledged.");
		}
	}

	public void leap() {
		int num = (int)(Math.random()*4); //determines what cardinal boss is jumping to
		int num2 = (int)(Math.random()*2); //determines if it's stack or spread.

		if(num == 0) {
			System.out.println("Boss jumps to North wall and cleaves.");

			if(num2 == 0) {
				System.out.println("Followed up by Stack!");
			}

			else if (num2 == 1) {
				System.out.println("Followed up by Spread!");
			}
		}

		else if(num == 1) {
			System.out.println("Boss jumps to East wall and cleaves.");

			if(num2 == 0) {
				System.out.println("Followed up by Stack!");
			}

			else if (num2 == 1) {
				System.out.println("Followed up by Spread!");
			}
		}

		else if(num == 2) {
			System.out.println("Boss jumps to West wall and cleaves.");

			if(num2 == 0) {
				System.out.println("Followed up by Stack!");
			}

			else if (num2 == 1) {
				System.out.println("Followed up by Spread!");
			}
		}

		else if(num == 3) {
			System.out.println("Boss jumps to South wall and cleaves.");

			if(num2 == 0) {
				System.out.println("Followed up by Stack!");
			}

			else if (num2 == 1) {
				System.out.println("Followed up by Spread!");
			}
		}

	}

	public void cleave(int num) {
		choosePlayers(num);
	}

	public void enrage() {
		System.out.println("Boss begins casting enrage.");
		for(int i = 0; i < 11; i++) {
			System.out.println( "(" + (10-i) + " Seconds to execution.)");
			try {
				Thread.sleep(1000); // Sleep for 1 second
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Party has wiped. Game Over.");
	}

}
