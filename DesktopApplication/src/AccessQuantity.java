import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AccessQuantity extends JFrame {
	AccessQuantity(String title){
		
		super( title );                     // invoke the JFrame constructor
	    setLayout( new FlowLayout() );      // set the layout manager

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(2950,2950);
		setVisible(true);

		
	JButton q1,q2,q3,q4,q5;
	q1= new JButton("1");
	q1.setFont(new Font("Dialog", Font.BOLD, 16));
	add(q1);
	q1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new SelectedProduct("Selected Product");
		}
	});

	q2= new JButton("2");
	q2.setFont(new Font("Dialog", Font.BOLD, 16));
	add(q2);
	q2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new SelectedProduct("Selected Product");
		}
	});
	
	q3= new JButton("5");
	q3.setFont(new Font("Dialog", Font.BOLD, 16));
	add(q3);
	q3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new SelectedProduct("Selected Product");
		}
	});
	
	q4= new JButton("10");
	q4.setFont(new Font("Dialog", Font.BOLD, 16));
	add(q4);
	q4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new SelectedProduct("Selected Product");
		}
	});
	
	q5= new JButton("20");
	q5.setFont(new Font("Dialog", Font.BOLD, 16));
	add(q5);
	q5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new SelectedProduct("Selected Product");
		}
	});
	}
}
