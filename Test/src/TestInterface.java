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
	//cr�ation de 3 panneaux fictif
		
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
			
			//Le gridBagConstraints va d�finir la position et la taille des �l�ments
			GridBagConstraints c = new GridBagConstraints();
			
			/*
			    le parametre fill sert � d�finir comment le composant sera rempli
				GridBagConstraints.BOTH permet d'occuper tout l'espace disponible horizontalement et verticalement
				GridBagConstraints.HORIZONTAL maximise horizontalement
				GridBagConstraints.VERTICAL maximise verticalement 
			 */
			
			c.fill=GridBagConstraints.BOTH;//on choisit donc de remplir au max horizontalement et verticalement 
			
			
			//insets d�finir la marge entre les composant ex: new Insets(margeSup�rieure, margeGauche, margeInf�rieur, margeDroite)
			
			c.insets = new Insets(5, 5, 5, 5);
			
			// ipady permet de savoir o� on place le composant s'il n'occupe pas la totalit� de l'espace disponnible 
			
			c.ipady=c.anchor = GridBagConstraints.CENTER;
			
			/* weightx d�finit le nombre de cases en abscisse */
			c.weightx=3;
			
			/* weightx d�finit le nombre de cases en ordonn�e */
			c.weighty=3;
			
			// pour dire qu'on ajoute un composant en position (i, j), on d�finit gridx=i et gridy=j 
			
			c.gridx=0;
			c.gridy=0;
			
			// On ajoute le composant au panel en pr�cisant le GridBagConstraints*/ panel.add(new JButton("0,0"), c);
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
			
			//On peut d�finit un composant qui prend plusieurs cases � l'aide de gridwidth et gridheight
			c.gridwidth=2;
			c.gridheight=2;
			c.gridx=1;
			c.gridy=1;
			this.add(new JButton("BOB"),c);
			
			
	}
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
