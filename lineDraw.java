/*Create a Java application that handles the mouse event. User should able to 
draw the line from the point where the mouse button pressed, to the point 
where the mouse button released. Each line should be drawn with different 
color.*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.util.Random;

class mpanel extends JPanel
{
    int x1,x2,y1,y2;

    public mpanel()
    {
        this.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent me)
            {
                x1 = me.getX();
                y1 = me.getY();

            }

            public void mouseReleased(MouseEvent me)
	    	{
		    	x2=me.getX();
			    y2=me.getY();
			    repaint();
			
		    }	
        }
        );
    }
    public void paint(Graphics g)
    {
        Random rand = new Random();
        float r=rand.nextFloat();
		float g1=rand.nextFloat();
		float b=rand.nextFloat();
		Color c=new Color(r,g1,b);
		g.setColor(c);
		g.drawLine(x1,y1,x2,y2);
    }
}

class mouseframe extends JFrame
{
   mouseframe()
   {
       mpanel m = new mpanel();
       add(m);
       setSize(400,400);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}


public class lineDraw
{
    public static void main(String arsg[])
    {
        mouseframe m = new mouseframe();
    }
}
