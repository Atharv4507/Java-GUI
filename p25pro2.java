import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.plaf.DimensionUIResource;

public class p25pro2 extends JFrame implements ActionListener{
    JPanel panel;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    JPanel panel6;
    JPanel panel7;
    JPanel panel8;

    JLabel label;
    JLabel label2;
    JLabel label3;
    
    JButton button;
    JButton button2;
    p25pro2(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 500, 500);
        this.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        this.setTitle("main");
        ImageIcon image = new ImageIcon("icon.jpeg");
        this.setIconImage(image.getImage());
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.black);

        AbstractBorder border = new LineBorder(Color.BLACK, 8,true);
        AbstractBorder border1 = new LineBorder(Color.WHITE, 8,true);

        panel = new JPanel();
        panel.setPreferredSize(new  DimensionUIResource(1535, 120));
        panel.setBorder(LineBorder(border));
        panel.setBackground(new ColorUIResource(204,204,0));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(550,400));
        panel2.setBorder(LineBorder(border));
        panel2.setBackground(Color.CYAN);
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));

        panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(550,400));
        panel3.setBorder(LineBorder(border));
        panel3.setBackground(Color.CYAN);
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));

        panel4 = new JPanel();
        panel4.setPreferredSize(new Dimension(435,400));
        panel4.setBorder(LineBorder(border));
        panel4.setBackground(Color.CYAN);
        panel4.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));

        panel5 = new JPanel();
        panel5.setPreferredSize(new Dimension(550,200));
        panel5.setBorder(LineBorder(border));
        panel5.setBackground(Color.CYAN);
        panel5.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));

        panel6 = new JPanel();
        panel6.setPreferredSize(new Dimension(550,200));
        panel6.setBorder(LineBorder(border));
        panel6.setBackground(Color.CYAN);
        panel6.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));

        panel7 = new JPanel();
        panel7.setPreferredSize(new Dimension(435,200));
        panel7.setBorder(LineBorder(border));
        panel7.setBackground(Color.CYAN);
        panel7.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));

        panel8 = new JPanel();
        panel8.setPreferredSize(new Dimension(1535,70));
        panel8.setBorder(LineBorder(border));
        panel8.setBackground(Color.CYAN);
        panel8.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));

        label = new JLabel("Restraurant Management System");
        label.setForeground(Color.RED);
        label.setBorder(border1);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.CENTER);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setFont(new Font("Tahoma",Font.BOLD,70));

        label2 = new JLabel();
        ImageIcon icon = new ImageIcon("grand_hotel.jpeg");
        label2.setIcon(icon);

        label3 = new JLabel();
        label3.setIcon(icon);

        button = new JButton("total");
        button.setFont(new Font("Tahoma",Font.BOLD,30));
        
        button2 = new JButton("reset");
        button2.setFont(new Font("Tahoma",Font.BOLD,30));
        button2.setBounds(100, 620, 40, 40);
        

        panel8.add(button);
        panel8.add(button2);
        panel.add(label3);
        panel.add(label);
        panel.add(label2);

        this.add(panel);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(panel5);
        this.add(panel6);
        this.add(panel7);
        this.add(panel8);
        this.setVisible(true);
    }

    private Border LineBorder(AbstractBorder border) {
        return border;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        
    }
    
    public static void main(String[] args) {
        p25pro2 p = new p25pro2();
        System.out.println(p);
    }
    
}