import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelOption extends JPanel{

	//bouton pour l'interface
	JButton btnSave = new JButton("Save");
	JButton btnLoad = new JButton("Load");
	JButton btnReset = new JButton("Reset");
	JButton btnOptin = new JButton("Option");
	Color mycolor = Color.decode("#1D7373");
		
	
	public PanelOption(){
		this.setBackground(mycolor);
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill=GridBagConstraints.BOTH;
		c.insets = new Insets(25, 25, 25, 25);
		
		c.weightx=1; c.weighty=1;
		
		c.gridx=0; c.gridy=0;
		this.add(btnSave,c);
		
		c.gridx=0; c.gridy=1;
		this.add(btnLoad,c);
		
		c.gridx=1; c.gridy=0;
		this.add(btnReset,c);
		
		c.gridx=1; c.gridy=1;
		this.add(btnOptin,c);
	}
	
}
