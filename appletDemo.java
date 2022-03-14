import java.applet.*;
import java.util.*;
import java.io.*;
import java.awt.*;

public class appletDemo extends Applet
{
    public void init()
    {
        String s ="HELLO MY FIRST APPLET PROGRAM";
    }
    public void paint(Graphics g)
    {
        Color c = new Color(225,161,120);
        g.setColor(c);
        g.drawOval(100, 100, 250, 250);
        g.fillOval(100, 100, 250, 250);
        g.setColor(Color.black);
        g.drawOval(160, 185, 40, 25);
        g.fillOval(160,185,40,25);
        g.drawOval(250, 185, 40, 25);
        g.drawArc(160, 170, 35, 10, 0, 180);
        g.drawArc(250, 170, 35, 10, 0, 180);
        g.drawLine(210, 265, 210, 275);
        g.drawArc(175, 300, 100, 50, 0, -180);

    }
    public void start()
    {
        repaint();
    }
}