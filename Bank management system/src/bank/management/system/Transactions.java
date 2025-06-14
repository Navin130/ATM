
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions  extends JFrame implements ActionListener {
    JButton deposit,withdrawl,fastcash,minustatement, pinchange,balanceenquiry,exit;
    String pinnumber;
    
    Transactions(String pinnumber){
        
        this.pinnumber = pinnumber;
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
       JLabel text = new JLabel("Please Select Your Transaction");
       text.setBounds(210, 300, 700, 35);
       text.setForeground(Color.WHITE);
       text.setFont(new Font("System", Font.BOLD, 16));
       image.add(text);
       
         deposit = new JButton("DEPOSIT");
       deposit.setBounds(170,415,150,30);
         deposit.addActionListener(this);
       image.add(deposit);
      
        withdrawl = new JButton("CASH WITHDRAWL");
        withdrawl.setBounds(355,415,150,30);
         withdrawl.addActionListener(this);
       image.add(withdrawl);
       
        fastcash = new JButton("FAST CASH");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
       image.add(fastcash);
       
         minustatement = new JButton("MINI STATEMENT");
        minustatement.setBounds(355,450,150,30);
        minustatement.addActionListener(this);
       image.add(minustatement);
       
        pinchange = new JButton("PIN CHANGE");
       pinchange.setBounds(170,485,150,30);
       pinchange.addActionListener(this);
       image.add(pinchange);
       
         balanceenquiry = new JButton("BALANCE ENQUIRY");
        balanceenquiry.setBounds(355,485,150,30);
        balanceenquiry.addActionListener(this);
       image.add(balanceenquiry);
      
       exit = new JButton("EXIT");
       exit.setBounds(355,520,150,30);
       exit.addActionListener(this);
       image.add(exit);
        
        /*--------using frame show  --------*/
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        /*--------using frame show  --------*/
    }
     public void actionPerformed(ActionEvent ae){
      /*----------help opan new page------*/
         if(ae.getSource()== exit){
         System.exit(0);
         } else if (ae.getSource()==deposit){
         
            setVisible(false); 
            new Deposit(pinnumber).setVisible(true);
         }else if (ae.getSource()== withdrawl){
         
              setVisible(false); 
            new Withdrawl(pinnumber).setVisible(true);
            
         } else if (ae.getSource()==fastcash){
               setVisible(false); 
            new FastCash(pinnumber).setVisible(true);
         } else if(ae.getSource()== pinchange){
             setVisible(false); 
            new PinChange(pinnumber).setVisible(true);
            
         } else if(ae.getSource()==  balanceenquiry){
          setVisible(false); 
            new BalanceEnquiry(pinnumber).setVisible(true);
           } else if(ae.getSource()==   minustatement){
        
            new MiniStatement(pinnumber).setVisible(true);
           }
     }
    public static void main(String[] args){
       new  Transactions ("");
    }
    
}


