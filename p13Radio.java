import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p13Radio extends JFrame implements ActionListener {
    JRadioButton b1;
    JRadioButton b2;
    JRadioButton b3;
    ImageIcon i1;
    ImageIcon i2;
    ImageIcon i3;

    p13Radio() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        b1 = new JRadioButton("Pizza");
        b2 = new JRadioButton("Pav");
        b3 = new JRadioButton("Bhaji");

        ButtonGroup g = new ButtonGroup();
        g.add(b1);
        g.add(b2);
        g.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        i1 = new ImageIcon("icon3.png");
        i2 = new ImageIcon("icon6.jpeg");
        i3 = new ImageIcon("icon7.jpeg");

        b1.setIcon(i1);
        b2.setIcon(i2);
        b3.setIcon(i3);

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("You ordered a pizza");
        } else if (e.getSource() == b2) {
            System.out.println("You ordered a pav");
        } else if (e.getSource() == b3) {
            System.out.println("You ordered a Bhaji");
        }

    }

    public static void main(String[] args) {
        p13Radio p = new p13Radio();
        System.out.println(p);
    }
}
