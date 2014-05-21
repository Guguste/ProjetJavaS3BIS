
/**
 *  gestion d'un Livre
 *  @version 1.0
 *  @author M hakem
 */
  
public class Livre extends Media
{
	
	// VARIABLES MEMBRES 
	
	private int nbPages ;

	
	// METHODES
		
	/**
	 *  constructeur vide
	 */
	public Livre() 
	{
		super() ;
	}
	// fin constructeur 
	
	
	/**
	 *  initialise Le livre courant avec titre et nbPages (pas de numero)
	 */
	 public Livre(String unTitre, int unNombrePages)
	 {
	 	super(unTitre) ;
	 	this.nbPages = unNombrePages ;
	 }
	// fin constructeur 
	
	
	/**
	 *  constructeur par copie (ne copie pas le numero du Livre)
	 */
	 public Livre(Livre l) 
	 {
	 	super(l) ;
	 	this.nbPages = l.nbPages ;
	 }
	// fin constructeur 
	

	// METHODES D'ACCES
	
	/**
	 *  retourne le nombre de pages du Livre courant
	 */
	public int getNbPages()
	{
		return this.nbPages ;
	}
	// fin methode getNbPages
	
	
	// METHODES UTILITAIRES
	

	/**
	 *  initialise interactivement le Livre courant (pas le numero)
	 */
	public void init() 
	{
		super.init() ;
		this.nbPages = Lire.jint("nombre de pages ? ") ;
	}
	// fin methode init


	/**
	 *  retourne la chaine de caracteres representant le Livre courant
	 */
	public String toString() 
	{
		return(super.toString() + "livre contenant " + this.nbPages + 
		       " pages \n") ;
	}
	// fin methode toString
	
	
	/**
	 *  retourne true si le Livre o a les memes caracteristiques 
	 *  que le Livre courant
	 */
	public boolean equals(Object o)
	{
		  					    // la methode equals de Media
								// verifie que o != null et
								// que this et o designent
								// des objets strictement
								// du meme type
	   	   
		return (
			super.equals(o) &&
		        this.nbPages == ((Livre)o).nbPages
			) ;
	}
	// fin methode equals
	
}
// fin classe Livre
