import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel; 
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class p2label {
    public static void main(String[] args) {
        AMyFrame f = new AMyFrame();
        JLabel l = new JLabel();
        l.setText("Bro,do you even code");
        ImageIcon image = new ImageIcon("icon1.jpeg");
        Border b = BorderFactory.createLineBorder(Color.BLUE);
        
        l.setIcon(image);
        l.setHorizontalTextPosition(SwingConstants.CENTER);
        l.setVerticalTextPosition(SwingConstants.TOP);
        l.setForeground(Color.BLUE);
        l.setFont(new Font("My Boli",Font.ITALIC,20));
        l.setIconTextGap(-25);
        l.setBackground(Color.BLACK);
        l.setOpaque(true);
        l.setBorder(b);
        l.setVerticalAlignment(JLabel.CENTER);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBounds(0, 0, 410, 410); //Except use pack() at end
        f.setLayout(null);

        
        
        f.add(l);
        // f.pack(); 
        f.setVisible(true);
    }   

}
