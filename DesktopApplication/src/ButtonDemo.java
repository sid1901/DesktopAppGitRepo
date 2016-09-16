import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class ButtonFrame extends JFrame
{
  JButton b1,b2,b3,b4,b5 ; // reference to the button object

  // constructor for ButtonFrame
  ButtonFrame(String title) 
  {
    super( title );                     // invoke the JFrame constructor
    setLayout( new FlowLayout() );      // set the layout manager

    b1 = new JButton("Start Sale"); // construct a JButton
    add( b1 );                     // add the button to the JFrame
    
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
    ButtonFrame frm = new ButtonFrame("Sales Demo");

    frm.setSize( 750, 375 );     
    frm.setVisible( true );   
  }
}