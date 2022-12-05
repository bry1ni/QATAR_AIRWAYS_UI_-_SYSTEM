package QATAR_AIRWAYS;

import java.awt.*;
import javax.swing.*;


public class Book extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon book2,book4;
	JLabel b2,b4;
	JButton watch1;
	public double price=0.99;
		public Book() {
			this.setSize(600,400);
			this.setTitle("Book");
			book2 = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));
			book4 = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));

			
			JPanel pan = new JPanel();
			pan.setLayout(null);
			pan.setBackground(new Color(116, 127, 138));


			b2 = new JLabel(book2);
			b2.setBounds(50,10,250,250);
			watch1= new JButton("Read "+price+"$");
			watch1.setBounds(125,250,100,30);
			watch1.setBackground(new Color(92, 6, 50));
			watch1.setForeground(Color.white);
			watch1.setFocusable(false);
			b4 = new JLabel(book4);
			JButton watch3 = new JButton("Read");
			b4.setBounds(300,10,250,250);
			watch3.setBackground(new Color(92, 6, 50));
			watch3.setForeground(Color.white);
			watch3.setBounds(375,250,100,30);
			watch3.setFocusable(false);
			
			pan.add(watch1);
			pan.add(watch3);
			pan.add(b2);
			pan.add(b4);
			
			
			this.getContentPane().add(pan);
			this.setVisible(true);
		}
}
