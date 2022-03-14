/*Design three text boxes and two buttons on the form. Enter two different 
strings in first and second textbox. On clicking the First command button, 
concatenation of two strings should be displayed in third text box and on 
clicking second command button, reverse of string should display in third 
text box.*/

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class panel extends JPanel implements ActionListener
{
    JTextField t1,t2,t3;
    JButton b1,b2;

    public panel()
    {  
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        b1=new JButton("Concatenation");
		b2=new JButton("Reverse");
        // t1.setBounds(50,100,250,250);
        // t2.setBounds(110,110,250,250);
		// t3.setBounds(200,200,250,250);
		// b1.setBounds(80,80,50,50);
		// b2.setBounds(90,90,50,50);
        add(t1);
        add(t2);
		add(t3);
		add(b1);
		add(b2);

        b1.addActionListener(this);
		b2.addActionListener(this);
		
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String s1=t1.getText();
			String s2=t2.getText();
            String s3=s1.concat(s2);
            t3.setText(s3);
        }
        else if(ae.getSource()==b2)
        {
            String s1=t1.getText();
			String s2=t2.getText();
            String s3=s1.concat(s2);
            String rev="";
			for(int j=s3.length()-1;j>=0;j--)
			{
				rev=rev+s3.charAt(j);
			}
			t3.setText(rev);

        }
    }
}

class frame extends JFrame
{
    frame()
    {   
        panel p = new panel();
        add(p);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class formDemo
{
    public static void main(String args[])
    {
        frame f =new frame();
    }
}