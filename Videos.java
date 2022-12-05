package QATAR_AIRWAYS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Videos extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Worker a = new Worker();
	JLabel lab11;
	JTextField msg,ns;
	JCheckBox o,c,r,s,boi;
	public Videos() {
	// TODO Auto-generated constructor stub
		
		
		JFrame frame = new JFrame();
		frame.setTitle("Service");
		frame.setSize(350,500);
		JPanel f = new JPanel(new GridLayout(0,1));
		
		
		JPanel titre = new JPanel();
		titre.add(new Label("Client - hotesse"));
		
		JPanel labtext = new JPanel(new GridLayout(1,0));
		labtext.setBorder(BorderFactory.createTitledBorder("Direct Messages"));
		JPanel lab = new JPanel(new GridLayout(0,1));
		lab.setBackground(new Color(116, 127, 138));
		JLabel lab2= new JLabel("Votre Message:");
		lab.add(lab2);
		
		
		JPanel text = new JPanel(new GridLayout(0,1));
		msg = new JTextField();
		text.add(msg);
		
		labtext.add(lab);
		labtext.add(text);
		
		
		JPanel checkp = new JPanel(new GridLayout(1,0));
		checkp.setBorder(BorderFactory.createTitledBorder("Bouffe :"));
		checkp.setBackground(new Color(116, 127, 138));
		JPanel check = new JPanel(new GridLayout(0,1));
		check.setBackground(new Color(116, 127, 138));
		check.setBorder(BorderFactory.createTitledBorder("iTems"));
		o = new JCheckBox("Oreiller");
		c = new JCheckBox("Cache-yeux");
		r = new JCheckBox("Repose-Tete");
		s = new JCheckBox("Sandwich");
		boi = new JCheckBox("Boisson");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(o);
		bg.add(c);
		bg.add(r);
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(s);
		bg2.add(boi);
		
		check.add(o);
		check.add(c);
		check.add(r);
		checkp.add(s);
		checkp.add(boi);
		
		
		f.add(labtext);
		f.add(checkp);
		f.add(check);
		
		o.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(o.isSelected()&&a.stockor>0) {
					a.i.setText(o.getText());
					a.stockor--;
					a.or.setText(""+a.stockor);
				}else JOptionPane.showMessageDialog(null, "iTem no available fo the moment.","information",JOptionPane.INFORMATION_MESSAGE,null);

			
			}});
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(c.isSelected()&&a.stockcach>0) {
					a.i.setText(c.getText());
					a.stockcach--;
					a.cach.setText(""+a.stockcach);
				}else
					JOptionPane.showMessageDialog(null, "iTem no available fo the moment.","information",JOptionPane.INFORMATION_MESSAGE,null);
				
			
			}});
		r.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(r.isSelected()&&a.stockrepo>0) {
					a.stockrepo--;
					a.repo.setText(""+a.stockrepo);}
				else
					JOptionPane.showMessageDialog(null, "iTem no available fo the moment.","information",JOptionPane.INFORMATION_MESSAGE,null);
				
			
			}});
		s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(s.isSelected()&&a.stocksan>0) {
					a.cc.setText(s.getText());
					a.stocksan--;
					a.san.setText(""+a.stocksan);
				}else
					JOptionPane.showMessageDialog(null, "iTem no available fo the moment.","information",JOptionPane.INFORMATION_MESSAGE,null);
				
			
			}});
		boi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(boi.isSelected()&&a.stockbois>0) {
					a.cc.setText(boi.getText());
					a.stockbois--;
					a.bois.setText(""+a.stockbois);
				}else
					JOptionPane.showMessageDialog(null, "iTem no available fo the moment.","information",JOptionPane.INFORMATION_MESSAGE,null);
				
			
			}});
		msg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				a.ms.setText(msg.getText());
				msg.setText(null);
				a.affpro.setVisible(true);
			
			}});
		
		frame.getContentPane().add(titre,BorderLayout.NORTH);
		frame.getContentPane().add(f,BorderLayout.CENTER);
		frame.setVisible(true);
}
	
}