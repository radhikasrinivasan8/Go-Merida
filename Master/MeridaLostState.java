/**
 * Write a description of class MeridaLostState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeridaLostState implements iMeridaState  
{
    public Brave brave;

    public MeridaLostState(Brave brave)
    {
        this.brave = brave;
    }

    public  boolean isAlive()
    {
        return true;
    }
    
    public boolean isDead()
    {
        return false;
    }
    
     
    public void setState()
    {
        brave.setState(brave.getMeridaLostState());
    }
    
    public void display()
    {
        brave.getWorld().addObject(new GameOverScreen("gameOverSad.png"), 500, 125);
    }
}
