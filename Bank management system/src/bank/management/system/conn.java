
package bank.management.system;

import java.sql.*;
public class conn {
     
    /* create connection */
   Connection c;
    Statement s;
        public conn(){  
        try{  
           
           c =DriverManager.getConnection("jdbc:mysql:/// bankmangementsystem","root","Mysql123@");    
            s  =c.createStatement(); 
           
          
            
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
        
       
    
    
}
