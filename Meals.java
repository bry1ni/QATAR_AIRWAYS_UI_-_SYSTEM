package QATAR_AIRWAYS;


import java.awt.*;
import javax.swing.*;


public class Meals extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel sd,omm,zzz,zz11,s1,s2,crr,gll;
	JButton p1,p2;
	JButton p;
	public Meals() 
	
	{
		this.setSize(300,300);
		JFrame ff = new JFrame("Food");
		ff.setBounds(600,0,300,300);
		
		ImageIcon salad = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT));
		ImageIcon om = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT));
		ImageIcon zz = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT));
		ImageIcon zz1 = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT));
		ImageIcon s11 = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT));
		ImageIcon cr = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT));
		ImageIcon gl = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT));

		JTabbedPane tab = new JTabbedPane();
		JPanel pan = new JPanel();
		pan.setLayout(null);
		pan.setBackground(new Color(92, 6, 50));
		sd = new JLabel(salad);
		sd.setBounds(10,10,100,100);
		omm = new JLabel(om);
		omm.setBounds(130,10,100,100);
		p1 = new JButton("+");
		p1.setBounds(40,130,50,50);		
		p2 = new JButton("+");
		p2.setBounds(170,130,50,50);
		pan.add(sd);
		pan.add(omm);
		pan.add(p1);
		pan.add(p2);
		
	      
	      
	      
	      
	      JPanel panPlat = new JPanel();
	      panPlat.setBackground(new Color(92, 6, 50));
	      panPlat.setLayout(null);
	      zzz = new JLabel(zz);
			zzz.setBounds(10,10,100,100);
			zz11 = new JLabel(zz1);
			zz11.setBounds(130,10,100,100);	
			p = new JButton("10$");
			p.setBounds(20,130,70,50);		
			p2 = new JButton("+");
			p2.setBounds(170,130,50,50);
			panPlat.add(zzz);
			panPlat.add(zz11);
			panPlat.add(p);
			panPlat.add(p2);
	      
		      JPanel pandes = new JPanel(new GridLayout(1,4));
				pandes.setBackground(new Color(92, 6, 50));
				 pandes.setLayout(null);
			      crr = new JLabel(cr);
					crr.setBounds(10,10,100,100);
					gll = new JLabel(gl);
					gll.setBounds(130,10,100,100);
					p1 = new JButton("+");
					p1.setBounds(40,130,50,50);		
					p2 = new JButton("+");
					p2.setBounds(170,130,50,50);
					pandes.add(crr);
					pandes.add(gll);
					pandes.add(p1);
					pandes.add(p2);
		      
			      JPanel pansan = new JPanel(new GridLayout(1,4));
					pansan.setBackground(new Color(92, 6, 50));
					 pansan.setLayout(null);
					 s1 = new JLabel(s11);
						s1.setBounds(10,10,100,100);
						p1 = new JButton("+");
						p1.setBounds(40,130,50,50);		
						
						pansan.add(s1);
						pansan.add(p1);
			      
			tab.addTab("Entr�e", pan);
			tab.addTab("Plat", panPlat);
			tab.addTab("Sandwich", pansan);
			tab.addTab("Desserts", pandes);
			
			ff.getContentPane().add(tab);
			ff.setVisible(true);
}
}
