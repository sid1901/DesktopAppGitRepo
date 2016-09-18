
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SelectedProduct extends JFrame {
	
	
	
	public SelectedProduct(String title){
		
		super( title );                     // invoke the JFrame constructor
	    setLayout( new FlowLayout() );      // set the layout manager

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(2950,2950);
		setVisible(true);
		
		JButton save,cancel;
		JLabel productName,qty,toatl_Amt;
		JTextField p_name,qty1,total_Amt1;
		
		productName= new JLabel("Selected Product");
		productName.setFont(new Font("Dialog", Font.BOLD, 16));
		add(productName);
		p_name=new JTextField(5);
		p_name.setFont(new Font("Dialog", Font.BOLD, 16));
		add(p_name);
		
		qty=new JLabel("Quantity");
		qty.setFont(new Font("Dialog", Font.BOLD, 16));
		add(qty);
		qty1=new JTextField(6);
		qty1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(qty1);
		
		toatl_Amt=new JLabel("Total Amount");
		toatl_Amt.setFont(new Font("Dialog", Font.BOLD, 16));
		add(toatl_Amt);
		total_Amt1 =new JTextField(6);
		total_Amt1.setFont(new Font("Dialog", Font.BOLD, 16));
		add(total_Amt1);
		
		save= new JButton("Save");
		save.setFont(new Font("Dialog", Font.BOLD, 16));
		add(save);
	
		cancel= new JButton("CANCEL");
		cancel.setFont(new Font("Dialog", Font.BOLD, 16));
		add(cancel);
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//ButtonFrame.dispose();	
				new StartSale("START SALE");
			}
		});
	
}
}
