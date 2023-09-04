import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p12checkbox extends JFrame implements ActionListener {

    JButton b;
    JCheckBox c;
    ImageIcon ck;
    ImageIcon x;
    p12checkbox() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        ck = new ImageIcon("icon4.png");
        x  = new ImageIcon("icon5.jpeg");

        b = new JButton();
        b.setText("submit");
        b.addActionListener(this);

        c = new JCheckBox();
        c.setText("I am human");
        c.setFocusable(false);
        c.setIcon(x);
        c.setSelectedIcon(ck);

        this.add(b);
        this.add(c);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            b.setEnabled(true);
            System.out.println(c.isSelected());
        }
    }

    public static void main(String[] args) {
        p12checkbox p = new p12checkbox();
        System.out.println(p);
    }
}
