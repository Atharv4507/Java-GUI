import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class p17MenuBar extends JFrame implements ActionListener {

    JMenuBar m;
    JMenu file;
    JMenu edit;
    JMenu help;
    JMenuItem load;
    JMenuItem save;
    JMenuItem exit;
    ImageIcon icon1;
    ImageIcon icon2;
    ImageIcon icon3;

    p17MenuBar() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setBounds(0, 0, 420, 420);

        icon1 = new ImageIcon("icon8.jpeg");
        icon2 = new ImageIcon("icon9.png");
        icon3 = new ImageIcon("icon10.jpeg");

        m = new JMenuBar();

        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        file.setIcon(icon1);
        edit.setIcon(icon2);
        help.setIcon(icon3);

        load = new JMenuItem("load");
        save = new JMenuItem("save");
        exit = new JMenuItem("exit");

        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        file.setMnemonic(KeyEvent.VK_F);
        edit.setMnemonic(KeyEvent.VK_E);
        help.setMnemonic(KeyEvent.VK_H);

        load.setMnemonic(KeyEvent.VK_L);
        save.setMnemonic(KeyEvent.VK_S);
        exit.setMnemonic(KeyEvent.VK_E);

        file.add(load);
        file.add(save);
        file.add(exit);

        m.add(file);
        m.add(edit);
        m.add(help);

        this.setJMenuBar(m);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==load) {
            System.out.println("Your file is loaded");
        }
        if (e.getSource()==save) {
            System.out.println("Your file is saved");
        }
        if (e.getSource()==exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        p17MenuBar p = new p17MenuBar();
        System.out.println(p);
    }
}
