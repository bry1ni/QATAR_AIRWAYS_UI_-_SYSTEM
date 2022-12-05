package QATAR_AIRWAYS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Discussion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel title,content,mess;
	JTextField msg;
	public Discussion() {
		// TODO Auto-generated constructor stub
	JFrame disc = new JFrame("Forum Discussion");
	disc.setSize(400,600);
	disc.setBounds(900,120, 400,600);
	disc.setVisible(true);
	
	//NORTH---------------------------------
	title = new JPanel();
	title.add(new Label("Plane's GroupChat"));
	//WEST--------------------------------
	content = new JPanel();
	content.setLayout(new GridLayout(0,1));
	content.add(new JLabel(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT))),BorderLayout.WEST);
	content.add(new JLabel(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT))),BorderLayout.WEST);
	content.add(new JLabel(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT))),BorderLayout.WEST);
	content.add(new JLabel(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT))),BorderLayout.WEST);
	//CENTER--------------------------------
	mess = new JPanel(new GridLayout(0,1));
	mess.add(new Label("25: am i the only one enjoying the flight ?"));
	mess.add(new Label("07: HAHA no ! "));
	mess.add(new Label("25: i thought so"));
	mess.add(new Label("07: HAHA its going so well"));

	//SOUTH---------------------------------
	msg = new JTextField("�crire un message...");
	msg.setBounds(0,0,400,50);
	msg.addActionListener(new ActionListener() {
   		public void actionPerformed(ActionEvent event) {
   			content.add(new JLabel(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT))),BorderLayout.WEST);
   			mess.add(new Label("14: "+msg.getText()));
   			msg.setText(null);
   		}});
	
	disc.getContentPane().add(title,BorderLayout.NORTH);
	disc.getContentPane().add(content,BorderLayout.WEST);
	disc.getContentPane().add(mess,BorderLayout.CENTER);
	disc.getContentPane().add(msg,BorderLayout.SOUTH);
	}

}
