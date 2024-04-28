import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rulesprog extends JFrame implements ActionListener {
    
    String name;
    JButton start,back;
    rulesprog(String name)
    { 
      this.name=name;
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);

      JLabel heading=new JLabel("Welcome  " + name + "  to  Quiz-Connect");
      heading.setBounds(65,20,700,40);
      heading.setFont(new Font("Viner Hand ITC",Font.BOLD,32));
      heading.setForeground(new Color(30, 144, 254));
      add(heading);

      JLabel rules=new JLabel();
      rules.setBounds(20,90,700,450);
      rules.setFont(new Font("Tahoma",Font.PLAIN,17));
      rules.setText(
            "<html>"+ 
                "1. This is a programming and technology quiz consisting of 20 questions." + "<br><br>" +
                "2. Each question carries 5 points, There will be no negative marking. You are free to guess the answer." + "<br><br>" +
                "3. There will be 45 seconds time duration to answer every question in the quiz."+ "<br><br>"+
                "4. Your final score will be displayed after the quiz will be finished." + "<br><br>" +
                "5. For each question,there are four options and only one option is correct. " + "<br><br>" +
                "6. For each question there is a 50-50 lifeline in which software will eliminate two incorrect options for you.But it can be used only for one question." + "<br><br>" +
                "7. Use of google or any electronic gadgets or any cheating during the game is strictly prohibited.so,play honestly." + "<br><br>" +
                "8. you can go through the instructions again,if have any querries, Good Luck !!!" + "<br><br>" +
      "<html>"
);
      add(rules);

      back=new JButton("Back");
      back.setBounds(200,550,100,30);
      back.setBackground(new Color(30,144,254));
      back.setForeground(Color.WHITE);
      back.addActionListener(this);
      add(back);

      
      start=new JButton("start");
      start.setBounds(400,550,100,30);
      start.setBackground(new Color(30,144,254));
      start.setForeground(Color.WHITE);
      start.addActionListener(this);
      add(start);


      setSize(800,650);
      setLocation(350,100);
      setVisible(true);

    }
    
     public void actionPerformed(ActionEvent ae)
     {
        if(ae.getSource()==start)
        { 
          setVisible(false);
          new Programming(name);
        }
        else
        {
            setVisible(false);
            new Topic(name);
        }
     }
    public static void main(String[] args) {
        new rulesprog("user");
    }
}
