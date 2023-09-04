import javax.swing.JButton;
import java.awt.GridLayout;
public class p8GreedLayout {
    public static void main(String[] args) {
        AMyFrame f = new AMyFrame();
        f.setLayout(new GridLayout(3,3,10,10));

        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("7"));
        f.add(new JButton("8"));
        f.add(new JButton("9"));
    }
}
