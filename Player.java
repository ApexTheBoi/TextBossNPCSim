public class Player
{
    private String name;
    private int health;
    private String role;
    
    public Player(){
        this.name = "n/a";
        this.health = -1;
        this.role = "n/a";
    }
    
    public Player(String n, int h, String r){
        this.name = n;
        this.health = h;
        this.role = r;
    }
    
    @Override
    public String toString(){
        return this.name + " has " + health + " health. They are playing " + role;
    }
    
    public String getName(){
        return name;
    }
    
    public int getHealth(){
        return health;
    }
    
    public String getRole(){
        return role;
    }
    
    public void setName(String s){
        name = s;
    }
    
    public void setHealth(int h){
        health = h;
    }
}
