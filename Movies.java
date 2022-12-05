package QATAR_AIRWAYS;

import java.awt.*;
import javax.swing.*;

public class Movies extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon movie1,movie2,movie3,movie4;
	JLabel b1,b2,b3,b4;
	JButton watch;
	public static double price=0.99;
	
	public Movies() {
		// TODO Auto-generated constructor stub
		this.setSize(500,400);
		JFrame mov = new JFrame();
		mov.setBounds(0,350,500,400);
		mov.setTitle("Movies");
		
		JTabbedPane tab= new JTabbedPane(JTabbedPane.LEFT);
		
		movie1 = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));
		movie2 = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));
		movie3 = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));
		movie4 = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT));
		
		JPanel pan = new JPanel();
		pan.setLayout(null);
		pan.setBackground(new Color(116, 127, 138));
		b1 = new JLabel(movie1);
		b1.setBounds(90,10,300,300);
		watch= new JButton("Watch "+price+"$");
		watch.setBounds(180,280,130,30);
		watch.setBackground(new Color(92, 6, 50));
		watch.setForeground(Color.white);
		pan.add(b1);
		pan.add(watch);
		
		JPanel pan1 = new JPanel();
		pan1.setLayout(null);
		pan1.setBackground(new Color(116, 127, 138));
		b2 = new JLabel(movie2);
		b2.setBounds(0,0,250,250);
		JButton watch1= new JButton("Watch");
		watch1.setBounds(70,250,100,30);
		watch1.setBackground(new Color(92, 6, 50));
		watch1.setForeground(Color.white);
		b3 = new JLabel(movie3);
		JButton watch2= new JButton("Watch");
		b3.setBounds(200,0,250,250);
		watch2.setBackground(new Color(92, 6, 50));
		watch2.setForeground(Color.white);
		watch2.setBounds(270,250,100,30);
		pan1.add(b2);
		pan1.add(watch1);
		pan1.add(watch2);
		pan1.add(b3);

		
		JPanel pan3 = new JPanel();
		pan3.setLayout(null);
		pan3.setBackground(new Color(116, 127, 138));
		b4 = new JLabel(movie4);
		JButton watch3 = new JButton("Watch");
		b4.setBounds(90,10,300,300);
		watch3.setBackground(new Color(92, 6, 50));
		watch3.setForeground(Color.white);
		watch3.setBounds(190,280,100,30);
		pan3.add(b4);
		pan3.add(watch3);

		
		tab.addTab("Sci-Fi",pan);
		tab.addTab("Cartoons",pan1);
		tab.addTab("Drame",pan3);
		
		mov.getContentPane().add(tab);
		mov.setVisible(true);
	}
}
