import javax.swing.JFrame;


//class fenetre 
public class Fenetre extends JFrame {

	// info sur la fenetre
	private int x=900;
	private int y=600;
	
	private String titre="Projet Java S3 bis MASSON MEYER";
	
	//contenu de la fenetre
	
	InterfacePrincipale i1 = new InterfacePrincipale();
	
	//constructeur==============================================================
	
	public Fenetre(){
		this.setTitle(titre);
		this.setSize(x, y);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		
		this.add(i1);
		
		this.setVisible(true);
	}
	
	
	
}
