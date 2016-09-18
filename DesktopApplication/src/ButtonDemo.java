import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.sql.*;

class ButtonFrame extends JFrame
{
  JButton b1,b2,b3,b4,b5 ; // reference to the button object

  // constructor for ButtonFrame
  ButtonFrame(String title) 
  {
    super( title );                     // invoke the JFrame constructor
    setLayout( new FlowLayout() );      // set the layout manager

    b1 = new JButton("Start Sale"); // construct a JButton
    add( b1 ); 
    b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new StartSale("START SALE");
		}
	});// add the button to the JFrame
    
    b2 = new JButton("Add Customer and Customer List"); // construct a JButton
    add( b2 );                     // add the button to the JFrame
    
    b3 = new JButton("Detailed History of Sale"); // construct a JButton
    add( b3 );                     // add the button to the JFrame
    
    b4 = new JButton("Manage Products"); // construct a JButton
    add( b4 );                     // add the button to the JFrame
	b4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new ManageProducts("ManageProducts");
		}
	});
    
    b5 = new JButton("Profit/Loss"); // construct a JButton
    add( b5 );                     // add the button to the JFrame
    
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
  }
}

public class ButtonDemo
{
  public static void main ( String[] args )
  {
    ButtonFrame frm = new ButtonFrame("Sales Demo"); // gives frame name
    frm.setSize( 750, 375 );     
    frm.setVisible( true );
    
    try{
    	// Step1 : Load the driver class
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	
    	
    	// Step2 : Create the connection object
    	Connection con=DriverManager.getConnection(
    			"jdbc:oracle:thin:@25.99.22.204:1522:SidDB3","HR","Poker$CSC1901");
    	
    	// Step3 : Create statement object
    	Statement stmt = con.createStatement();
    	
    	//Step4 : Execute query p
    	ResultSet rs=stmt.executeQuery("select count(*) from employees");
    	while(rs.next())
    		System.out.println(rs.getInt(1));
    	
    	//Step5 : Close connection
    	con.close();
    }
    catch(Exception e){
    	e.printStackTrace();
    	System.out.println(e);
    }
    
    
  }
}