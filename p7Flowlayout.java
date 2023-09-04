import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class p7Flowlayout {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(420,420);
        f.setTitle("main");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("icon.jpeg");
        f.setIconImage(image.getImage());
        f.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        f.setVisible(true);

        JPanel p = new JPanel();
        p.setPreferredSize(new  DimensionUIResource(150, 130));
        p.setBackground(Color.orange);
        p.setLayout(new FlowLayout());


        // -----Step 1 
        // JButton b = new JButton("1");
        // f.add(b);
        // -----or------
        // -----Step 2
        // f.add(new JButton("1"));


        p.add(new JButton("1"));
        p.add(new JButton("2"));
        p.add(new JButton("3"));
        p.add(new JButton("4"));
        p.add(new JButton("5"));
        p.add(new JButton("6"));
        p.add(new JButton("7"));
        p.add(new JButton("8"));
        p.add(new JButton("9"));
        p.add(new JButton("0"));

        f.add(p);

        
    }
}
