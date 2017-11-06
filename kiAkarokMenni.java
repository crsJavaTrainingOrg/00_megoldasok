import becker.robots.*;
public class kiAkarokMenni
{
    private RobotSE rob;
    
    public kiAkarokMenni(RobotSE robi)
    {
        rob=robi;
    }
    
    public void getout()
    {
        rob.turnLeft();
        rob.turnLeft();
        
        while (rob.frontIsClear() && rob.getStreet() > 1)
        {
            rob.move();
        }
        
        if (rob.getStreet() <= 1) 
        {
            //program finished, no need for further program execution
            return;
        } 
        else
        {
            rob.turnRight();

        }
        
        while(rob.frontIsClear())
        {
            rob.move();
        }
        
        if(rob.getStreet()>1)
        {
            rob.turnLeft(2);
            rob.move(2);
            rob.turnRight();
            rob.move();
        }
    }
}
        
            
    
    


        
        
        
    

            

        