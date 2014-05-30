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
		
		TestInterface t = new TestInterface();
		
		this.add(t);
		
		//rend le tout visible
		this.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
 
}
