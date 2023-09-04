import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class p11Textfild extends JFrame implements ActionListener{
    
    JTextField t;
    JButton b;
    p11Textfild(){
        t = new JTextField();
        b = new JButton("Submit");
        b.addActionListener(this);

        this.setSize(420,420);
        this.setTitle("main");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("icon.jpeg");
        this.setIconImage(image.getImage());
        
        this.setLayout(new FlowLayout());

        t.setPreferredSize(new Dimension(250, 140));
        // t.setForeground(new color(0x00FF00));
        t.setBackground(Color.BLACK);
        t.setCaretColor(Color.WHITE);
        
        this.add(b);
        this.add(t);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b) {
            // b.setEnabled(true);
            // b.setEditable(false);
            System.out.println("Welcome "+t.getText());
        }
    }
    
    public static void main(String[] args) {
        p11Textfild p = new p11Textfild();
        System.out.println(p);
    }
}
/**
 * p11Textfild
*/
// public class p11Textfild {

//     public static void main(String[] args) {
//         AMyFrame f = new AMyFrame();
//         JTextField t = new JTextField();
//         f.pack();
//         f.setLayout(new FlowLayout());
//         t.setPreferredSize(new Dimension(250, 140));
//         f.add(t);
//     }
// }