import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int x;
    private Context context;
     public static int Health=3;
    blueDiamond b=new blueDiamond();
    
    public Obstacle(){
        context = new Context(new VerticalMovement());
        
    }
    
    public void despawning()
    {
        x=getX();
        
        if (x==0)
        {
            getWorld().removeObject(this);
        }
        else if(isTouching(Brave.class))
        {   
            
            Health--;
            if(Health>0)
            {
            
                b.update(Health);
            }
            // if Health is zero set game OVER STATE
            // ELSE PART
            getWorld().removeObject(this);
        }
    }
    
    public void act() 
    {
        // Add your action code here.
        context.executeMovement(this);
        despawning();
    }    
}
