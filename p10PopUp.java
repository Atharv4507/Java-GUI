import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class p10PopUp {
    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.ERROR_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.WARNING_MESSAGE);

        // JOptionPane.showInputDialog(null, "Do tou copy?", "title", JOptionPane.OK_CANCEL_OPTION);
        
        // String S = JOptionPane.showInputDialog(null, "Do tou copy?", "title", JOptionPane.OK_CANCEL_OPTION);
        // System.out.println("s: "+S);

        // JOptionPane.showConfirmDialog(null, "Do you copy?", "hey", JOptionPane.YES_NO_CANCEL_OPTION);
        // System.out.println(JOptionPane.showConfirmDialog(null, "Do you copy?", "hey", JOptionPane.YES_NO_CANCEL_OPTION));

        ImageIcon icon = new ImageIcon("icon2.jpeg");// icon
        String[] responce = {"ok","no","Exit"};//after icon
        JOptionPane.showOptionDialog(null, "Hey", "T", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responce, 0);
        
    }
}
