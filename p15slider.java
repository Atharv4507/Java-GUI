import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class p15slider extends JFrame implements ChangeListener {
    JPanel p;
    JLabel l;
    JSlider s;
    p15slider() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        p = new JPanel();
        l = new JLabel();
        s = new JSlider(0,100,36);

        s.setPreferredSize(new Dimension(200,400));
        s.setPaintTicks(true);
        s.setMinorTickSpacing(10);
        s.setPaintTrack(true);
        s.setMajorTickSpacing(10);
        s.setPaintLabels(true);
        s.setFont(new Font("Mv Boli",Font.PLAIN,10));
        s.setOrientation(SwingConstants.VERTICAL);
        s.addChangeListener(this);

        l.setText("°C"+s.getValue());
        l.setFont(new Font("Mv Boli",Font.PLAIN,25));
        
        p.add(l);
        p.add(s);
        this.add(p);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        l.setText("°C"+s.getValue());
    }

    public static void main(String[] args) {
        p15slider p = new p15slider();
        System.out.println(p);
    }
}
