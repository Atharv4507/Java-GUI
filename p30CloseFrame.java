import java.awt.*;
import java.awt.event.*;
public class p30CloseFrame extends Frame implements ActionListener{
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(200, 200);
        Label l = new Label("Click on close button to close this Frame");
        l.setBounds(20, 50, 155, 30);
        Button b = new Button("Close");
        b.setBounds(50, 50, 50, 30);
        f.add(l);
        f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                f.dispose();
            }
        });
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
