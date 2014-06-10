import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelMedia extends JPanel{
	
	Color mycolor = Color.decode("#1D7373");
	JButton btnNvMedia = new JButton("Nv Media");
	JButton btnAffiche = new JButton("Affiche Media");
	


	public PanelMedia(){
		
		this.setBackground(mycolor);
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill=GridBagConstraints.BOTH;
		c.insets = new Insets(25, 25, 25, 25);
		
		c.weightx=2; c.weighty=4;
		
		c.gridx=1; c.gridy=1;
		this.add(btnNvMedia,c);
		
		c.gridy=3;
		this.add(btnAffiche,c);
		
		
	}
}
