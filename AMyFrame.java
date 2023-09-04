import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class AMyFrame extends JFrame{
    
    AMyFrame(){
        this.setSize(420,420);
        this.setTitle("main");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("icon.jpeg");
        this.setIconImage(image.getImage());
        this.setLayout(null);
        this.setVisible(true);
    }
   
}
