import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class p21MouseListen extends JFrame implements MouseListener{

    JLabel l;
    ImageIcon icon11;
    ImageIcon icon12;
    ImageIcon icon13;
    ImageIcon icon14;
    ImageIcon icon15;
    p21MouseListen(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        icon11 = new ImageIcon("icon11.jpeg");
        icon12 = new ImageIcon("icon12.png");
        icon13 = new ImageIcon("icon13.jpeg");
        icon14 = new ImageIcon("icon14.jpeg");
        icon15 = new ImageIcon("icon15.jpeg");

        l = new JLabel();
        l.setBounds(0, 0, 500, 500);
        l.setBackground(Color.red);
        l.setOpaque(true);
        l.addMouseListener(this);

        this.add(l);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked a mouse");
        l.setBackground(Color.pink);
        l.setText("You clicked a mouse");
        l.setIcon(icon11);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You Entered in a component");
        l.setBackground(Color.BLUE);
        l.setText("You Entered out of a component");
        l.setIcon(icon12);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You Exited out of a component");
        l.setBackground(Color.RED);
        l.setText("You Exited out of a component");
        l.setIcon(icon13);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setBackground(Color.YELLOW);
        l.setText("You clicked a mouse");
        l.setIcon(icon14);
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You Relesed a mouse");
        l.setBackground(Color.GREEN);
        l.setText("You relesed a mouse");
        l.setIcon(icon15);
    }

    public static void main(String[] args) {
        p21MouseListen p = new p21MouseListen();
        System.out.println(p);
    }
}
