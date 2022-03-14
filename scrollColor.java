/*. Create 3 scroll bars for red, green, and blue and display them in a frame. 
Write a Java program to change the background color of the frame according 
to the value selected in the scroll bar.*/

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class panel1 extends JPanel implements AdjustmentListener
{
    JScrollBar r,b,g;
    int x,y,z;

    public panel1()
    {   setLayout(null);
        r = new JScrollBar(Scrollbar.VERTICAL,0,3,0,256);
        r.setSize(30,100);
        r.setLocation(30,30);
        b = new JScrollBar(Scrollbar.VERTICAL,0,3,0,256);
        b.setSize(30,100);
        b.setLocation(80,30);
        g = new JScrollBar(Scrollbar.VERTICAL,0,3,0,256);
        g.setSize(30,100);
        g.setLocation(150,30);


        r.addAdjustmentListener(this);
        b.addAdjustmentListener(this);
        g.addAdjustmentListener(this);

        add(r);
        add(b);
        add(g);
    }

    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        if( ae.getAdjustable() == r )
            x=ae.getValue();
        if(ae.getAdjustable() == b)
            y =ae.getValue();
        if(ae.getAdjustable() == g)
            z=ae.getValue();
        Color c = new Color(x,y,z);
         setBackground(c);
    }

  
}

class frame1 extends JFrame 
{
    public frame1()
    {   setVisible(true);
        setSize(500,400);
        setTitle("Made by harish rane");

        panel1 p = new panel1();
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class scrollColor
{
    public static void main(String args[])
    {
        frame1 f = new frame1();

    }
}