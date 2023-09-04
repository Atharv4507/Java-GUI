import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p14combobox extends JFrame implements ActionListener{

    JComboBox cb;
    p14combobox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String[] animals = {"dog","cat","bird"};

        cb = new JComboBox<>(animals);

        cb.addActionListener(this);

        this.add(cb);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cb) {
            System.out.print(cb.getSelectedItem()+" ");
            System.out.println(cb.getSelectedIndex());
        }
    }

    public static void main(String[] args) {
        p14combobox p = new p14combobox();
    }
}
