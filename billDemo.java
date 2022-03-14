/*Create a Java GUI application that contains the online order purchase form 
with Item Number, Item Name, Rate per Item, and Quantity of Item Ordered. 
After accepting the information of Item, it should calculate the total amount to 
be paid by user as bill.*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class panel1 extends JPanel implements ActionListener
{
    int ino,quantity;
    String name;
    float rate;
    JTextField t1,t2,t3,t4;
    JTextField t5;
    JButton b1;
    public panel1()
    {  
        t1 = new JTextField(20);
        t1.setText("ino ");
        t2 = new JTextField(20);
        t2.setText("name");
        t3 = new JTextField(20);
        t3.setText("rate");
        t4 = new JTextField(20);
        t4.setText("Quantitty");
        t5 = new JTextField(30);
        b1 = new JButton("Generate");
        //t1.setBounds(50,100,100,30);
        //t2.setBounds(50,150,100,30);
		//t3.setBounds(50,200,100,30);
		//b1.setBounds(150,300,100,40);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);

        add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {   int rate,quant,ans;
        if(ae.getSource()==b1)
        {
            rate = Integer.parseInt(t3.getText());
            quant = Integer.parseInt(t4.getText());
            ans = rate * quant;
            t5.setText(String.valueOf(ans));
        }

    }

}

class frame1 extends JFrame
{
    frame1()
    {   panel1 p = new panel1();
        add(p);
        setSize(500,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}   

public class billDemo
{
    public static void main(String args[])
    {
        frame1 f =new frame1();
    }
}