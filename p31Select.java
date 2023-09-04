import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class p31Select {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(600, 600);
        String[] CollegeName = {"Select College", "Sveri", "Walchand", "coep", "KBP"};
        JComboBox<String> cb = new JComboBox<>(CollegeName);
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(200, 200));
        p.add(cb);

        JTextField t = new JTextField();
        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                String str = cb.getSelectedItem().toString();
                t.setText("Selected College is: " + str);
            }
        });
        t.setBounds(50, 50, 300, 50);
        p.add(t);
        f.add(p);
    }
}
