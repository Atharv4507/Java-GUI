import java.awt.*;

public class createmenus extends Frame {
    public createmenus() {
        TextArea t1 = new TextArea();
        Menu file = new Menu("File");
        Menu firstEdit = new Menu("Edit");
        Menu view = new Menu("View");
        MenuBar mb = new MenuBar();
        MenuItem m1 = new MenuItem("New");
        MenuItem m2 = new MenuItem("Save");
        MenuItem m3 = new MenuItem("Open");
        MenuItem m4 = new MenuItem("Copy");
        MenuItem m5 = new MenuItem("Paste");
        file.add(m1);
        file.add(m2);
        file.add(m3);
        firstEdit.add(m4);
        firstEdit.add(m5);
        mb.add(file);
        mb.add(firstEdit);
        mb.add(view);
        add(t1);
        setTitle("My Notepad");
        setMenuBar(mb);
        setVisible(true);
        setSize(600, 600);
    }

    public static void main(String[] args) {
        new createmenus();
    }

}
