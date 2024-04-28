import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class quiz extends JFrame implements ActionListener
{   

    String questions[][]=new String[20][5];
    String answers[][]=new String[20][2];
    String useranswers[][]=new String[20][1];
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupoptions;
    public static int timer=20;
    public static int ans_given=0;
    public static int count=0;
    JButton next,lifeline,submit;
    public static int score=0;
    String name;
    quiz(String name)
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
        qno.setBounds(100,350,50,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(qno);
       

        question = new JLabel(); 
        question.setBounds(130,350,600,30);
        question.setFont(new Font("Tahoma",Font.PLAIN,19));
        add(question);

        setVisible(true);

	     questions[0][0] = "In Which of the following city, Olympics Games 2012 were held ? ";
        questions[0][1] = "Jakarta";
        questions[0][2] = "Rio-de-janerio";
        questions[0][3] = "London";
        questions[0][4] = "Beijing";

        questions[1][0] = "What is the Capital of Australia ? ";
        questions[1][1] = "Sydney";
        questions[1][2] = "Melbourne";
        questions[1][3] = "Canberra";
        questions[1][4] = "Adelaide";

        questions[2][0] = "Who invented the branch of Mathematics called as 'Algebra' ? ";
        questions[2][1] = "Al-Khwarizmi";
        questions[2][2] = "aristotle";
        questions[2][3] = "Bhaskaracharya";
        questions[2][4] = "Euclid";

        questions[3][0] = "Which ancient wonder was the massive statue of greek god Zeus ?";
        questions[3][1] = "Statue of liberty";
        questions[3][2] = "colossus of Rhodes";
        questions[3][3] = "Pyramids of Giza";
        questions[3][4] = "Hanging gardens of Babylon";

        questions[4][0] = "Which of the below scientist is said to be the pioneer of 'Genetics' ?";
        questions[4][1] = "Jean baptiste Lamarck ";
        questions[4][2] = "Charles robert Edinburgh";
        questions[4][3] = "John gregor Mendel";
        questions[4][4] = "Alexander Fleming";


        questions[5][0] = "In which year, the first successful heart-transplantation took place ?";
        questions[5][1] = "1965";
        questions[5][2] = "1972";
        questions[5][3] = "1969";
        questions[5][4] = "1967";

        questions[6][0] = "Which of the following planet has highest surface temperature ?";
        questions[6][1] = "Jupiter";
        questions[6][2] = "Mars";
        questions[6][3] = "Venus";
        questions[6][4] = "Saturn";

        questions[7][0] = "Which chemical element is named after the norse god of thunder ?";
        questions[7][1] = "Thorium";
        questions[7][2] = "Tungsten";
        questions[7][3] = "Germanium";
        questions[7][4] = "plutonium";

        questions[8][0] = "What is the real name of famous writter 'premchand'?";
        questions[8][1] = "Dhanpat Rai";
        questions[8][2] = "Jaishankar sahu";
        questions[8][3] = "Ramchandra shukla";
        questions[8][4] = "Anand shrivastava";

        questions[9][0] = "Who is the primary founder of business group 'Alibaba' ? ";
        questions[9][1] = "Mun-seo-ha";
        questions[9][2] = "Zang ying";
        questions[9][3] = "Jack Maa";
        questions[9][4] = "Joseph C.Tsai";

        questions[10][0] = "Which is the longest running TV serial in India ? ";
        questions[10][1] = "Kapil sharma show";
        questions[10][2] = "Taarak mehta ka oolta chashmah";
        questions[10][3] = "Yeh rishta kya kehlata hai";
        questions[10][4] = "CID";

        questions[11][0] = "Which is most grossing(successful) movie in the world ? ";
        questions[11][1] = "Avengers-Endgame";
        questions[11][2] = "Titanic";
        questions[11][3] = "Avengers-Infinity war";
        questions[11][4] = "Avatar";

        questions[12][0] = "which of the following country has football as it's National sport ? ";
        questions[12][1] = "Malaysia";
        questions[12][2] = "Canada";
        questions[12][3] = "Maldives";
        questions[12][4] = "Phillipines";

        questions[13][0] = "Who was the only US president to serve non-consecutive terms ?";
        questions[13][1] = "Grover cleveland";
        questions[13][2] = "Abraham lincoln";
        questions[13][3] = "Richard nixon";
        questions[13][4] = "Zachary Taylor";

        questions[14][0] = "Which was the first IIT established in india in 1951 ?";
        questions[14][1] = "IIT Bombay";
        questions[14][2] = "IIT Madras";
        questions[14][3] = "IIT Kharagpur";
        questions[14][4] = "IIT Kanpur";


        questions[15][0] = "What is the national animal of germany ?";
        questions[15][1] = "Eagle";
        questions[15][2] = "Beer";
        questions[15][3] = "Elephant";
        questions[15][4] = "Lion";

        questions[16][0] = "Who was the first voter of india?";
        questions[16][1] = "Jawaharlal Nehru";
        questions[16][2] = "Vinod narayan Joshi";
        questions[16][3] = "Yashwant Raj Mourya";
        questions[16][4] = "Shyam sharan Negi";

        questions[17][0] = "How many floors burj-Khalifa  has ? ";
        questions[17][1] = "145";
        questions[17][2] = "213";
        questions[17][3] = "163";
        questions[17][4] = "97";

        questions[18][0] = "Who was the co-founder of education company 'Physic-wallah'? ";
        questions[18][1] = "shyam shukla";
        questions[18][2] = "abhinav tripathi";
        questions[18][3] = "arpit maheshwari";
        questions[18][4] = "vaidehi rathi";

        questions[19][0] = "Which is the only even prime number ? ";
        questions[19][1] = "3";
        questions[19][2] = "14";
        questions[19][3] = "2";
        questions[19][4] = "6";

        answers[0][1] = "London";
        answers[1][1] = "Canberra";
        answers[2][1] = "Al-Khwarizmi";
        answers[3][1] = "colossus of Rhodes";
        answers[4][1] = "John gregor Mendel";
        answers[5][1] = "1967";
        answers[6][1] = "Venus";
        answers[7][1] = "Tungsten";
        answers[8][1] = "Dhanpat Rai";
        answers[9][1] = "Jack Maa";
        answers[10][1] = "CID";
        answers[11][1] = "Avatar";
        answers[12][1] = "Maldives";
        answers[13][1] = "Grover cleveland";
        answers[14][1] = "IIT Kharagpur";
        answers[15][1] = "Eagle";
        answers[16][1] = "Shyam sharan Negi";
        answers[17][1] = "163";
        answers[18][1] = "arpit maheshwari";
        answers[19][1] = "2";

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
      new score(name,score,"GK");
   
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
    timer=20;
   }
   else if(timer<0)
   {
      timer=20;

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
      new score(name, score, "GK");
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
        new quiz("user");
    }
}