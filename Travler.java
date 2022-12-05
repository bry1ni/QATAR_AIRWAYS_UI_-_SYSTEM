package QATAR_AIRWAYS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Travler extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JPanel pw,ps,pn,content,apps,ll1,pe;
	JMenuBar mb;
	JLabel l1,horloge;
	JButton service,appel,toilet,alert,reveil,track;
	JButton food,game,movie,book,music,www;
	JButton cc,f,chat;
	public Travler() {
		// TODO Auto-generated constructor stub
		this.setSize(950,545);
		
		JFrame fen = new JFrame();
		fen.setTitle("Travler UI");
		JFrame frame = new JFrame();
		fen.setBounds(400,0,950,545);
		fen.setVisible(true);
		
		
		
		//NORTH---------------------------------------------------------------------------------
		JButton gamek = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT)));
	       gamek.setBackground(Color.white);
	       gamek.setBounds(280,70,100,100);
	       
	       JButton moviek = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT)));
	       moviek.setBackground(Color.white);
	       moviek.setBounds(450,70,100,100);
	      JButton sit;
	      JLabel l111 = new JLabel(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(800,350,Image.SCALE_DEFAULT)));
	       l111.add(gamek);
	       l111.add(moviek);
	       
		pn = new JPanel();
		pn.setBackground(new Color(92, 6, 50));
		mb = new JMenuBar();
		 mb.setBackground(Color.white);
		 mb.add(sit = new JButton("14",new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
		 sit.setBackground(Color.white);
	       sit.setBorderPainted(false);
		 horloge = new JLabel();
  
       horloge.setText(
         DateFormat.getDateTimeInstance().format(new Date())
       );
       horloge.setForeground(new Color(92, 6, 50));
       mb.add(horloge);
       Timer t = new Timer(500, new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            horloge.setText(
               DateFormat.getDateTimeInstance().format(new Date())
            );
          }
       });
       t.setRepeats(true);
       t.setCoalesce(true);
       t.setInitialDelay(0);
       t.start();
       mb.add(new JSeparator());
       JButton kid = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT)));
       kid.setToolTipText("Switcher au mode enfants");
       kid.setBackground(Color.white);
       kid.setBorderPainted(false);
       kid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				fen.setTitle("Kids UI");
				pw.setVisible(false);
				pe.setVisible(false);
				content.setVisible(false);
				fen.getContentPane().add(l111,BorderLayout.CENTER);
				l111.setVisible(true);
			}});
       mb.add(kid);
       pn.add(mb);
       
       
       //WEST-----------------------------------------------------------------------------------------
       pw = new JPanel(new GridLayout(0,1));
       pw.setBackground(new Color(92, 6, 50));
       pw.add(service = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
       service.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			new Videos();
		}});
       service.setBackground(Color.white);
       service.setToolTipText("Demander un service a l'hotesse");
       pw.add(appel = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
       appel.addActionListener(new ActionListener() {
   		public void actionPerformed(ActionEvent event) {
   			Worker w = new Worker();
   			JOptionPane.showMessageDialog(null,"En Attente--");
   			w.app.setText("Incoming call from 14");
   			w.accept.setVisible(true);
   			w.dismiss.setVisible(true);
   		}});
       appel.setBackground(Color.white);
       appel.setToolTipText("Appeler l'hotesse");
       pw.add(toilet = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
       toilet.setEnabled(false);
       toilet.setToolTipText("Voir si les toilettes sont vides");
       pw.add(alert = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
       alert.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			Worker w = new Worker();
			JOptionPane.showMessageDialog(null,"Worker have been alerted");
			w.sit.setSelected(true);
		}});
       alert.setBackground(Color.white);
       alert.setToolTipText("Demander l'hotesse");
       pw.add(reveil = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
       reveil.setEnabled(false);
       reveil.setToolTipText("Programmer un r�veil");
       pw.add(track = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
       track.setEnabled(false);
       track.setToolTipText("Suivre mon vol");
       
       //SOUTH----------------------------------------------------------------------------------
       ps = new JPanel();
       ps.setBackground(Color.white);
       JButton exit = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(40,30,Image.SCALE_DEFAULT)));
       exit.setBorderPainted(false);
       exit.setFocusable(false);
       exit.setBackground(Color.white);
       exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
 				
			new Login();
			fen.dispose();
			
			}});
       ps.add(exit);
       
       //CENTER----------------------------------------------------------------------------------
       apps = new JPanel(new GridLayout(1,0));
       apps.add(food = new JButton("Food",new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT))));
       food.setBackground(Color.white);
       food.setToolTipText("Commander a manger");
       food.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent event) {
 				
 			new Meals();
 			
 			}});
       apps.add(game = new JButton("Games",new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT))));
       game.setBackground(Color.white);
       game.setToolTipText("Jouer a des jeux");
       apps.add(movie = new JButton("Movies",new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT))));
       movie.setBackground(Color.white);
       movie.setToolTipText("Regarder des films");
       movie.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent event) {
  				
 			new Movies();
 			
 			}});
       apps.add(book = new JButton("Books",new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT))));
       book.setBackground(Color.white);
       book.setToolTipText("Lire des livres");
       book.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent event) {
  				
 			new Book();
 			}});
       apps.add(music = new JButton("Music",new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT))));
       music.setBackground(Color.white);
       music.setToolTipText("Ecouter de la musique");
       apps.add(www = new JButton("Internet",new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT))));
       www.setBackground(Color.white);
       www.setToolTipText("Surfer sur le net");
       www.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent event) {
 				
 			new Browser();
 			
 			}});
       ll1 = new JPanel();
       ll1.add(l1 = new JLabel(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(800,350,Image.SCALE_DEFAULT))));
       l1.setBackground(new Color(92, 6, 50));
       content = new JPanel();
       content.setBackground(new Color(92, 6, 50));
       content.add(apps);
       content.add(ll1);
       
       
       //EAST--------------------------------------------------------------------------------------------------------
       pe = new JPanel(new GridLayout(0,1));
       pe.add(new Button(""));
       pe.add(new Button(""));
       pe.setBackground(new Color(92, 6, 50));
       pe.add(cc = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
       cc.setBackground(Color.white);
       cc.setToolTipText("Entrez votre carte de cr�dit");
       final JDialog modelDialog = createDialog(frame);
       cc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				modelDialog.setVisible(true);
			}});
       pe.add(f = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
       f.setBackground(Color.white);
       f.setToolTipText("Voir vos d�penses");
       f.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
 				
			new Facture();
			
			}});
       pe.add(chat = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
       chat.setBackground(Color.white);
       chat.setToolTipText("Entrez en Discussion group");
       chat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
			new Discussion();
			
			}});
       pe.add(new Button(""));
       
       
      
       
       
        fen.getContentPane().add(pn,BorderLayout.NORTH);
		fen.getContentPane().add(ps,BorderLayout.SOUTH);
		fen.getContentPane().add(pw,BorderLayout.WEST);
		fen.getContentPane().add(content,BorderLayout.CENTER);
		fen.getContentPane().add(pe,BorderLayout.EAST);
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
