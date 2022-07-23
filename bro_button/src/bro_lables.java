import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.JLabel;

import javax.swing.border.Border;
public class bro_lables {
    public static void main() {
        JFrame frame=new JFrame();//create new j-frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        //lable.setFont("Jokerman");
        //--image icon
        ImageIcon image=new ImageIcon("download.png");//import the image
        ImageIcon logo=new ImageIcon("icon.png");
        Border border=BorderFactory.createLineBorder(new Color(255,0,255),3);

        //------------------------//
        //creating lable
        JLabel lable=new JLabel();//create lable
        lable.setText("Bro, do you even code?");//set text to lable
        lable.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER,RIGHT of image
        lable.setVerticalTextPosition(JLabel.TOP);//sets text position to the top
       //lable.setForeground(new Color(red));//unknown error
        lable.setForeground(new Color(255,0,255));
        lable.setFont(new Font("Algerian",Font.PLAIN,20));
        lable.setIcon(image);//add to lable
        lable.setBorder(border);
        lable.setVerticalAlignment(JLabel.CENTER);
        lable.setHorizontalAlignment(JLabel.CENTER);
        lable.setBackground(new Color(50,50,50));
        //lable.setBounds(100,100, 250,250);
        lable.setOpaque(true);
        //--adding to j-frame
        frame.add(lable);//aad lable to jframe
        frame.setIconImage(logo.getImage());
        //frame.setLayout(null);
        frame.pack();
        
        //true visiblity
        frame.setVisible(true);
    }
}
