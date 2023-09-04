import javax.swing.*;

public class tabdemo {

    public static void main(String args[]) {

        JFrame jf = new JFrame();
        JTabbedPane jtp = new JTabbedPane();
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        JPanel jp4 = new JPanel();
        JButton jb1 = new JButton("B1");
        JButton jb2 = new JButton("B2");
        JButton jb3 = new JButton("B3");
        JButton jb4 = new JButton("B4");
        jp1.add(jb1);
        jp2.add(jb2);
        jp3.add(jb3);
        jp4.add(jb4);

        jtp.add("First Panel-Tab", jp1);
        jtp.add("Second Panel-Tab", jp2);
        jtp.add("Third Panel-Tab", jp3);
        jtp.add("Fourth Panel-Tab", jp4);
        jf.add(jtp);
        jf.setVisible(true);
    }
}