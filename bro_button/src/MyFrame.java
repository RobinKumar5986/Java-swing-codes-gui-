import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;


//public class MyFrame extends JFrame implements  ActionListener{//--multi tasking input
public class MyFrame extends JFrame { //--single tasking input
    JButton button;
    JLabel lable;

    public void lable()
    {
        lable.setVisible(true);
        System.out.println("hello");
        button.setEnabled(false);
    }
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame
        this.setLayout(null);
        this.setSize(500, 500);
        

        //image icon
        ImageIcon icon = new ImageIcon("e1.jpg");
        ImageIcon icon2=new ImageIcon("e2.jpg");
        //creating a label
        lable= new JLabel();
        lable.setBounds(0,0,50,50);
        lable.setIcon(icon2);
        lable.setForeground(new Color(255, 0, 98));
        lable.setBounds(150,250,200,150);
        lable.setVisible(false);

        //creating a button
        button = new JButton("hello");
        button.setBounds(200, 100, 100, 50);
        //button.addActionListener(e-> System.out.println("hello"));//single task input
        //button.addActionListener(this); // inputting multiple tasks
        button.addActionListener(e-> lable());//hubrid

        button.setFocusable(false); //---> Removes the boundary from the buttons
        button.setIcon(icon);//--->set the image icon for the button
        button.setFont(new Font("Algerian", Font.BOLD, 25));//-->font setting
        button.setIconTextGap(-15);//--->gap filling
        button.setForeground(Color.RED);
        button.setBackground(new Color(20, 163, 199, 65));
        button.setBorder(BorderFactory.createEtchedBorder());//--->sets the border style for 3d look
        button.setHorizontalTextPosition(JButton.CENTER);
        //button.setEnabled(false);-->Enable or disable a button


        //--------------------------//
        this.add(button);
        this.add(lable);

        this.setVisible(true);
    }
    //---method of inputting multiple task in java
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==button)
//        {
//            System.out.println("hello");
//            System.out.println("");

//        }
}
