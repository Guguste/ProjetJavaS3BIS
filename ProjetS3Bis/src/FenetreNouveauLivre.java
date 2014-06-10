import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FenetreNouveauLivre extends JFrame{
	
	private JPanel container = new JPanel();
	private JLabel jlb1 = new JLabel("Le titre du CD");
	private JLabel jlb2 = new JLabel("La durée du CD (int)");
	private JTextField jtfLivre = new JTextField();
	private JFormattedTextField jtfPages = new JFormattedTextField(NumberFormat.getIntegerInstance());
	
	public FenetreNouveauLivre(){
		
		this.setTitle("Ajout d'un nouveau CD");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    
	    JPanel center = new JPanel();
	    
	    Font police = new Font("Arial", Font.BOLD,14);
	    
	    jtfLivre.setFont(police);
	    jtfLivre.setPreferredSize(new Dimension(150,30));
	    jtfLivre.setForeground(Color.black);
	    
	    jtfPages.setFont(police);
	    jtfPages.setPreferredSize(new Dimension(150,30));
	    jtfPages.setForeground(Color.blue);
	    
	    center.add(jlb1); center.add(jtfLivre);
	    center.add(jlb2); center.add(jtfPages);
	    
	    this.setContentPane(center);
	    this.setVisible(true);
	    
	    
	}

}
