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
		this.titre="test interface";
		this.x=1600;
		this.y=900;
		this.setTitle(titre);
		this.setSize(x, y);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		
		
		pan = new JPanel();
		pan.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		pan.add(b1 = new JButton("b1"));
		pan.add(b2 = new JButton("b2"));
		pan.add(b3 = new JButton("b3"));
		pan.add(b4 = new JButton("b4"));
		
		Container contenu = getContentPane();
		contenu.add(pan, BorderLayout.WEST);
		
		this.setVisible(true);	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
