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
        
        while (true)
        {
            if(rob.frontIsClear()==false || rob.getStreet()>1==false)break;
            rob.move();
        }
        
        if(rob.getStreet()>1)
        {
            rob.turnRight();
        }
        
        while(true)
        {
            if(rob.getAvenue()<6==false || rob.getStreet()>1==false)break;
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
        
            
    
    


        
        
        
    

            

        