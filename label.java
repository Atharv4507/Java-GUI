// package GUI; //delet it program will run

import java.awt.event.*;
import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class label {
    public static void main(String[] args) {
        JFrame f = new JFrame("college");
        JLabel i = new JLabel("Sveri");
        i.setBounds(100, 100, 100, 100);
        f.add(i);
        f.setLayout(null);
        f.setSize(600,600);
        f.setVisible(true);
        JTextField t = new JTextField("Sveri");
        t.setBounds(200, 90, 100, 30);
        f.add(t);
        JButton b = new JButton("submit");
        b.setBounds(200, 170, 100, 30);
        f.add(b);
        b.addActionListener((ActionListener) new ActionListener(){public void actionPerformed(ActionEvent e) {t.setText("Pandharpur");}});
          
    }
}
