
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class p19colorchuser extends JFrame implements ActionListener{

    JButton b;
    JButton b1;
    JLabel l;

    p19colorchuser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        b = new JButton("Pick a color");
        b.addActionListener(this);

        b1 = new JButton("Pick a bg color");
        b1.addActionListener(this);

        l = new JLabel();
        l.setBackground(Color.WHITE);
        l.setText("This is some Text :D");
        l.setFont(new Font("MV Boli",Font.PLAIN,100));
        l.setOpaque(true);

        this.add(b);
        this.add(b1);
        this.add(l);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b) {
            // JColorChooser cc = new JColorChooser();
            Color c = JColorChooser.showDialog(null, "Pick a color...", Color.BLACK);

            l.setForeground(c);
        }
        if (e.getSource()==b1) {
            // JColorChooser cc = new JColorChooser();
            Color c = JColorChooser.showDialog(null, "Pick a color...", Color.BLACK);

            l.setBackground(c);
        }
    }
    public static void main(String[] args) {
        p19colorchuser p = new p19colorchuser();
        System.out.println(p);
    }
}
