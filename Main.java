import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Boss boss = new Boss("Valenthia",10000,"The Highrise Pantheon");
	    int playerCount;
	    
	    Player p1 = new Player("Eleia Frostkiss", 100, "White Mage");
	    Player p2 = new Player("Derek Darkheart", 150, "Brute");
	    Player p3 = new Player("Liliana Breezeborne",100,"Wind Mage");
	    Player p4 = new Player("Hubert Lightstream", 100, "Viper");
	    Player p5 = new Player("Card Molia",100,"Monk");
	    Player p6 = new Player("Irudia Uniqia",150,"Gunbreaker");
	    Player p7 = new Player("Julia Hindsneer",80,"Glass Cannon");
	    Player p8 = new Player("Hephaistos Wyrmbound",100,"Fire Thrower");
	    
	    
	    ArrayList<Player> party = new ArrayList<Player>();
	    party.add(p1);
	    party.add(p2);
	    party.add(p3);
	    party.add(p4);
	    party.add(p5);
	    party.add(p6);
	    party.add(p7);
	    party.add(p8);
	    
	    playerCount = party.size();
	    
	    boss.setPartyList(party);
	    
	    System.out.println("Your party is listed below: ");
	    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
	    
	    //Loop printing all the party members in order.
	    for(int i = 0; i < party.size(); i++){
	        System.out.println(party.get(i));
	        if(i != party.size()-1){
	        System.out.println("------------------");
	        }
	    }
	    
	    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
	    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
	    
	    System.out.println(boss);
	    
	    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
	    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
	    
	    boss.swipe();
	    
	    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
	    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
	    
	    boss.leap();
	    
	    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
	    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
	    
	    boss.cleave(3); //note you can change the parameter to whatever number you want that's less than or equal to playercount
	    
	    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
	    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
	    
	    boss.enrage();
	}
}
