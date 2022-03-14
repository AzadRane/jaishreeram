/*0. Create a package for Games, which have two sub packages Indoor and 
Outdoor. Add classes Cricket, Hockey, and Football in it. Add appropriate 
methods in each class which accepts and displays information of players for 
that game. Use a function display() to generate the list of players for the 
specific games. Use default and parameterized constructors.
*/


import Games.indoor.Chess;
import Games.outdoor.Cricket;
import Games.outdoor.Football;
import Games.outdoor.Hockey;

public class gamesDemo
{
    public static void main(String args[])
    {
        
        Cricket c1 = new Cricket();
        System.out.println("cricket :"+c1.disp());
        Football f1 = new Football();
        System.out.println("Football :"+f1.disp());
        Chess ch =new Chess("harish");
        System.out.println("Chess :"+ch.disp());
        Hockey h =new Hockey();
        System.out.println("Hockey :"+h.disp());

    }
}