package QATAR_AIRWAYS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import java.awt.*;
public class Facture extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JCheckBox master,visa;
	JButton v,r;
	JTextField nc,de;
	public double total=0;
	Font  f3  = new Font(Font.DIALOG,  Font.BOLD, 15);
	JLabel film,book;
	JButton c,cc;
	Movies m = new Movies();
	Book b = new Book();
	Meals f = new Meals();
	public Facture() {
		// TODO Auto-generated constructor stub
		this.setSize(200,300);
		JFrame factu = new JFrame();
		factu.setTitle("Facture");
		factu.setVisible(true);
		factu.setBounds(900,300,200,300);
		
		JFrame frame = new JFrame();
		
	JLabel titre = new JLabel("Facture");
	titre.setFont(f3);
	titre.setBackground(new Color(116, 127, 138));
	
	JPanel content = new JPanel(new GridLayout(0,1));
	content.setBackground(new Color(116, 127, 138));
	film = new JLabel("");
	book = new JLabel("");
	JLabel food = new JLabel("");
	JLabel totall = new JLabel("Total: ");
	content.add(film);
	content.add(book);
	content.add(food);
	
	b.watch1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			b.watch1.setEnabled(false);
			total=total+b.price;
			book.setText("The girl without a name -"+b.price+"$");
			totall.setText("Total: "+total+"$");
			
		}});
	m.watch.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			m.watch.setEnabled(false);
			total=total+Movies.price;
			film.setText("HarryPoter - "+Movies.price+"$");
			totall.setText("Total: "+total+"$");
		}});
	f.p.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			total=total+10;
			food.setText("Steak grill� - 10$");
			totall.setText("Total: "+total+"$");
		}});
	content.add(totall);
	
	
	JPanel p = new JPanel();
	p.setBackground(new Color(116, 127, 138));
	p.add(c=new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
	c.setBackground(new Color(116, 127, 138));
	c.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "Payer "+total+"$ a la fin du vol","information",JOptionPane.INFORMATION_MESSAGE, new ImageIcon(new ImageIcon("C:\\Users\\rayan\\eclipse-workspace\\Images\\cash.png").getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT)));
		}});
	p.add(cc=new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
	cc.setBackground(new Color(116, 127, 138));
	final JDialog modelDialog = createDialog(frame);
	cc.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				modelDialog.setVisible(true);		
		}});
	
	factu.getContentPane().add(titre,BorderLayout.NORTH);
	factu.getContentPane().add(content,BorderLayout.CENTER);
	factu.getContentPane().add(p,BorderLayout.SOUTH);
	}
	public static JDialog createDialog(final JFrame frame){
		final JDialog modelDialog = new JDialog(frame, "Carte cr�dit infos.", Dialog.ModalityType.DOCUMENT_MODAL);
		modelDialog.setBounds(800, 0, 400,250);
		Container dialogContainer = modelDialog.getContentPane();
		dialogContainer.setLayout(new BorderLayout());

		JPanel pan1 = new JPanel();
		pan1.add(new Label("Information de la carte de cr�dit:"));
		pan1.setBackground(new Color(152,251,152));
		
		JPanel pan = new JPanel(new GridLayout(0,1));
		pan.setBackground(new Color(152,251,152));
		pan.add(new Label("Type de carte: *"));
		pan.add(new Label("Num�ro de la carte: *"));
		pan.add(new Label("Expiration date(MM/AA): *"));
		pan.add(new Label("CVV:"));
		
		JPanel pan2 = new JPanel(new GridLayout(0,1));
		pan2.setBackground(new Color(152,251,152));
		JPanel pan22 = new JPanel(new GridLayout(1,2));
		pan22.setBackground(new Color(152,251,152));
		JCheckBox master = new JCheckBox("MasterCard");
		master.setBackground(new Color(152,251,152));
		pan22.add(master);
		JCheckBox visa = new JCheckBox("Visa");
		visa.setBackground(new Color(152,251,152));
		pan22.add(visa);
		pan2.add(pan22);
		JTextField nc = new JTextField();
		nc.setToolTipText("16 digit");
		pan2.add(nc);
		JTextField de = new JTextField();
		de.setToolTipText("Exemple: 11/2022");
		pan2.add(de);
		JTextField cvv = new JTextField();
		cvv.setToolTipText("3 digit (Exemple: 433)");
		pan2.add(cvv);
		
		
		JPanel content = new JPanel();
		content.setBackground(new Color(152,251,152));
		content.add(pan);
		content.add(pan2);
		
		JPanel panB = new JPanel();
		panB.setBackground(new Color(152,251,152));
		panB.add(new Label("(*)Champ obligatoire --"));
		JButton v = new JButton("Valider");
		v.setForeground(new Color(0,100,0));
		v.setBackground(Color.white);
		panB.add(v);
		v.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if ((nc.getText().equals("")) || (cvv.getText().equals(""))) {
					JOptionPane.showMessageDialog(null,"Veuiller remplir les champs vides svp");
					}else {
						if (nc.getText().length()!=16)
							JOptionPane.showMessageDialog(null,nc.getText()+" num�ro de carte invalide");
						
						if (cvv.getText().length()!=3)
							JOptionPane.showMessageDialog(null,cvv.getText()+" CVV invalide");
						
						verifDate(de.getText());
					}
				
				
				
			}});
		JButton r = new JButton("Reset");
		r.setForeground(new Color(0,100,0));
		r.setBackground(Color.white);
		r.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				nc.setText(null);	
				de.setText(null);
				cvv.setText(null);
		}});
		panB.add(r);
		
		dialogContainer.add(pan1,BorderLayout.NORTH);
		dialogContainer.add(panB,BorderLayout.SOUTH);
		dialogContainer.add(content,BorderLayout.CENTER);
		return modelDialog;
	}
	public static boolean verifDate(String strDate)
	   {
		if (strDate.trim().equals(""))
		{
		    return true;
		}else
		{
		    SimpleDateFormat form = new SimpleDateFormat("MM/yyyy");
		    form.setLenient(false);
		    try
		    {
		        Date javaDate = form.parse(strDate);
		    }
		    catch (ParseException e)
		    {
		    	JOptionPane.showMessageDialog(null,strDate+" Date invalide");
		        return false;
		    }
		    return true;
		}
	   }
	}

