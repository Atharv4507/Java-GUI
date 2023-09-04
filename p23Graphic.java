import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.*;
public class p23Graphic extends JFrame{
    Image image;
    p23Graphic(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        image = new ImageIcon("rSpace.jpeg").getImage();
        this.setPreferredSize(new Dimension(500,500));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g; 

        g2d.drawImage(image, 0, 0, null);
        
        g2d.setPaint(Color.BLUE);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(0, 0, 500, 500);

        g2d.setPaint(Color.pink);
        g2d.drawRect(100, 50, 100, 200);
        g2d.fillRect(100, 50, 100, 200);

        g2d.setPaint(Color.green);
        g2d.drawOval(300, 50, 50, 50);
        g2d.fillOval(300, 50, 50, 50);
        
        g2d.setPaint(Color.yellow);
        int[] x = {150,250,350};
        int y[] = {300,150,300};
        g2d.fillPolygon(x,y,3);

        g2d.setPaint(Color.red);
        g2d.setFont(new Font("Ink Free",Font.BOLD,32));
        g2d.drawString("Nice!", 400, 100);
    }
    public static void main(String[] args) {
        p23Graphic p = new p23Graphic();
        System.out.println(p);
    }
}
