import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;


public class InterfacePrincipale extends JPanel{
	
	public InterfacePrincipale(){

		this.setBackground(Color.DARK_GRAY);
		
		PanelOption pOption = new PanelOption();
		
		PanelMedia pMedia = new PanelMedia();
		
		PanelCd pCd = new PanelCd();
		
		PanelLivre pLivre = new PanelLivre();
		
		
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
		
		c.fill=GridBagConstraints.BOTH;
		
		//definittion de la marge entre les composants
		c.insets = new Insets(5, 5, 5, 5);
		
		// ipady permet de savoir où on place le composant s'il n'occupe pas la totalité de l'espace disponnible 
		c.ipady=c.anchor = GridBagConstraints.CENTER;
		
		/* weightx définit le nombre de cases en abscisse */
		c.weightx=1;
		
		/* weightx définit le nombre de cases en ordonnée */
		c.weighty=1;
		
		c.gridx=0; c.gridy=0;
		this.add(pOption,c);
		
		c.gridx=0; c.gridy=1;
		this.add(pCd,c);
		
		c.gridx=1; c.gridy=0;
		this.add(pMedia,c);
		
		c.gridx=1; c.gridy=1;
		this.add(pLivre,c);
	}

}
