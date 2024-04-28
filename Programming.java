import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Programming extends JFrame implements ActionListener
{   

    String questions[][]=new String[20][5];
    String answers[][]=new String[20][2];
    String useranswers[][]=new String[20][1];
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupoptions;
    public static int timer=45;
    public static int ans_given=0;
    public static int count=0;
    JButton next,lifeline,submit;
    public static int score=0;
    String name;
    Programming(String name)
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

	    questions[0][0] = "<html> push1(10,20,30,40), pop(40,30), push2(20,30,35,45,65), pop2(65,45,35) are performed on a dynamic stack. then, which of the following statement is false ? </html>";
        questions[0][1] = "resultant stack contains 4 elements";
        questions[0][2] = "final stack is (10,20,20,30)";
        questions[0][3] = "The top element of the final stack is 20";
        questions[0][4] = "Stack follows LIFO principle";

        questions[1][0] = "<html>Insertion of an element at the middle of a linked list requires the modification of how many pointers ? </html>";
        questions[1][1] = "3";
        questions[1][2] = "size/2";
        questions[1][3] = "2";
        questions[1][4] = "1";

        questions[2][0] = "Which HTML tag is used to insert an image ? ";
        questions[2][1] = "<img src=\u201Dhtmllogo.jpg\u201D />";
        questions[2][2] = "<img url=\u201Dhtmllogo.jpg\u201D />";
        questions[2][3] = "<img alt=\u201Dhtmllogo.jpg\u201D />";
        questions[2][4] = "<img link=\u201Dhtmllogo.jpg\u201D />";

        questions[3][0] = "<html> Which one of the following is not a keyword in Python language ? </html>";
        questions[3][1] = "pass";
        questions[3][2] = "eval";
        questions[3][3] = "assert";
        questions[3][4] = "nonlocal";

        questions[4][0] = "<html> Every number system has an unique characters or literals. The count of those literals is called as_________</html>";
        questions[4][1] = "Matrix";
        questions[4][2] = "Radical";
        questions[4][3] = "Radix";
        questions[4][4] = "Exponent";


        questions[5][0] ="<html>Which of the following is not an example of DBMS ?</html>";
        questions[5][1] = "MySQL";
        questions[5][2] = "Microsoft Acess";
        questions[5][3] = "IBM DB2";
        questions[5][4] = "Google";

        questions[6][0] = "<html>The parent class of all type of exceptions in java is-: </html>";
        questions[6][1] = "Throws";
        questions[6][2] = "Finally";
        questions[6][3] = "Throwable";
        questions[6][4] = "Object";

        questions[7][0] = "<html>Which of the following inbuilt method is used to convert 'obama' to 'OBAMA' in java ?</html>";
        questions[7][1] = "toString()";
        questions[7][2] = "toUpperCase()";
        questions[7][3] = "toCharArray()";
        questions[7][4] = "parseInt()";

        questions[8][0] = "<html>Which of the following type of constructor does not exist in java ?</html>";
        questions[8][1] = "object oriented constructor";
        questions[8][2] = "default constructor";
        questions[8][3] = "parametrized constructor";
        questions[8][4] = "copy constructor";

        questions[9][0] = "<html>which keyword is used to execute abstraction in oops via interfaces ? </html>";
        questions[9][1] = "extends";
        questions[9][2] = "abstracts";
        questions[9][3] = "implements";
        questions[9][4] = "interfaces";

        questions[10][0] = "<html>Who developed object-oriented programming ?</html>";
        questions[10][1] = "Adele Goldberg";
        questions[10][2] = "Dennis Ritchie";
        questions[10][3] = "Andrea Ferro";
        questions[10][4] = "Alan Kay";

        questions[11][0] = "<html>Which of the following language was developed as the first purely object programming language ?</html>";
        questions[11][1] = "C#";
        questions[11][2] = "Go";
        questions[11][3] = "c++";
        questions[11][4] = "smalltalk";

        questions[12][0] = "<html>Which two features of object-oriented programming are the same ?</html>";
        questions[12][1] = "Abstraction and Polymorphism features are the same";
        questions[12][2] = "Inheritance and Encapsulation features are the same";
        questions[12][3] = "Encapsulation and Abstraction";
        questions[12][4] = "Encapsulation and Polymorphism features are the same";

        questions[13][0] = "<html>Which of the following class is known as the generic class ?</html>";
        questions[13][1] = "Template class";
        questions[13][2] = "Final class";
        questions[13][3] = "Abstract class";
        questions[13][4] = "Efficient code";

        questions[14][0] = "<html> Which of the following is the correct syntax to print the message in C++ language ? </html>";
        questions[14][1] = "Out <<'Hello world!'";
        questions[14][2] = "Cout <<'Hello world!'";
        questions[14][3] = "cout <<'Hello world'";
        questions[14][4] = "None of the above";


        questions[15][0] = "<html>In which of the following formats data is stored in the database management system ?</html>";
        questions[15][1] = "Table";
        questions[15][2] = "Image";
        questions[15][3] = "Graph";
        questions[15][4] = "Text";

        questions[16][0] = "<html>Blockchain has ____ versions.</html>";
        questions[16][1] = "0";
        questions[16][2] = "1";
        questions[16][3] = "2";
        questions[16][4] = "3";

        questions[17][0] = "<html>Which of the following is an example of a deep learning architecture ?</html>";
        questions[17][1] = "K-nearest neighbors (KNN)";
        questions[17][2] = "Random forest";
        questions[17][3] = "Convolutional neural network (CNN)";
        questions[17][4] = "Gradient boosting machine (GBM)";

        questions[18][0] = "<html>Which of the following is an example of a clustering algorithm ? </html>";
        questions[18][1] = "Random forest";
        questions[18][2] = "Gradient descent";
        questions[18][3] = "K-means";
        questions[18][4] = "Decision tree";

        questions[19][0] = "<html>The programming language that has the ability to create new data types is called__________.</html>";
        questions[19][1] = "Encapsulated";
        questions[19][2] = "Overloaded";
        questions[19][3] = "Extensible";
        questions[19][4] = "Reprehensible";

        answers[0][1] = "The top element of the final stack is 20";
        answers[1][1] = "2";
        answers[2][1] = "<img src=\\u201Dhtmllogo.jpg\\u201D />";
        answers[3][1] = "eval";
        answers[4][1] = "Radix";
        answers[5][1] = "Google";
        answers[6][1] = "Throwable";
        answers[7][1] = "toUpperCase()";
        answers[8][1] = "object oriented constructor";
        answers[9][1] = "implements";
        answers[10][1] = "Alan Kay";
        answers[11][1] = "smalltalk";
        answers[12][1] = "Encapsulation and Abstraction";
        answers[13][1] = "Template class";
        answers[14][1] = "cout <<'Hello world'";
        answers[15][1] = "Table";
        answers[16][1] = "3";
        answers[17][1] = "Convolutional neural network (CNN)";
        answers[18][1] = "K-means";
        answers[19][1] = "Extensible";

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
      new score(name,score,"Programming");
   
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
    timer=45;
   }
   else if(timer<0)
   {
      timer=45;

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
      new score(name, score, "Programming");
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
        new Programming("user");
    }
}