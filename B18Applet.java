import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class B18Applet extends  JFrame {
    B18Applet(){
//        JFrame f = new JFrame();
//        f.setVisible(true);
//        f.setSize(550,550);
//        f.setTitle("login");
//        f.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(500,500));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 =  (Graphics2D) g;

        g2.setPaint(Color.red);
        g2.setFont(new Font("Ink Free",Font.BOLD,32));
        g2.drawString("Atharv",150,150);

    }

    public static void main(String[] args) {
       B18Applet b = new B18Applet();
        System.out.println(b);
    }
}
