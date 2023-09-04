import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class p5button2 extends JFrame implements ActionListener {

    JButton b;
    JLabel l;

    p5button2() {
        AMyFrame f = new AMyFrame();
        b = new JButton();
        ImageIcon Icon = new ImageIcon("icon2.jpeg");
        l = new JLabel();
        l.setIcon(Icon);
        l.setBounds(170, 170, 200, 50);
        b.setBounds(100, 100, 150, 50);
        b.addActionListener(e -> System.out.println("Hi"));
        b.setText("I'm a Button!");
        b.setFocusable(false);
        b.setIcon(Icon);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setIconTextGap(5);
        b.setForeground(Color.CYAN);
        b.setBackground(Color.GRAY);
        b.setBorder(BorderFactory.createEtchedBorder());
        b.addActionListener(this);
        f.add(l);
        f.add(b);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b) {
            System.out.println("Hi");
            l.setVisible(true);
        }
    }
    public static void main(String[] args) {
        p5button2 p = new p5button2();
        System.out.println(p);
    }
}
