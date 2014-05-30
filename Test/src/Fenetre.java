import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Fenetre extends JFrame implements ActionListener{
	
	private String titre;
	private int x;
	private int y;
	
	private JButton b1, b2, b3, b4;
	
	private JPanel pan;
	
	public Fenetre(){
		//construction de la fenetre
		this.titre="test interface";
		this.x=1600;
		this.y=900;
		this.setTitle(titre);
		this.setSize(x, y);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		
		//création de 3 panneaux fictif
		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLUE);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.RED);
		JPanel p3 = new JPanel();
		p3.setBackground(Color.GREEN);
		JPanel p4 = new JPanel();
		p3.setBackground(Color.PINK);
		
		//declaration du panel qui contenir le tout
		JPanel pano = new JPanel(new GridBagLayout());
		
		//déclaration du GridBagLayout
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx=0;
		
		gbc.gridwidth = 2;
		gbc.gridy = 0;
		gbc.gridheight = 2;
		pano.add(p1, gbc);
		 
		gbc.gridx = 0;
		gbc.gridwidth = 1;
		gbc.gridy = 2;
		gbc.gridheight = 2;
		pano.add(p2, gbc);
		 
		gbc.gridx = 1;
		gbc.gridwidth = 1;
		gbc.gridy = 2;
		gbc.gridheight = 2;
		pano.add(p3, gbc);
		 
		gbc.gridx = 2;
		gbc.gridwidth = 1;
		gbc.gridy = 0;
		gbc.gridheight = 4;
		pano.add(p4, gbc);
		
		setContentPane(pano);
		
		
		//rend le tout visible
		this.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
 
}
