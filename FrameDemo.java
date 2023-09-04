import java.awt.Frame;

public class FrameDemo {
    public FrameDemo() {

        Frame f = new Frame("First Frame Window");
        f.setVisible(true);
        f.setSize(500, 500);
        f.setTitle("Hello");
    }

    public static void main(String args[]) {

        new FrameDemo();
    }
}