import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class p6BorderLayout {
    public static void main(String[] args) {
        AMyFrame f = new AMyFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout(10,10));
        f.setSize(500,500);
        f.setVisible(true);

        JPanel p0 = new JPanel();
        p0.setBackground(Color.BLACK);
        p0.setPreferredSize(new Dimension(500,500));

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        p1.setBackground(Color.red);
        p2.setBackground(Color.green);
        p3.setBackground(Color.yellow);
        p4.setBackground(Color.magenta);
        p5.setBackground(Color.blue);

        p1.setPreferredSize(new Dimension(100,100));
        p2.setPreferredSize(new Dimension(100,100));
        p3.setPreferredSize(new Dimension(100,100));
        p4.setPreferredSize(new Dimension(100,100));
        p5.setPreferredSize(new Dimension(100,100));

        f.add(p1,BorderLayout.NORTH);
        f.add(p2,BorderLayout.WEST);
        f.add(p3,BorderLayout.EAST);
        f.add(p4,BorderLayout.SOUTH);
        f.add(p5,BorderLayout.CENTER);

        // p0.add(p1,BorderLayout.NORTH);
        // p0.add(p2,BorderLayout.WEST);
        // p0.add(p3,BorderLayout.EAST);
        // p0.add(p4,BorderLayout.SOUTH);
        // p0.add(p5,BorderLayout.CENTER);
        // f.add(p0);
        
        // sub paneal
        // you can comment out if you want to see blue color in center
        
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel();
        JPanel p9 = new JPanel();
        JPanel p10 = new JPanel();

        p6.setBackground(Color.gray);
        p7.setBackground(Color.black);
        p8.setBackground(Color.BLACK);
        p9.setBackground(Color.gray);
        p10.setBackground(Color.white);

        p5.setLayout(new BorderLayout(5,5));

        p6.setPreferredSize(new Dimension(50,50));
        p7.setPreferredSize(new Dimension(50,50));
        p8.setPreferredSize(new Dimension(50,50));
        p9.setPreferredSize(new Dimension(50,50));
        p10.setPreferredSize(new Dimension(50,50));

        //  to put paneal inside the paneal use the paneal name and do this
        p5.add(p6,BorderLayout.NORTH);
        p5.add(p7,BorderLayout.WEST);
        p5.add(p8,BorderLayout.EAST);
        p5.add(p9,BorderLayout.SOUTH);
        p5.add(p10,BorderLayout.CENTER);

    }
}
