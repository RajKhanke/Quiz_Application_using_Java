import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener
{ 

   JButton Next,back;
   JTextField tfname;
   login()
  {  
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);

     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("loginimg.jpg"));
     JLabel image=new JLabel(i1);
     image.setBounds(0,2,600,600);
     add(image);

     JLabel heading=new JLabel("Quiz-Connect");
     heading.setBounds(750,60,300,45);
     heading.setFont(new Font("proxima nova",Font.BOLD,45));
     heading.setForeground(new Color(30, 144, 254));
     add(heading);

     JLabel name=new JLabel("Enter your Name");
     name.setBounds(810,150,300,20);
     name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
     name.setForeground(new Color(30, 144, 254));
     add(name);

     tfname=new JTextField();
     tfname.setBounds(735,200,300,25);
     tfname.setFont(new Font ("Times new Roman",Font.BOLD,20));
     add(tfname);

     Next=new JButton("Next");
     Next.setBounds(735,270,120,25);
     Next.setBackground(new Color(30,144,254));
     Next.setForeground(Color.WHITE);
     Next.addActionListener(this);
     add(Next);

     back=new JButton("Back");
     back.setBounds(915,270,120,25);
     back.setBackground(new Color(30,144,254));
     back.setForeground(Color.WHITE);
     back.addActionListener(this);
     add(back);


     setSize(1200, 600);
     setLocation(120,100);
     setVisible(true);
  }

  public void  actionPerformed(ActionEvent ae)
  {
if(ae.getSource()==Next)
  { 
    String name=tfname.getText();
    setVisible(false);
    new Topic(name);

  }else if(ae.getSource()==back)
  {
   setVisible(false);
  }
}

public static void main(String[] args)
 {
    new login();
}
}

