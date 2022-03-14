/*Create a Java application which handles mouse event. The application should 
count and display the consecutive mouse click counts, and display it back to 
the user. i. e. Number of times user do single click, double click, etc.*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mpanel extends JPanel
{
    int one,two,three;

    mpanel()
    {
        one=two=three=0;
        this.addMouseListener(new MouseAdapter(){
             public void mouseClicked(MouseEvent me)
             {
                    if(me.getClickCount()==1)
                    {
                        one++;
                        repaint();
                        //System.out.println("Hello1");
                    }
                    else if(me.getClickCount()==2)
                    {
                        one--;
                        two++;
                        repaint();
                    }
                    else if(me.getClickCount()==3)
                    {
                        one--;
                        two--;
                        three++;
                        repaint();
                    }
             }
        });
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        String s1 = String.valueOf(one);
        String s2 = String.valueOf(two);
        String s3 = String.valueOf(three);
        g.drawString(s1,100,100);
		g.drawString(s2,200,200);
		g.drawString(s3,300,300);
        System.out.println("Hello");
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

public class mouseClick
{
    public static void main(String args[])
    {
        mouseframe mf = new mouseframe();
    }
}