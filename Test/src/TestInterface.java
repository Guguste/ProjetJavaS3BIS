/*
 * source : codes-sources.commentcamarche.net/source/54344-exemple-d-utilisation-du-gridbaglayout
 */

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;


public class TestInterface extends JPanel{
	
	public TestInterface(){
	//création de 3 panneaux fictif
		
			JPanel p1 = new JPanel();
			p1.setBackground(Color.BLUE);
			JPanel p2 = new JPanel();
			p2.setBackground(Color.RED);
			JPanel p3 = new JPanel();
			p3.setBackground(Color.GREEN);
			JPanel p4 = new JPanel();
			p4.setBackground(Color.PINK);
			JPanel p5 = new JPanel();
			p5.setBackground(Color.BLACK);
			
			//on set le type de layout
			this.setLayout(new GridBagLayout());
			
			//Le gridBagConstraints va définir la position et la taille des éléments
			GridBagConstraints c = new GridBagConstraints();
			
			/*
			    le parametre fill sert à définir comment le composant sera rempli
				GridBagConstraints.BOTH permet d'occuper tout l'espace disponible horizontalement et verticalement
				GridBagConstraints.HORIZONTAL maximise horizontalement
				GridBagConstraints.VERTICAL maximise verticalement 
			 */
			
			c.fill=GridBagConstraints.BOTH;//on choisit donc de remplir au max horizontalement et verticalement 
			
			
			//insets définir la marge entre les composant ex: new Insets(margeSupérieure, margeGauche, margeInférieur, margeDroite)
			
			c.insets = new Insets(5, 5, 5, 5);
			
			// ipady permet de savoir où on place le composant s'il n'occupe pas la totalité de l'espace disponnible 
			
			c.ipady=c.anchor = GridBagConstraints.CENTER;
			
			/* weightx définit le nombre de cases en abscisse */
			c.weightx=3;
			
			/* weightx définit le nombre de cases en ordonnée */
			c.weighty=3;
			
			// pour dire qu'on ajoute un composant en position (i, j), on définit gridx=i et gridy=j 
			
			c.gridx=0;
			c.gridy=0;
			
			// On ajoute le composant au panel en précisant le GridBagConstraints*/ panel.add(new JButton("0,0"), c);
			this.add(p1,c);
			
			c.gridx = 1;
			c.gridy = 0;
			this.add(p2,c);
			
			c.gridx = 2;
			c.gridy = 0;
			this.add(p3,c);
			
			c.gridx=0;
			c.gridy=1;
			this.add(p4,c);
			
			c.gridx=0;
			c.gridy=2;
			this.add(p5,c);
			
			//On peut définit un composant qui prend plusieurs cases à l'aide de gridwidth et gridheight
			c.gridwidth=2;
			c.gridheight=2;
			c.gridx=1;
			c.gridy=1;
			this.add(new JButton("BOB"),c);
			
			
	}
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
