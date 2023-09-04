import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class p22DragDrop extends JPanel{

    
    JLabel Label;
    ImageIcon icon;
    final int WIDTH;
    final int HEIGHT;
    Point imageCorner;
    Point prevPt;
    p22DragDrop p = new p22DragDrop();
    p22DragDrop() {
        
        AMyFrame f = new AMyFrame();
        icon = new ImageIcon("icon6.jpeg");
        WIDTH = icon.getIconWidth();
        HEIGHT =  icon.getIconHeight();
        
        imageCorner = new Point(0, 0);
        ClickListener cl = new ClickListener();
        DragListener dl = new DragListener();

        Label = new JLabel();
        Label.setBounds(0, 0, 100, 100);
        Label.setIcon(icon);
        
        this.addMouseListener(cl);
        this.addMouseMotionListener(dl);
        f.add(p);

        this.setVisible(true);
    }

    public void PaintComponent(Graphics g) {
        this.paintComponents(g);
        icon.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();

        }
    }

    private class DragListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e) {
            Point currePoint = e.getPoint();
            imageCorner.translate((int) (currePoint.getX() - prevPt.getX()),
                                (int) (currePoint.getY() - prevPt.getY()));
            prevPt = currePoint;
            repaint();
        }
    }

    public static void main(String[] args) {
        AMyFrame f = new AMyFrame();
        p22DragDrop p = new p22DragDrop();
        System.out.println(p);
        f.add(p);
    }
}
