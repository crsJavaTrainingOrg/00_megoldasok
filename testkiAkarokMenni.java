import becker.robots.*;

public class testkiAkarokMenni
{
    public static void test()
    {
        City graz = new City();
        RobotSE robert = new RobotSE(graz,6,4,Direction.SOUTH);
        Wall wall1 = new Wall(graz,6,6,Direction.EAST);
        Wall wall2 = new Wall(graz,5,6,Direction.EAST);
        Wall wall3 = new Wall(graz,4,6,Direction.EAST);
        Wall wall4 = new Wall(graz,3,6,Direction.EAST);
        Wall wall5 = new Wall(graz,2,6,Direction.EAST);
        Wall wall6 = new Wall(graz,2,6,Direction.NORTH);
        Wall wall7 = new Wall(graz,2,5,Direction.NORTH);
        
        Wall wall9 = new Wall(graz,2,3,Direction.NORTH);
        Wall wall10 = new Wall(graz,2,2,Direction.NORTH);
        Wall wall11 = new Wall(graz,2,2,Direction.WEST);
        Wall wall12 = new Wall(graz,3,2,Direction.WEST);
        Wall wall13 = new Wall(graz,4,2,Direction.WEST);
        Wall wall14 = new Wall(graz,5,2,Direction.WEST);
        Wall wall16 = new Wall(graz,6,2,Direction.WEST);
        Wall wall17 = new Wall(graz,6,2,Direction.SOUTH);
        Wall wall18 = new Wall(graz,6,3,Direction.SOUTH);
        Wall wall19 = new Wall(graz,6,4,Direction.SOUTH);
        Wall wall20 = new Wall(graz,6,5,Direction.SOUTH);
        Wall wall21 = new Wall(graz,6,6,Direction.SOUTH);
        kiAkarokMenni kiakarokmenni = new kiAkarokMenni(robert);
        kiakarokmenni.getout();
        
        
    }
}
