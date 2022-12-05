package QATAR_AIRWAYS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
public class Worker extends JFrame {
	   
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Videos a = new Videos();
	JLabel ms,i,horloge,app;
	Timer t;
	int stockor=0,stockcach=0,stockrepo=0,stocksan=0,stockbois=0;;
	String[] column1 = {"iTems",
            "Avaibality"};
	Object[][] data1 = {
				{"iTems",
	            "Avaibality"},
		    {"Oreiller", "15"},
		    {"Cache-yeux", "11"},
		    {"repose tete", "11"},
		    {"sandwich", "12"},
		    {"boisson", "6"}
		};
	JLabel or,cach,repo,san,bois;

	JLabel n,cc;
	 JRadioButton sit;
	 JButton affpro,orplus,cachplus,repoplus,sanplus,boisplus;
	 JButton accept,dismiss;
	public Worker() {
		
	      this.setSize(800,500);
	      
		JFrame wfen = new JFrame();
		wfen.setTitle("Worker UI");
	     wfen.setBounds(400,0,800,480);
	     
	    ImageIcon add = new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,20,Image.SCALE_DEFAULT));
	     
	     //stockPanel
		JPanel pans = new JPanel(new GridLayout(0,3));
		pans.setBorder(BorderFactory.createTitledBorder("Stock"));
		pans.setBackground(new Color(116, 127, 138));
		pans.add(new Label("iTems"));
		pans.add(new Label("Disponibilit�es"));
		pans.add(new Label(""));
		pans.add(new Label("Oreiller"));
		pans.add(or = new JLabel(""+stockor));
		pans.add(orplus = new JButton(add));
		pans.add(new Label("Cache-yeux"));
		pans.add(cach = new JLabel(""+stockcach));
		pans.add(cachplus = new JButton(add));
		pans.add(new Label("Repose-tete"));
		pans.add(repo = new JLabel(""+stockrepo));
		pans.add(repoplus = new JButton(add));
		pans.add(new Label("Sandwish"));
		pans.add(san = new JLabel(""+stocksan));
		pans.add(sanplus = new JButton(add));
		pans.add(new Label("Boisson"));
		pans.add(bois = new JLabel(""+stockbois));
		pans.add(boisplus = new JButton(add));
		orplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				stockor++;
				or.setText(""+stockor);
			}});
		cachplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				stockcach++;
				cach.setText(""+stockcach);
			}});
		repoplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				stockrepo++;
				repo.setText(""+stockrepo);
			}});
		sanplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				stocksan++;
				san.setText(""+stocksan);
			}});
		boisplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				stockbois++;
				bois.setText(""+stockbois);
			}});
		
		//listeAttPan
  		JPanel att = new JPanel(new BorderLayout());
  		att.setPreferredSize(new Dimension(300,80));
  	    att.setBorder(BorderFactory.createTitledBorder("Liste d'appels"));
  		att.add(app = new JLabel(""));
  		app.setBounds(3,3,300,50);
  		att.add(affpro = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT))));
  		att.add(affpro,BorderLayout.EAST);
  		affpro.setBackground(Color.WHITE);
  		affpro.setToolTipText("Afficher le Profil.");
  		affpro.setVisible(false);
  		JFrame frame = new JFrame();
  		final JDialog modelDialog = createDialog(frame);
  		affpro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				modelDialog.setVisible(true);
			
			}});
  		
  		JPanel callb = new JPanel();
  		callb.add(accept = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,20,Image.SCALE_DEFAULT))));
  		callb.add(dismiss = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(30,20,Image.SCALE_DEFAULT))));
  		att.add(callb,BorderLayout.EAST);
  		accept.setVisible(false);
  		dismiss.setVisible(false);
  		dismiss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				accept.setVisible(false);
		  		dismiss.setVisible(false);
				app.setText("Num�ro 14 - "+java.time.LocalTime.now());
	   			affpro.setVisible(true);
	   			
			}});
  		
		//workPanel
		JPanel panw = new JPanel(new GridLayout(2,4));
		panw.setPreferredSize(new Dimension(400,100));
		
		panw.setBorder(BorderFactory.createTitledBorder("Managment"));
		panw.setBackground(new Color(116, 127, 138));
		panw.add(new JLabel("Profil"));
		panw.add(new JLabel("iTems"));
		panw.add(new JLabel("Commandes"));
		panw.add(new JLabel("Messages"));
		panw.add(affpro);
		panw.add(i = new JLabel(""));
		i.setForeground(new Color(92,6,50));
		panw.add(cc = new JLabel(""));
		cc.setForeground(new Color(92,6,50));
		panw.add(ms =new JLabel(""));
		ms.setForeground(new Color(92,6,50));
		
		
		//contentPanel
		JPanel contenu = new JPanel();
		contenu.setBackground(Color.white);
		contenu.add(panw);
		contenu.add(pans);
		contenu.add(att);
		
		//iconPanel
		JPanel pani = new JPanel();
		pani.setBackground(Color.white);
		pani.setPreferredSize(new Dimension(230,400));
		JLabel icon = new JLabel(new ImageIcon("path/to/image"));
		pani.add(icon);
		
		
		//exitPanel
		JPanel exit = new JPanel(new BorderLayout());
		exit.setBackground(Color.white);
		JButton exitt;
		exitt = new JButton(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(40,30,Image.SCALE_DEFAULT)));
		exit.add(exitt,BorderLayout.WEST);
		exitt.setBorderPainted(false);
		exitt.setFocusable(false);
		exitt.setBackground(Color.white);
		exitt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				new Login();
				wfen.dispose();
			}});
		
		//BarPanel
		JPanel pan1 = new JPanel();
		 pan1.setBackground(Color.white);
		 JMenuBar mb = new JMenuBar();
		 mb.setBackground(Color.white);

		 horloge = new JLabel();
   
        horloge.setText(
          DateFormat.getDateTimeInstance().format(new Date())
        );
        horloge.setForeground(new Color(92, 6, 50));
        mb.add(horloge);
        t = new Timer(500, new ActionListener() {
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
        pan1.add(mb);

      
      		
        //sitsPanels
        JPanel sits = new JPanel(new GridLayout(5,1));
        sits.setBackground(Color.white);
        sits.setPreferredSize(new Dimension(130,370));
        sits.setBorder(BorderFactory.createTitledBorder("Alerts"));
        JPanel tete = new JPanel(new GridLayout(1,3));
        tete.add(new Label(""));
        tete.add(new JRadioButton("4"));
        tete.add(new Label(""));
        sits.add(tete);
        JPanel first = new JPanel(new GridLayout(1,3));
        first.add(new JRadioButton("34"));
        first.add(new JRadioButton("35"));
        first.add(new JRadioButton("36"));
        JPanel middle = new JPanel(new GridLayout(1,3));
        middle.add(new JRadioButton("24"));
        middle.add(new JRadioButton("25"));
        middle.add(new JRadioButton("26"));
        JPanel last = new JPanel(new GridLayout(1,3));
       
        last.add(sit = new JRadioButton("14"));
        last.add(new JRadioButton("15"));
        last.add(new JRadioButton("16"));
        
        JPanel queue = new JPanel(new GridLayout(1,3));
        sits.add(tete);
        sits.add(first);
        sits.add(middle);
        sits.add(last);
        sits.add(queue);

		
        
        
		wfen.getContentPane().add(pan1,BorderLayout.NORTH);
        wfen.getContentPane().add(exit,BorderLayout.SOUTH);
        wfen.getContentPane().add(sits,BorderLayout.EAST);
		wfen.getContentPane().add(pani,BorderLayout.WEST);
		wfen.getContentPane().add(contenu,BorderLayout.CENTER);
		wfen.setVisible(true);
	}
	
	private static JDialog createDialog(final JFrame frame){
		final JDialog modelDialog = new JDialog(frame, "User Profil", Dialog.ModalityType.DOCUMENT_MODAL);
		modelDialog.setBounds(132, 132, 400,600);
		Container dialogContainer = modelDialog.getContentPane();
		dialogContainer.setLayout(new BorderLayout());

		JPanel pan1 = new JPanel();
		pan1.add(new Label("Info USER"));
		
		JPanel panb = new JPanel();
		panb.add(new Button("Exit"));
		
		JPanel content = new JPanel(new GridLayout(0,1));
		
		JPanel pic = new JPanel(new GridLayout(1,0));
		pic.add(new Label("Class: Business"));
		pic.add(new JLabel(new ImageIcon(new ImageIcon("path/to/image").getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT))));
		pic.add(new Label("Num-si�ge: 14"));
		content.add(pic);
		
		JPanel info = new JPanel(new GridLayout(0,1));
		info.add(new Label("Benatallah"));
		info.add(new Label("Rayan Ibrahim"));
		info.add(new Label("rayanpicso@QATAR.com"));
		
		content.add(info);
		
		dialogContainer.add(pan1,BorderLayout.NORTH);
		dialogContainer.add(panb,BorderLayout.SOUTH);
		dialogContainer.add(content,BorderLayout.CENTER);
		return modelDialog;
	}
}

