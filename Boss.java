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
        int num = (int)(Math.random() * 2); //chooses either 0 or 1
        
        if(num == 0){ //if 0, do left combo
            System.out.println("Boss begins casting leftward swipe.");
            System.out.println("Followed up by rightward swipe.");
        }
        
        else if(num == 1){ //if 1, do right combo
            System.out.println("Boss begins casting rightward swipe.");
            System.out.println("Followed up by leftward swipe.");
        }
        
        else{
            System.out.println("Number besides 1 or 0 acknowledged.");
        }
    }
    
    public void leap(){
        int num = (int)(Math.random()*4); //determines what cardinal boss is jumping to
        int num2 = (int)(Math.random()*2); //determines if it's stack or spread.
        
        if(num == 0){
            System.out.println("Boss jumps to North wall.");
            
            if(num2 == 0){
                System.out.println("Followed up by Stack!");
            }
            
            else if (num2 == 1){
                System.out.println("Followed up by Spread!");
            }
        }
        
        else if(num == 1){
            System.out.println("Boss jumps to East wall.");
            
            if(num2 == 0){
                System.out.println("Followed up by Stack!");
            }
            
            else if (num2 == 1){
                System.out.println("Followed up by Spread!");
            }
        }
        
        else if(num == 2){
            System.out.println("Boss jumps to West wall.");
            
            if(num2 == 0){
                System.out.println("Followed up by Stack!");
            }
            
            else if (num2 == 1){
                System.out.println("Followed up by Spread!");
            }
        }
        
        else if(num == 3){
            System.out.println("Boss jumps to South wall.");
            
            if(num2 == 0){
                System.out.println("Followed up by Stack!");
            }
            
            else if (num2 == 1){
                System.out.println("Followed up by Spread!");
            }
        }
        
    }
    
    public void enrage(){
        System.out.println("Boss begins casting enrage.");
        for(int i = 1; i < 11; i++){
        System.out.println( "(" + (10-i) + " Seconds to execution.)");
        try {
            Thread.sleep(1000); // Sleep for 2 seconds
        } 
        catch (InterruptedException e) {
            e.printStackTrace(); // Handle the interruption
        }
        }
        System.out.println("Party has wiped. Game Over.");
    }
    
}
