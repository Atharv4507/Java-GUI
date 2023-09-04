
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
public class p20game1 extends JFrame implements KeyListener{

    JLabel l;
    JLabel l1;
    ImageIcon icon;
    ImageIcon icon1;
    JLayeredPane lp;
    p20game1(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("rocketicon1.jpeg");
        icon1 = new ImageIcon("rSpace.jpeg");

        lp = new JLayeredPane();

        l = new JLabel();
        l.setBounds(0,0,100,100);
        l.setIcon(icon);
        l.setBackground(Color.BLACK);
        l.setOpaque(true);

        l1 = new JLabel();
        l1.setBounds(0,0,500,500);
        l1.setIcon(icon1);
        l1.setOpaque(true);

        lp.add(l,JLayeredPane.DEFAULT_LAYER); // 1st way
        lp.add(l1, Integer.valueOf(2));    // 2nd way
        
        this.getContentPane().setBackground(Color.BLACK);
        this.add(l);
        this.add(l1);
        this.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37 :l.setLocation(l.getX()-10,l.getY());
                break;
            case 38 :l.setLocation(l.getX(),l.getY()-10);
                break;
            case 40:l.setLocation(l.getX(),l.getY()+10);
                break;
            case 39:l.setLocation(l.getX()+10,l.getY());
                break;
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You Relese key char: "+e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':l.setLocation(l.getX()-10,l.getY());
                break;
            case 'w':l.setLocation(l.getX(),l.getY()-10);
                break;
            case 's':l.setLocation(l.getX(),l.getY()+10);
                break;
            case 'd':l.setLocation(l.getX()+10,l.getY());
                break;
            default:System.out.println("Wrong key bro!");
                break;
        }
    }

    public static void main(String[] args) {
        p20game1 p = new p20game1();
        System.out.println(p);

    }
}
