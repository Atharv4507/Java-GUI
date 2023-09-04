import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.List;

public class list {
public list()
{
List li1=new List();
li1.addItem("SVERI");
li1.addItem("SVIT");
li1.addItem("WIT");
li1.addItem("BMIT");


Frame F=new Frame();
//add(l1);

F.add(li1);

F.setVisible(true);
F.setSize(500,500);
F.setTitle("Hello");
F.setLayout(new FlowLayout());

}
public static void main(String args[])
{

new list();
}
}