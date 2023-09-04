import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class p9LayeredPane {
    public static void main(String[] args) {
        AMyFrame f = new  AMyFrame();
        JLayeredPane lp = new JLayeredPane();
        lp.setBounds(0, 0, 420, 420);

        JLabel l = new JLabel();
        l.setOpaque(true);
        l.setBackground(Color.RED);
        l.setBounds(50, 50, 150, 150);

        JLabel l1 = new JLabel();
        l1.setOpaque(true);
        l1.setBackground(Color.green);
        l1.setBounds(100, 100, 150, 150);

        JLabel l2 = new JLabel();
        l2.setOpaque(true);
        l2.setBackground(Color.BLUE);
        l2.setBounds(150, 150, 150, 150);

        // to place the layer on top there are 7 types you van use that by following methods
        lp.add(l,JLayeredPane.DEFAULT_LAYER); // 1st way
        lp.add(l1, Integer.valueOf(2));    // 2nd way
        lp.add(l2);

        f.add(lp);

        // It works like it also but dont know why they use JLayeredPaneal
        // I got ans.
        // f.add(l);
        // f.add(l1);
        // f.add(l2);


    }
}
