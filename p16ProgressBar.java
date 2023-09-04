import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class p16ProgressBar extends JFrame {
    JProgressBar pb;

    public void fill() {
        int counter = 0;
        while (counter <= 100) {
            pb.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
            counter += 1;
        }
        pb.setString("Done :)");
    }

    p16ProgressBar() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pb = new JProgressBar();
        pb.setValue(0);
        pb.setBounds(0, 0, 400, 70);
        pb.setForeground(Color.RED);
        pb.setBackground(Color.BLACK);
        pb.setStringPainted(true);

        this.add(pb);
        this.setLayout(null);
        this.setSize(420, 120);
        this.setVisible(true);
        fill();
    }


    public static void main(String[] args) {
        p16ProgressBar p = new p16ProgressBar();
        System.out.println(p);
    }
}
