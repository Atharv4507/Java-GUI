import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class B17login_form  extends JFrame{
    JLabel l1;
    JLabel l2;
    JTextField t1;
    JTextField t2;
    JButton b1;
    JButton b2;
    public B17login_form(){
        JLabel l1 = new JLabel("Username: ");
        l1.setBounds(100,100,90,15);
        l1.setFont(new Font("fantasy", Font.BOLD,14));
        JTextField t1 = new JTextField();
        t1.setBounds(300,100,100,30);
        JLabel l2 = new JLabel("Your userName ");
        l2.setBounds(100,200,90,15);
        l2.setFont(new Font("fantasy", Font.BOLD,14));
        JTextField t2 = new JTextField();
        t2.setBounds(300,200,100,30);

        JButton b1 = new JButton("Save");
        b1.setBounds(300,300,80,30);
        JButton b2 = new JButton("copy");
        b2.setBounds(100,300,80,30);
        JButton b3 = new JButton("Update");
        b3.setBounds(100,500,80,30);

        JFrame f = new JFrame();
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b2);
        f.add(b1);
        f.add(b3);
        f.setVisible(true);
        f.setSize(550,550);
        f.setTitle("login");
        f.setLayout(null);

    }
    public static void main(String[] args) {
        new B17login_form();

    }
}
