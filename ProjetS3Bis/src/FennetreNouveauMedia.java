import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FennetreNouveauMedia extends JFrame{
	
	private JPanel container = new JPanel();
	private JTextField jtfMedia = new JTextField();
	private JLabel labelMedia = new JLabel("Le nom de votre media:");
	
	public FennetreNouveauMedia(){
		this.setTitle("Ajout d'un nouveau Média");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    
	    JPanel top = new JPanel();
	    
	    Font police = new Font("Arial",Font.BOLD, 14);
	    
	    jtfMedia.setFont(police);
	    jtfMedia.setPreferredSize(new Dimension(150, 30));
	    jtfMedia.setForeground(Color.BLUE);
	    
	    top.add(labelMedia);
	    top.add(jtfMedia);
	    container.add(top, BorderLayout.CENTER);
	    this.setContentPane(container);
	    this.setVisible(true);
	   
	    
	    this.setVisible(true);
	    
	}
}
