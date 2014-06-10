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


public class FenetreNouveauCD extends JFrame{
	
	private JPanel container = new JPanel();
	private JLabel jlb1 = new JLabel("Le titre du CD");
	private JLabel jlb2 = new JLabel("La durée du CD (int)");
	private JTextField jtfCD = new JTextField();
	private JFormattedTextField jtfDuree = new JFormattedTextField(NumberFormat.getIntegerInstance());
	
	public FenetreNouveauCD(){
		
		this.setTitle("Ajout d'un nouveau CD");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    
	    JPanel center = new JPanel();
	    
	    Font police = new Font("Arial", Font.BOLD,14);
	    
	    jtfCD.setFont(police);
	    jtfCD.setPreferredSize(new Dimension(150,30));
	    jtfCD.setForeground(Color.black);
	    
	    jtfDuree.setFont(police);
	    jtfDuree.setPreferredSize(new Dimension(150,30));
	    jtfDuree.setForeground(Color.blue);
	    
	    center.add(jlb1); center.add(jtfCD);
	    center.add(jlb2); center.add(jtfDuree);
	    
	    this.setContentPane(center);
	    this.setVisible(true);
	    
	    
	}
	
}
