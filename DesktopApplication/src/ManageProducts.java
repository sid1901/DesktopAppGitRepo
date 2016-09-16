
import java.awt.*; 
import javax.swing.*;

public class ManageProducts extends JFrame {
	
	
	
	public ManageProducts(String title){
		
		super( title );                     // invoke the JFrame constructor
	    setLayout( new FlowLayout() );      // set the layout manager

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(2950,2950);
		setVisible(true);
		
		JButton save;
		JLabel productName, date,qty,rate;
		JTextField p_name,date1,qty1,rate1;
		
		productName= new JLabel("Product Name");
		productName.setFont(new Font("Dialog", Font.BOLD, 16));
		add(productName);
		p_name=new JTextField(5);
		p_name.setFont(new Font("Dialog", Font.BOLD, 16));
		
		add(p_name);
		
		date=new JLabel("Date");
		date.setFont(new Font("Dialog", Font.BOLD, 16));
		add(date);
		date1=new JTextField(5);
		date1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(date1);
		
		qty=new JLabel("Quantity");
		qty.setFont(new Font("Dialog", Font.BOLD, 16));
		add(qty);
		qty1=new JTextField(6);
		qty1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(qty1);
		
		rate=new JLabel("Rate");
		rate.setFont(new Font("Dialog", Font.BOLD, 16));
		add(rate);
		rate1=new JTextField(6);
		rate1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(rate1);
		
		save= new JButton("Save");
		save.setFont(new Font("Dialog", Font.BOLD, 16));
		add(save);
	
	
}
}
