
package bank.management.system;

import javax.swing.*;//  for using fram layout and extends
import java.awt.*;// for image class  inupt 
import java.awt.event.*;
//import java.sql.*;

public class PinChange extends JFrame implements ActionListener{
    
     JPasswordField pin , repin;
     JButton change , back;
     String pinnumber ;
     
   PinChange(String pinnnumber){
   
         this.pinnumber=pinnumber;
         
       setLayout(null);
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900,900);
        add(image);
                //------------ BOUNDS----------------
                
          JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        text.setBounds(250,280,500,35);
        image.add(text);
        
        JLabel pintext = new JLabel("New PIN:");
        pintext.setFont(new Font("System", Font.BOLD, 16));
        pintext.setForeground(Color.WHITE);
         pintext.setBounds(165,320,180,35);
        image.add(pintext);
        
       pin = new  JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(330,320,180,25);
        image.add(pin);
        
        JLabel repintext = new JLabel("Re-Enter New PIN:");
        repintext.setFont(new Font("System", Font.BOLD, 16));
        repintext.setForeground(Color.WHITE);
         repintext.setBounds(165,360,180,25);
        image.add(repintext);
        
         repin = new  JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD, 25));
        repin.setBounds(330,360,180,25);
        image.add(repin);
        
        change=  new JButton("CHANGE");
      change.setBounds(350,485,150,30);
      change.addActionListener(this);
      image.add(change);
        
      back=  new JButton("BACK");
      back.setBounds(350,520,150,30);
      back.addActionListener(this);
      image.add(back);
      
        
        //frame layout 
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
   
   public void actionPerformed(ActionEvent ae){
       if (ae.getSource()== change){
           try{
                String npin = pin.getText();
                String rpin = repin.getText();
        
              if(!npin.equals(rpin)){
                   JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    return;
                    }
              if(npin.equals("")){
              JOptionPane.showMessageDialog(null, "Pleas  enter new PIN");
                    return;
              
              }
              
              if(rpin.equals("")){
              JOptionPane.showMessageDialog(null, "Pleas  re-enter  PIN");
                    return;
              }
          
            conn conn = new conn();
              
                String query1 = "update bank set pinnumbe  = '"+rpin+"' where pinnumbe = '"+pinnumber+"' ";
                String query2 = "update login set pinnumbe = '"+rpin+"' where pinnumbe = '"+pinnumber +"' ";
                String query3 = "update signupthree set pinnumbe = '"+rpin+"' where pinnumbe = '"+pinnumber+"' ";

                conn.s.executeUpdate(query1); 
                 conn.s.executeUpdate(query2); 
                  conn.s.executeUpdate(query3); 
                        
                 JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
               new Transactions (rpin).setVisible(true);
                        
             }  catch(Exception e){
                       System.out.println(e);
                   }
     
       } else {
           
           setVisible(false);
           new Transactions (pinnumber).setVisible(true);
       
       }
   
   
   }
    public static void main(String[] args){
        
        new PinChange("").setVisible(true);
    }
}
