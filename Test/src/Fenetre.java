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
		pan.setBackground(Color.BLUE);
		pan.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		pan.add(b1 = new JButton("SAVE"));
		pan.add(b2 = new JButton("Nouveau Media"));
		pan.add(b3 = new JButton("Nouveau Livre"));
		pan.add(b4 = new JButton("Nouveau CD"));
		
		Container contenu = getContentPane();
		contenu.add(pan, BorderLayout.WEST);
		
		this.setVisible(true);	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
