package QATAR_AIRWAYS;

import java.awt.*;
import javax.swing.*;


public class Browser extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Font font = new Font(Font.DIALOG_INPUT,  Font.BOLD|Font.ITALIC, 25);
	public Browser() {
		// TODO Auto-generated constructor stub

		this.setSize(500,300);
		JPanel f = new JPanel();
		f.setLayout(null);
		f.setBackground(new Color(92, 6, 50));
		JTextField msg = new JTextField();
		msg.setBounds(125, 110, 250, 25);
		JButton b = new JButton("Search");
		b.setBounds(200,150,100,30);
		b.setForeground(Color.WHITE);
		b.setBackground(new Color(116, 127, 138));
		f.add(msg);
		f.add(b);
		
		JLabel l = new JLabel("QATAR AIRWAYS BROWSER");
		
		l.setFont(font);
        l.setBounds(80,5,400,150);
        l.setForeground(Color.WHITE);
        f.add(l);
		this.getContentPane().add(f);
		this.setVisible(true);
	}
}
