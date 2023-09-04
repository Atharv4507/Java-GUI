import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class p4button{
    
    public static void main(String[] args) {
        AMyFrame f = new AMyFrame();
        JButton b = new JButton();
        ImageIcon Icon = new ImageIcon("icon2.jpeg");
        JLabel l = new JLabel();
        l.setIcon(Icon);
        l.setBounds(170, 170, 200, 50);
        l.setBackground(Color.yellow);
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
        f.add(l);
        f.add(b);
    }
    
    public void actionPerformed(ActionEvent e, Object b){
        if (e.getSource()==b) {
            System.out.println("Hi");
        }
    }
}
