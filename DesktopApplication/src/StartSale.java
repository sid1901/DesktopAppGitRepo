import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StartSale extends JFrame {
	StartSale(String title){
		
		super( title );                     // invoke the JFrame constructor
	    setLayout( new FlowLayout() );      // set the layout manager

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(2950,2950);
		setVisible(true);

		
	JButton A,B,C,D,E,F,G,H;
	A= new JButton("A");
	A.setFont(new Font("Dialog", Font.BOLD, 16));
	add(A);
	 A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//ButtonFrame.dispose();	
				new AccessQuantity("Access Quantity");
			}
		});

	B= new JButton("B");
	B.setFont(new Font("Dialog", Font.BOLD, 16));
	add(B);
	B.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new AccessQuantity("Access Quantity");
		}
	});
	
	C= new JButton("C");
	C.setFont(new Font("Dialog", Font.BOLD, 16));
	add(C);
	C.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new AccessQuantity("Access Quantity");
		}
	});
	
	D= new JButton("D");
	D.setFont(new Font("Dialog", Font.BOLD, 16));
	add(D);
	D.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new AccessQuantity("Access Quantity");
		}
	});
	
	E= new JButton("E");
	E.setFont(new Font("Dialog", Font.BOLD, 16));
	add(E);
	E.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new AccessQuantity("Access Quantity");
		}
	});
	
	F= new JButton("F");
	F.setFont(new Font("Dialog", Font.BOLD, 16));
	add(F);
	F.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new AccessQuantity("Access Quantity");
		}
	});
	
	G= new JButton("G");
	G.setFont(new Font("Dialog", Font.BOLD, 16));
	add(G);
	G.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new AccessQuantity("Access Quantity");
		}
	});
	
	H= new JButton("H");
	H.setFont(new Font("Dialog", Font.BOLD, 16));
	add(H);
	H.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			//ButtonFrame.dispose();	
			new AccessQuantity("Access Quantity");
		}
	});
	
	}
}
