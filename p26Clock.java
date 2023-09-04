import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;

public class p26Clock extends JFrame implements ActionListener{
    JPanel panel;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    JPanel panel6;
    JPanel panel7;

    JLabel label;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JLabel label10;

    JButton button;
    JButton button2;
    JButton button3;
    JButton button4;
    p26Clock(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 500, 500);
        this.setLayout(null);
        this.setTitle("main");
        ImageIcon image = new ImageIcon("icon.jpeg");
        this.setIconImage(image.getImage());
        this.setBackground(Color.black);

        AbstractBorder border = new LineBorder(Color.BLACK, 8,true);
        AbstractBorder border1 = new LineBorder(Color.WHITE, 8,true);

        panel = new JPanel();
        panel.setBorder(LineBorder(border));
        panel.setBackground(new ColorUIResource(204,204,0));
        panel.setBounds(0,0,1535,120);
        // panel.setLayout(null);

        panel2 = new JPanel();
        panel2.setBorder(LineBorder(border));
        panel2.setBackground(Color.CYAN);
        panel2.setBounds(0, 120, 550, 400);

        panel3 = new JPanel();
        panel3.setBorder(LineBorder(border));
        panel3.setBackground(Color.CYAN);
        panel3.setBounds(550, 120, 550, 400);

        panel4 = new JPanel();
        panel4.setBorder(LineBorder(border));
        panel4.setBackground(Color.CYAN);
        panel4.setBounds(1100, 120, 435, 670);

        panel5 = new JPanel();
        panel5.setBorder(LineBorder(border));
        panel5.setBackground(Color.CYAN);
        panel5.setBounds(0, 520, 550, 200);

        panel6 = new JPanel();
        panel6.setBorder(LineBorder(border));
        panel6.setBackground(Color.CYAN);
        panel6.setLayout(null);
        panel6.setBounds(550, 520, 550, 200);

        panel7 = new JPanel();
        panel7.setBorder(LineBorder(border));
        panel7.setBackground(Color.CYAN);
        panel7.setBounds(0, 720, 1100, 70);

        label = new JLabel("Restraurant Management System");
        label.setForeground(Color.RED);
        label.setBorder(border1);
        label.setVerticalAlignment(SwingConstants.TOP);
        label.setFont(new Font("Tahoma",Font.BOLD,70));

        label2 = new JLabel();
        ImageIcon icon = new ImageIcon("grand_hotel.jpeg");
        label2.setIcon(icon);

        label3 = new JLabel();
        label3.setIcon(icon);

        label4 = new JLabel("Tax");
        label4.setBounds(600,640, 100,50);
        label4.setFont(new Font("Tahoma",Font.BOLD,18));

        label5 = new JLabel("Sub Total");
        label5.setFont(new Font("Tahoma",Font.BOLD,18));

        label6 = new JLabel("Total");
        label6.setFont(new Font("Tahoma",Font.BOLD,18));

        button = new JButton("Total");
        button.setFont(new Font("Tahoma",Font.BOLD,30));   
        
        button2 = new JButton("Reset");
        button2.setFont(new Font("Tahoma",Font.BOLD,30));

        button3 = new JButton("Reset");
        button3.setFont(new Font("Tahoma",Font.BOLD,30));

        button4 = new JButton("Reset");
        button4.setFont(new Font("Tahoma",Font.BOLD,30));

        panel7.add(button);
        panel7.add(button2);
        panel7.add(button3);
        panel7.add(button4);

        panel6.add(label4);
        panel6.add(label5);
        panel6.add(label6);

        panel.add(label2);
        panel.add(label);
        panel.add(label3);

        this.add(panel);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(panel5);
        this.add(panel6);
        this.add(panel7);
        this.setVisible(true);
    }

    private Border LineBorder(AbstractBorder border) {
        return border;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        
    }
    
    public static void main(String[] args) {
        p26Clock p = new p26Clock();
        System.out.println(p);
    }
    
}