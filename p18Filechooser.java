import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class p18Filechooser extends JFrame implements ActionListener {
    JButton b;

    p18Filechooser() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        b = new JButton("select file");
        b.addActionListener(this);

        this.add(b);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            JFileChooser f = new JFileChooser();
            // System.out.println(f.showOpenDialog(null));

            int r = f.showOpenDialog(null); // select file to open(open button)
            // int r = f.showSaveDialog(null); // select file to save(save button)
            if (r == JFileChooser.APPROVE_OPTION) {
                File file = new File(f.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
            
        }
    }

    public static void main(String[] args) {
        p18Filechooser p = new p18Filechooser();
        System.out.println(p);
    }
}
