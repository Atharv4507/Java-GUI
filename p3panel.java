import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class p3panel {
    public static void main(String[] args) {
        AMyFrame f = new AMyFrame();
        f.setSize(720,720);
        JPanel redpPanel = new JPanel();
        redpPanel.setBackground(Color.RED);
        redpPanel.setBounds(0,0,410,410);

        JPanel greenpPanel = new JPanel();
        greenpPanel.setBackground(Color.green);
        greenpPanel.setBounds(410,0,410,410);

        JPanel bluepPanel = new JPanel();
        bluepPanel.setBackground(Color.blue);
        bluepPanel.setBounds(0,410,720,410);

        JLabel l = new JLabel();
        l.setText("Hi");

        ImageIcon image = new ImageIcon("icon2.jpeg");
        l.setIcon(image);
        l.setBounds(0, 0, 50, 50);
        redpPanel.add(l);

        f.setLayout(null);
        f.add(redpPanel);
        f.add(greenpPanel);
        f.add(bluepPanel);
    }  
}
