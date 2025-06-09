
package bank.management.system;
/*------------------------------------------------------*/


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class signupTow  extends JFrame implements ActionListener {
    

JTextField aadhar ,pan ;

JButton next ;
JRadioButton syes , sno, eyes,eno;
String formno;
JComboBox religion ,category ,income ,educational ,occupation   ;

    signupTow( String formno){
        
        this.formno = formno;
        
        setLayout(null);
        
         setTitle("New account application form page 2 ");
              
          
          JLabel  additionalDetails  = new JLabel("page 2 :  Additional Details ");
         additionalDetails.setFont(new Font("Raleway" , Font.BOLD,22));
         additionalDetails.setBounds(290, 80, 400, 40);
          add( additionalDetails);
          
          /*Religion---------------------------------------------*/
           JLabel name  = new JLabel("Religion :");
           name.setFont(new Font("Raleway" , Font.BOLD,20));
           name.setBounds(100, 140, 100, 30);
          add( name);
          
           String valreligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
         religion = new  JComboBox(valreligion);
         religion.setBackground(Color.WHITE);
        religion.setBounds(300, 140, 400, 30);
          add(religion );
          
           /*Religion---------------------------------------------*/
           
            /*category---------------------------------------------*/
           JLabel Category   = new JLabel("Category:");
         Category.setFont(new Font("Raleway" , Font.BOLD,20));
           Category.setBounds(100, 190, 200, 30);
          add(Category);
          
           String valcategory[] = {"General","OBC","SC","ST","Other"};
          category = new  JComboBox(valcategory);
        category.setBackground(Color.WHITE);
       category.setBounds(300, 190, 400, 30);
       add(category);
       /*category---------------------------------------------*/
       
       
       /*incom---------------------------------------------*/
           JLabel Income   = new JLabel("Income :");
         Income.setFont(new Font("Raleway" , Font.BOLD,20));
          Income.setBounds(100, 240, 200, 30);
          add(Income);
          
           String incomcategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
         income = new  JComboBox(incomcategory);
       income.setBackground(Color.WHITE);
      income.setBounds(300, 240, 400, 30);
       add(income);
          
          /*incom---------------------------------------------*/
          
          /*Educationa---------------------------------------------*/
          JLabel Educational   = new JLabel("Educational : ");
         Educational .setFont(new Font("Raleway" , Font.BOLD,20));
          Educational.setBounds(100, 290, 200, 30);
          add(Educational );
         
        /*Educationa---------------------------------------------*/
         
          /*Qualification---------------------------------------------*/
          JLabel Qualification   = new JLabel("Qualification :");
          Qualification  .setFont(new Font("Raleway" , Font.BOLD,20));
          Qualification .setBounds(100, 315, 120, 30);
          add(Qualification );
          
          String educationalvalues[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        educational = new  JComboBox(educationalvalues);
      educational.setBackground(Color.WHITE);
    educational.setBounds(300, 315, 400, 30);
       add(educational);
        /*Qualification---------------------------------------------*/
        
        /*occupation--------------------------------------------*/
          JLabel Occupation = new JLabel("occupation :");
          Occupation  .setFont(new Font("Raleway" , Font.BOLD,20));
           Occupation.setBounds(100, 390, 200, 30);
          add( Occupation );
          
           String occupationvalues[] = {"Salaried","Self-Employmed","Business","Student","Retired","ex-army","Others"};
         occupation = new  JComboBox(occupationvalues);
      occupation.setBackground(Color.WHITE);
   occupation.setBounds(300, 390, 400, 30);
       add(occupation);
       
         /*occupation--------------------------------------------*/
        
          /*pan--------------------------------------------*/
          JLabel pano   = new JLabel("PAIN NO :");
         pano  .setFont(new Font("Raleway" , Font.BOLD,20));
            pano  .setBounds(100, 440, 200, 30);
          add( pano );
          
          
           pan = new JTextField();
       pan.setFont(new Font("Raleway", Font.BOLD, 14));
      pan.setBounds(300, 440, 400, 30);
       add(pan);
          
        /*pan--------------------------------------------*/
          
         /*aadhar--------------------------------------------*/
          JLabel aadharno = new JLabel("Aadhar No :");
        aadharno .setFont(new Font("Raleway" , Font.BOLD,20));
          aadharno.setBounds(100, 490, 200, 30);
          add(aadharno);
          
           aadhar = new JTextField();
       aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
       aadhar.setBounds(300, 490, 400, 30);
       add(aadhar);
       /*aadhar--------------------------------------------*/
       
       /*Saniorcitizen--------------------------------------------*/
          JLabel saniorcitizen  = new JLabel("Sanior Citizen :");
         saniorcitizen .setFont(new Font("Raleway" , Font.BOLD,20));
           saniorcitizen .setBounds(100, 540, 200, 30);
          add(saniorcitizen );
          
             syes = new JRadioButton("YES");
       syes.setFont(new Font("Raleway", Font.BOLD, 14));
        syes.setBounds(300,540,60,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno= new JRadioButton("NO");
        sno.setFont(new Font("Raleway", Font.BOLD, 14));
        sno.setBounds(450,540,120,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
          ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(syes);
         gendergroup.add(sno);
        /*Saniorcitizen--------------------------------------------*/
        
          /*Exisitingaccount--------------------------------------------*/
          
          JLabel exisitingaccount  = new JLabel("Exisiting account :");
        exisitingaccount.setFont(new Font("Raleway" , Font.BOLD,20));
           exisitingaccount.setBounds(100, 590, 200, 30);
          add(exisitingaccount);
          
         eyes = new JRadioButton("YES");
       // eyes.setFont(new Font("Raleway", Font.BOLD, 14));
         eyes.setBounds(300,590,100,30);
         eyes.setBackground(Color.WHITE);
        add( eyes);
        
        eno= new JRadioButton("NO");
        //eno.setFont(new Font("Raleway", Font.BOLD, 14));
       eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
          ButtonGroup exisiting = new ButtonGroup();
        exisiting.add( eyes);
         exisiting.add(eno);
          
          /*Exisitingaccount--------------------------------------------*/
          
           pan = new JTextField();
       pan.setFont(new Font("Raleway", Font.BOLD, 14));
      pan.setBounds(300, 590, 400, 30);
       add(pan);
          
        next = new JButton("next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setFont(new Font("Raleway", Font.BOLD, 14));
       next.setBounds(620,660,80,30);
       next.addActionListener(this);
       add(next);
   
   getContentPane().setBackground(Color.WHITE);
   
        setSize(850,800);
        setLocation(500,120);
        setVisible(true);


}
    public void actionPerformed(ActionEvent ae){
     
       String sreligion = (String) religion .getSelectedItem(); 
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducational= (String)educational.getSelectedItem();
        String soccupation= (String)occupation.getSelectedItem();
        
     
      String Saniorcitizen  = null;
        if(syes.isSelected()){ 
            Saniorcitizen  = "YES";
        }else if(sno.isSelected()){ 
            Saniorcitizen  = "NO";
        }
          
          
        String exisitingaccount = null;
        if(eyes.isSelected())
        { 
            exisitingaccount = "YES";
        }else if(eno.isSelected())
        { 
          exisitingaccount = "NO";
        
        }
        
       String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try{
            
           conn c = new conn();
         String query = "insert into signupTow values('"+formno+"','"+sreligion+"','"+scategory+"',"
                 + "'"+sincome+"','"+seducational+"','"+soccupation+"',"
                 + "'"+ Saniorcitizen+"','"+exisitingaccount+"','"+span+"','"+ saadhar+"')";
                 
         c.s.executeUpdate(query);
         
              /*jbj coning */
          
           //signup 3 object
           setVisible(false); 
        new signupThree(formno).setVisible(true);
        
        }catch(Exception e){
         System.out.println(e); 
        }
    }
         
    
   
  
     public static void main(String[] args){
        new signupTow("");
    }
    
}

/*-----------------------------------------------------
public class signupTow {
    
}
*/