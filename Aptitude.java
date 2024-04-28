import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Aptitude extends JFrame implements ActionListener
{   

    String questions[][]=new String[20][5];
    String answers[][]=new String[20][2];
    String useranswers[][]=new String[20][1];
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupoptions;
    public static int timer=120;
    public static int ans_given=0;
    public static int count=0;
    JButton next,lifeline,submit;
    public static int score=0;
    String name;
    Aptitude(String name)
    {   
        this.name=name;
        setBounds(200,30,1000,750);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image2.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,1000,290);
        add(image);

        qno = new JLabel(); 
        qno.setBounds(80,350,50,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(qno);
       

        question = new JLabel();
        question.setBounds(130, 350, 800, 60); 
        question.setFont(new Font("Tahoma", Font.PLAIN, 19));
        question.setVerticalAlignment(JLabel.TOP); 
        question.setVerticalTextPosition(JLabel.TOP);
        question.setHorizontalAlignment(JLabel.LEFT); 
        question.setHorizontalTextPosition(JLabel.LEFT); 
        question.setText("<html>" + questions[count][0] + "</html>");
        add(question);

        setVisible(true);

	      questions[0][0] = "<html>A boat can travel downstream at a speed of 12 km/h and upstream at a speed of 8 km/h. If the speed of the current is 2 km/h, what is the boat's speed in still water ?</html>";
        questions[0][1] = "5 km/h";
        questions[0][2] = "6 km/h";
        questions[0][3] = "7 km/h";
        questions[0][4] = "8 km/h";

        questions[1][0] = "<html>If the population of a city increased by 15% in one year and then decreased by 10% in the next year, what was the net percentage change in the population over the two years ?</html>";
        questions[1][1] = "4.5 % Increase";
        questions[1][2] = "5 % Increase";
        questions[1][3] = "4.5 % Decrease";
        questions[1][4] = "5 % Decrease";

        questions[2][0] = "<html>What is the average speed for a round trip if a train travels from Town A to Town B at 80 km/h and returns to Town A at 60 km/h, with a distance of 400 km between the towns?</html>";
        questions[2][1] = "66.67 km/h";
        questions[2][2] = "64.33 km/h";
        questions[2][3] = "76.67 km/h";
        questions[2][4] = "44.33 km/h";

        questions[3][0] = "<html>If 'MANGO' is coded as 'QDPSR' using a certain code, then how would 'APPLE' be coded ? </html>";
        questions[3][1] = "DRSSK";
        questions[3][2] = "DRSSR";
        questions[3][3] = "DRSRK";
        questions[3][4] = "DRSKK";

        questions[4][0] = "<html>A is the mother of B. C is the daughter of B. D is the father of C. What is the relationship of D to A?</html>";
        questions[4][1] = "Brother";
        questions[4][2] = "Husband";
        questions[4][3] = "Son-in-Law";
        questions[4][4] = "Father-in-law";


        questions[5][0] = "<html> How many 5-digit telephone numbers can be constructed using the digits 0 to 9, if each number starts with 67 and no digit appears more than once ?</html>";
        questions[5][1] = "186";
        questions[5][2] = "210";
        questions[5][3] = "256";
        questions[5][4] = "336";

        questions[6][0] = "<html> The number of permutations of the word 'ALLAHABAD' are ? </html>";
        questions[6][1] = "6892";
        questions[6][2] = "7890";
        questions[6][3] = "7560";
        questions[6][4] = "4250";

        questions[7][0] = "<html>If p is true and q is false, then which of the following statements is not true ?</html>";
        questions[7][1] = "p \u2228 q";
        questions[7][2] = "p \u2227 ( ~q)";
        questions[7][3] = "p \u21D2 q";
        questions[7][4] = "q \u21D2 p";

        questions[8][0] = "<html>Cattle: Herd :: Sheep:_______ ?</html>";
        questions[8][1] = "flock";
        questions[8][2] = "swarm";
        questions[8][3] = "shoal";
        questions[8][4] = "mob";

        questions[9][0] = "<html>A clock is set at 4 am. It loses 16 minutes in 24 hours. What will be the correct time when the clock indicates 9 pm on the 4th day?</html>";
        questions[9][1] = "8 pm";
        questions[9][2] = "9 pm";
        questions[9][3] = "10 pm";
        questions[9][4] = "7 pm";

        questions[10][0] = "<html>A bag contains 2 red, 3 green and 2 blue balls. Two balls are drawn at random. What is the probability that none of the balls drawn is blue ?</html>";
        questions[10][1] = "2/7";
        questions[10][2] = "5/7";
        questions[10][3] = "11/21";
        questions[10][4] = "10/21";

        questions[11][0] = "<html> The sum of two numbers is 184. If one-third of the one overtake one-seventh of the other by 8, find the minimum number ? </html>";
        questions[11][1] = "62";
        questions[11][2] = "68";
        questions[11][3] = "70";
        questions[11][4] = "72";

        questions[12][0] = "<html>Look at the series: A4, __, C16, D32, E64. What number should fill the blank ?</html>";
        questions[12][1] = "B-16";
        questions[12][2] = "D-8";
        questions[12][3] = "A-16";
        questions[12][4] = "B-8";

        questions[13][0] = "<html>If a bulb in a room flashes on every 9 seconds, how many times will it flash in \u00BE of an hour ?</html>";
        questions[13][1] = "301";
        questions[13][2] = "401";
        questions[13][3] = "275";
        questions[13][4] = "151";

        questions[14][0] = "<html>How much time will it take for a measure of Rs. 450 to yield Rs. 81 as interest at 4.5% for each annum of simple interest ? </html>";
        questions[14][1] = "3.5 years";
        questions[14][2] = "4.5 years";
        questions[14][3] = "4 years";
        questions[14][4] = "3 years";


        questions[15][0] = "<html> In a pack, there are coins of 25 p, 10 p and 5 p in the proportion of 1: 2: 3. If there is Rs. 30 taking all things together, what number of 5 p coins is there?</html>";
        questions[15][1] = "150";
        questions[15][2] = "100";
        questions[15][3] = "50";
        questions[15][4] = "340";

        questions[16][0] = "<html> If * stands for /, / stands for -, + stands for * and -stands for +, then 9/8*4+5-10=?</html>";
        questions[16][1] = "10";
        questions[16][2] = "1";
        questions[16][3] = "13";
        questions[16][4] = "9";

        questions[17][0] = "<html>A alone can do a piece of work in 8 days and B alone in 6 days. A and B undertook to do it for Rs.4600. With the help of C, they finished the work in 3 days. What is the share of C?</html>";
        questions[17][1] = "567";
        questions[17][2] = "587";
        questions[17][3] = "575";
        questions[17][4] = "472";

        questions[18][0] = "<html> One pipe can fill a tank four times as fast as another pipe. If together the two pipes can fill the tank in 40 minutes, then the slower pipe alone will be able to fill the tank in:</html>";
        questions[18][1] = "215 min";
        questions[18][2] = "192 min";
        questions[18][3] = "200 min";
        questions[18][4] = "175 min";

        questions[19][0] = "<html> A fort has enough food for 35 days for 120 soldiers. If after 15 days 70 soldiers leave the fort, for how many more days the food will last? </html>";
        questions[19][1] = "68";
        questions[19][2] = "58";
        questions[19][3] = "48";
        questions[19][4] = "60";

        answers[0][1] = "7 km/h";
        answers[1][1] = "4.5 % Decrease";
        answers[2][1] = "66.67 km/h";
        answers[3][1] = "DRSSR";
        answers[4][1] = "Son-in-Law";
        answers[5][1] = "336";
        answers[6][1] = "7560";
        answers[7][1] = "p \\u2227 ( ~q)";
        answers[8][1] = "flock";
        answers[9][1] = "10 pm";
        answers[10][1] = "10/21";
        answers[11][1] = "72";
        answers[12][1] = "B-8";
        answers[13][1] = "301";
        answers[14][1] = "4 years";
        answers[15][1] = "150";
        answers[16][1] = "9";
        answers[17][1] = "575";
        answers[18][1] = "200 min";
        answers[19][1] = "48";

        opt1= new JRadioButton();
        opt1.setBounds(120,410,700,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog",Font.PLAIN,18));
        add(opt1);

        opt2= new JRadioButton();
        opt2.setBounds(120,460,700,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog",Font.PLAIN,18));
        add(opt2);

        opt3= new JRadioButton();
        opt3.setBounds(120,510,700,30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog",Font.PLAIN,18));
        add(opt3);

        opt4= new JRadioButton();
        opt4.setBounds(120,560,700,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog",Font.PLAIN,18));
        add(opt4);

         groupoptions=new ButtonGroup();
         groupoptions.add(opt1);
         groupoptions.add(opt2);
         groupoptions.add(opt3);
         groupoptions.add(opt4);
        


        lifeline=new JButton("50-50 Lifeline");
        lifeline.setBounds(120,640,180,30);
        lifeline.setFont(new Font("Tahoma",Font.PLAIN,18));
        lifeline.setBackground(new Color(30,144,255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        next=new JButton("Next");
        next.setBounds(360,640,180,30);
        next.setFont(new Font("Tahoma",Font.PLAIN,18));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        submit=new JButton("Submit");
        submit.setBounds(600,640,180,30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,18));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);


        start(count);
       
        

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==next)
      {
        repaint();
        opt1.setEnabled(true);
        opt2.setEnabled(true);
        opt3.setEnabled(true);
        opt4.setEnabled(true);
        
        ans_given=1;
        if(groupoptions.getSelection()==null)
      {
         useranswers[count][0]="";
      }else
      {
        useranswers[count][0]=groupoptions.getSelection().getActionCommand();
      }

      if(count==18)
      {
        next.setEnabled(false);
        submit.setEnabled(true);
      }

        count++;
        start(count);
      }
      else if(ae.getSource()==lifeline)
      {
        if(count==2||count==8||count==13||count==15)
        {
            opt2.setEnabled(false);
            opt4.setEnabled(false);
        }
        else if(count==3||count==7)
        {
             opt1.setEnabled(false);
             opt3.setEnabled(false);
        }
        else if(count==0||count==1||count==4||count==6||count==9||count==12||count==14||count==17||count==18||count==19)
        {
             opt1.setEnabled(false);
             opt2.setEnabled(false);
        }
        else{
            opt2.setEnabled(false);
            opt3.setEnabled(false);
        }
        lifeline.setEnabled(false);
      }
      else if(ae.getSource()==submit){
        ans_given=1;
      if(groupoptions.getSelection()==null)
      {
         useranswers[count][0]="";
      }else
      {
        useranswers[count][0]=groupoptions.getSelection().getActionCommand();
      }
      for(int i=0;i<useranswers.length;i++)
      {
        if(useranswers[i][0].equals(answers[i][1]))
        {
            score+=5;
        }
        else{
            score+=0;
        }
      }
      setVisible(false);
      new score(name, score, "Aptitude");
   
      }
    }

   
   public void paint(Graphics g)
   {
    super.paint(g);

    String time="Time left :" + timer + " seconds";
    g.setColor(Color.RED);
    g.setFont(new Font("Tahoma",Font.BOLD,28));

    if(timer>0)
    {
        g.drawString(time,600,550);
    }
    else
    {
        g.drawString("Times up!!!",600,550);
    }
    timer--;
      try {
    Thread.sleep(1000);
    repaint();
    
   } catch (Exception e) {
    e.printStackTrace();
   }

   if(ans_given==1)
   {
    ans_given=0;
    timer=120;
   }
   else if(timer<0)
   {
      timer=120;

      opt1.setEnabled(true);
      opt2.setEnabled(true);
      opt3.setEnabled(true);
      opt4.setEnabled(true);
      
      if(count==18)
      {
        next.setEnabled(false);
        submit.setEnabled(true);
      }

       if(count==19)
      {
       if(groupoptions.getSelection()==null)
      {
         useranswers[count][0]="";
      }else
      {
        useranswers[count][0]=groupoptions.getSelection().getActionCommand();
      }
     
      for(int i=0;i<useranswers.length;i++)
      {
        if(useranswers[i][0].equals(answers[i][1]))
        {
            score+=5;
        }else
        {
            score+=0;
        }
      }
      setVisible(false);
      new score(name,score,"Aptitude");
      }
       else{

      if(groupoptions.getSelection()==null)
      {
         useranswers[count][0]="";
      }else
      {
        useranswers[count][0]=groupoptions.getSelection().getActionCommand();
      }
      count++;
      start(count);}
   }
}
  


    public void start(int count)
    {
        qno.setText(""+ (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
       
    }
    public static void main(String[] args) {
        new Aptitude("user");
    }
}