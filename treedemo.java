import javax.swing.*;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class treedemo
{
public static void main(String[] args)
{
JFrame jf=new JFrame();
DefaultMutableTreeNode d1=new DefaultMutableTreeNode("Song");
DefaultMutableTreeNode d2=new DefaultMutableTreeNode("old Song");
DefaultMutableTreeNode d3=new DefaultMutableTreeNode("new Song");
DefaultMutableTreeNode d4=new DefaultMutableTreeNode("classical Song");
DefaultMutableTreeNode d5=new DefaultMutableTreeNode("Jawaan");
DefaultMutableTreeNode d6=new DefaultMutableTreeNode("KGF");
DefaultMutableTreeNode d7=new DefaultMutableTreeNode("DDLJ");
DefaultMutableTreeNode d8=new DefaultMutableTreeNode("Gajni");
d1.add(d2);
d1.add(d3);
d1.add(d4);
d2.add(d7);
d3.add(d5);
d3.add(d6);
d4.add(d8);
JTree jt=new JTree(d1);
jf.add(jt);
jf.setVisible(true);

}
}
