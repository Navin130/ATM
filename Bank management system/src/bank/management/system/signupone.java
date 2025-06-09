
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signupone  extends JFrame implements ActionListener {
    
long random;
JTextField  nameTextField,fatherTextField,emailTextField,addersTextField,cityTextField,
        stateTextField,
        pincodTextField;
JButton next ;
JRadioButton female,male,unmarried,married;
JDateChooser dateChooser;


    signupone(){
        setLayout(null);
         Random ran = new Random();
          random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
     JLabel formno = new JLabel("APPLICATION FORM NO. "+ random);
     formno.setFont(new Font("Raleway" , Font.BOLD,38));
          formno.setBounds(140, 20, 600, 40);
          add(formno);
          
          JLabel PersonalDetails  = new JLabel("Page-1 :  Personal Details ");
          PersonalDetails.setFont(new Font("Raleway" , Font.BOLD,22));
         PersonalDetails.setBounds(290, 80, 400, 40);
          add( PersonalDetails);
          
           JLabel name  = new JLabel("Name :");
           name.setFont(new Font("Raleway" , Font.BOLD,20));
           name.setBounds(100, 140, 100, 30);
          add( name);
          
          nameTextField = new JTextField();
       nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       nameTextField.setBounds(300, 140, 400, 30);
       add(nameTextField);
          
           JLabel Father   = new JLabel("Father Name :");
           Father.setFont(new Font("Raleway" , Font.BOLD,20));
            Father.setBounds(100, 190, 200, 30);
          add(  Father);
          
            
          fatherTextField = new JTextField();
       fatherTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       fatherTextField.setBounds(300, 190, 400, 30);
       add(fatherTextField);
       
           JLabel dob   = new JLabel("Date Of Birth  :");
          dob.setFont(new Font("Raleway" , Font.BOLD,20));
           dob.setBounds(100, 240, 200, 30);
          add(  dob);
          
          dateChooser = new JDateChooser();
	
	dateChooser.setForeground(new Color(105, 105, 105));
	dateChooser.setBounds(300,240,400,30);
	add(dateChooser);
          
          JLabel gender   = new JLabel("Gender :");
          gender .setFont(new Font("Raleway" , Font.BOLD,20));
           gender .setBounds(100, 290, 200, 30);
          add(gender );
         
        male = new JRadioButton("Male");
       male.setFont(new Font("Raleway", Font.BOLD, 14));
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
         female = new JRadioButton("Female");
        female.setFont(new Font("Raleway", Font.BOLD, 14));
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
          ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
         gendergroup.add(female);
         
         
          JLabel email   = new JLabel("Email :");
          email  .setFont(new Font("Raleway" , Font.BOLD,20));
           email  .setBounds(100, 340, 120, 30);
          add(email );
          
            emailTextField = new JTextField();
       emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       emailTextField.setBounds(300, 340, 400, 30);
       add(emailTextField);
       
          JLabel marital   = new JLabel("Marital status :");
          marital   .setFont(new Font("Raleway" , Font.BOLD,20));
            marital  .setBounds(100, 390, 200, 30);
          add( marital  );
          
            married = new JRadioButton("Married");
       married .setFont(new Font("Raleway", Font.BOLD, 14));
       married .setBounds(300,390,100,30);
        married .setBackground(Color.WHITE);
        add(married );
        
         unmarried  = new JRadioButton("Unmarried ");
        unmarried .setFont(new Font("Raleway", Font.BOLD, 13));
        unmarried .setBounds(450,390,100,30);
        unmarried .setBackground(Color.WHITE);
        add(unmarried );
        
          ButtonGroup maritagroup = new ButtonGroup();
        maritagroup.add( married);
         maritagroup.add( unmarried);
          
          JLabel adders   = new JLabel("Adderess :");
         adders.setFont(new Font("Raleway" , Font.BOLD,20));
            adders.setBounds(100, 440, 200, 30);
          add( adders    );
          
          
            addersTextField = new JTextField();
       addersTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       addersTextField.setBounds(300, 440, 400, 30);
       add(addersTextField);
          
          
          JLabel city  = new JLabel("City :");
         city  .setFont(new Font("Raleway" , Font.BOLD,20));
           city.setBounds(100, 490, 200, 30);
          add(city);
          
            cityTextField = new JTextField();
       cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       cityTextField.setBounds(300, 490, 400, 30);
       add(cityTextField);
       
          JLabel state  = new JLabel("State :");
         state.setFont(new Font("Raleway" , Font.BOLD,20));
           state.setBounds(100, 540, 200, 30);
          add(state);
          
           stateTextField = new JTextField();
       stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
      stateTextField.setBounds(300, 540, 400, 30);
       add(stateTextField);
          
          JLabel pincod  = new JLabel("Pin Code :");
         pincod .setFont(new Font("Raleway" , Font.BOLD,20));
           pincod .setBounds(100, 590, 200, 30);
          add(pincod );
          
           pincodTextField = new JTextField();
       pincodTextField.setFont(new Font("Raleway", Font.BOLD, 14));
      pincodTextField.setBounds(300, 590, 400, 30);
       add(pincodTextField);
          
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
     String formno = "" + random;
      String name =  nameTextField.getText();
      String father =   fatherTextField.getText();
    
      String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
      String gender  = null;
        if(male.isSelected()){ 
            gender = "Male";
        }else if(female.isSelected()){ 
            gender = "Female";
        }
          String email = emailTextField.getText();
          
        String marital = null;
        if(married.isSelected())
        { 
            marital = "married";
        }else if(unmarried.isSelected())
        { 
            marital = "Unmarried";
        
        }
        
        String address = addersTextField.getText();
        String city = cityTextField.getText();
        String  pincod =  pincodTextField.getText();
        String state = stateTextField.getText();
        
        try{
           if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Fill all the required fields");
           } else {
           conn c = new conn();
         String query = "insert into signup values('"+formno+"','"+name+"','"+father+"',"
                 + "'"+dob+"','"+gender+"','"+email+"',"
                 + "'"+marital+"','"+address+"','"+city+"','"+pincod+"','"+state+"')";
         
                 c.s.executeUpdate(query);
                 
                 setVisible(false); 
        new signupTow( formno).setVisible(true);
              /*jbj coning */
           }
           
        }catch(Exception e){
         System.out.println(e);
        }
    }
         
    
   
  
     public static void main(String[] args){
        new signupone();
    }
    
}
