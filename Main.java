import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Player p1 = new Player("Eleia Frostkiss", 100, "White Mage");
	    Player p2 = new Player("Derek Darkheart", 150, "Brute");
	    Player p3 = new Player("Liliana Breezeborne",100,"Wind Mage");
	    
	    ArrayList<Player> party = new ArrayList<Player>();
	    party.add(p1);
	    party.add(p2);
	    party.add(p3);
	    
	    System.out.println("Your party is listed below: ");
	    
	    for(int i = 0; i < party.size(); i++){
	        System.out.println(party.get(i));
	    }
	}
}
