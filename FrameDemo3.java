import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.List;
import java.awt.Choice;

public class FrameDemo3 {
    public FrameDemo3() {
        Label l1 = new Label("user name");
        Label l2 = new Label("Password");
        Label l3 = new Label("Address");
        TextField t1 = new TextField("user name", 35);
        TextField t2 = new TextField("PAssword", 35);

        TextArea a1 = new TextArea();


        Button b1 = new Button("Save");
        Button b2 = new Button("Update");
        Button b3 = new Button("Delete");
        List li1 = new List();
        Label l4 = new Label("College NAmes");
        Label l5 = new Label("Branches");

        Choice c1 = new Choice();

        c1.addItem("CSE");
        c1.addItem("ENTC");
        c1.addItem("MECH");

        li1.addItem("SVERI");
        li1.addItem("SVIT");
        li1.addItem("WIT");
        li1.addItem("BMIT");


        Frame F = new Frame();
//add(l1);
        F.add(t1);
//add(l2);
        F.add(t2);
        F.add(l3);
        F.add(a1);
        F.add(l4);
        F.add(li1);
        F.add(l5);
        F.add(c1);
        F.add(b1);
        F.add(b2);
        F.add(b3);
        F.setVisible(true);
        F.setSize(500, 500);
        F.setTitle("Hello");
        F.setLayout(new FlowLayout());

    }

    public static void main(String args[]) {

        new FrameDemo3();
    }
}