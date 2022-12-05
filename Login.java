package QATAR_AIRWAYS;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;


public class Login extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton t,w;
	JLabel l;
	
	Login()
	{
		this.setSize(400, 250);
		this.setTitle("Accueil");
		
		JFrame f = new JFrame();
		f.setBounds(500,200,400,250);
		
		l = new JLabel(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(400, 400,Image.SCALE_DEFAULT)));
		
		JPanel buts = new JPanel();
		buts.setBackground(Color.white);
		
		buts.add(t = new JButton("Travler UI"));
		t.setBorderPainted(true);
		t.setFocusable(false);
		t.setForeground(Color.WHITE);
		t.setBackground(new Color(92, 6, 50));
		t.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			
			new Travler();
			f.dispose();
			}});
		
		buts.add(w = new JButton("Worker UI"));
		w.setBorderPainted(true);
		w.setFocusable(false);
		w.setForeground(Color.WHITE);
		w.setBackground(new Color(92, 6, 50));
		w.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			new Worker();
			f.dispose();
			}});
		
		f.getContentPane().add(l,BorderLayout.CENTER);
		f.getContentPane().add(buts,BorderLayout.SOUTH);
		f.setVisible(true);

	}
		public static void main(String[] args) {
	// TODO Auto-generated method stub
	new Login();
}}

	
