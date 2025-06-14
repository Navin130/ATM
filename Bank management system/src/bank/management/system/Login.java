
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login , clear, sinup;
    JTextField cardTextField  ;
    JPasswordField pinTextField ;
    Login(){
           setTitle("AUTOMATED TELLER MACHINE");
           setLayout(null);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
         Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
          JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
          add(label);
          
         JLabel text = new JLabel("WELCOME TO ATM");
          text.setFont(new Font("Osward", Font.BOLD, 38));
          text.setBounds(200,40,400,40);
         add(text);
  
         JLabel cardno = new JLabel("Card No. ");
          cardno.setFont(new Font("Osward", Font.BOLD, 28));
          cardno.setBounds(120,150,150,30);
         add(cardno);
                 
          cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
         add(cardTextField);
        
          JLabel pin = new JLabel("Pin No.");
          pin.setFont(new Font("Osward", Font.BOLD, 28));
          pin.setBounds(120,220,230,30);
         add(pin);
         
          pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
         add(pinTextField);
         
         login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
      login.setForeground(Color.WHITE);
      login.addActionListener(this);
      add(login);
        
       clear = new JButton("CLEAR");
     clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
          add(clear);
          
       sinup  = new JButton("SIGN UP");
      sinup.setBounds(300,350,230,30);
        sinup.setBackground(Color.BLACK);
      sinup.setForeground(Color.WHITE);
      sinup.addActionListener(this);
          add( sinup);
          
           getContentPane().setBackground(Color.WHITE);
          
      setSize(800,480);
       setVisible(true);
        setLocation(550,200);
       
        
    }
    public void actionPerformed(ActionEvent ae){
     
        if(ae.getSource()==clear){
            cardTextField.setText("") ;
            pinTextField.setText("") ;
        
        } else if(ae.getSource()==login){
         conn conn = new conn();
         String cardnumber = cardTextField.getText();
         String pinnumber = pinTextField.getText();
         String query ="select*from Login where cardnumber = " + "'"+cardnumber+"' and pinnumber ='"+pinnumber+"'";
         
         try {
                 ResultSet rs =  conn.s.executeQuery(query);
             if(rs.next()){
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
       
       
       }else {
            JOptionPane.showMessageDialog(null, "Incortect Card Number Or Pin");
       }
       
       
       
         }catch(Exception e){
            System.out.println(e);
        }
             
             
        } else if(ae.getSource()==sinup){
        setVisible(false); 
        new signupone().setVisible(true);
        }
        
    }
   
     public static void main(String[] args){
        new Login();
    }
    
}

