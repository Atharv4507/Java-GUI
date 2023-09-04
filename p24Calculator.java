import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p24Calculator extends JFrame implements ActionListener{
    JButton b0;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b10;
    JButton b11;
    JButton b12;
    JButton b13;
    JButton b14;
    JButton b15;
    JButton b16;
    JPanel panel;
    JTextField t;
    String s0,s1,s2;

    p24Calculator(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        this.setBounds(0, 0, 240, 240);
        this.setTitle("Calculator");
        ImageIcon image = new ImageIcon("icon.jpeg");
        this.setIconImage(image.getImage());
        this.setPreferredSize(new Dimension(240,250));
        this.setBackground(Color.black);

        panel = new JPanel();
        panel.setPreferredSize(new  DimensionUIResource(200, 200));
        panel.setBackground(Color.orange);
        panel.setLayout(new FlowLayout());

        t = new JTextField(16);
        t.setEditable(true);

        s0 = s1 = s2 ="";

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton(".");
        b11 = new JButton("C");
        b12 = new JButton("+");
        b13 = new JButton("-");
        b14 = new JButton("*");
        b15 = new JButton("/");
        b16 = new JButton("=");

        
        panel.add(t);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b12);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b13);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b14);
        panel.add(b10);
        panel.add(b0);
        panel.add(b11);
        panel.add(b15);
        panel.add(b16);

        t.addActionListener(this);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);

        this.add(panel);
        // this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        
        String s = e.getActionCommand();
 
        // if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
 
            // set the value of text
            t.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {
            // clear the one letter
            // s0 = s1 = s2 = "";
 
            // set the value of text
            t.setText(" ");
        }
        else if (s.charAt(0) == '=') {
 
            double te;
 
            // store the value in 1st
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
            // set the value of text
            t.setText(s0 + s1 + s2 + "=" + te);
 
            // convert it to string
            s0 = Double.toString(te);
 
            s1 = s2 = "";
        }
        else {
            // if there was no operand
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            // else evaluate
            else {
                double te;
 
                // store the value in 1st
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
                // convert it to string
                s0 = Double.toString(te);
 
                // place the operator
                s1 = s;
 
                // make the operand blank
                s2 = "";
            }
 
            // set the value of text
            t.setText(s0 + s1 + s2);
        }    


    }
    public static void main(String[] args) {
        
        p24Calculator p = new p24Calculator();
        System.out.println(p);
    }
}
