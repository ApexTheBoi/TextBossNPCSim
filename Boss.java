public class Boss{
    
    private String name;
    private int health;
    private String arena;
    
    public Boss(String n, int h, String a){
        name = n;
        health = h;
        arena = a;
    }
    
    @Override
    public String toString(){
        return "Boss: " + name + " | Has " + health + " health. | Located in: " + arena;
    }
    
    //Mechanics are methods
    
    public void swipe(){ //unfinished
        int num = (int)(Math.random() * 2);
        
        if(num == 0){
            System.out.println("Boss begins casting leftward swipe.");
        }
    }
}
