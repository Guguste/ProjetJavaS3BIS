
/**
 *  gestion d'un CdAudio
 *  @version 1.0
 *  @author M Hakem
 */
  
public class CdAudio extends Media
{
	
	// VARIABLES MEMBRES 
	
	private int duree ;

	
	// METHODES
		
	/**
	 *  constructeur vide
	 */
	public CdAudio() 
	{
		super() ;
	}
	// fin constructeur 
	
	
	/**
	 *  initialise le CdAudio courant avec le titre et la duree (pas de numero)
	 */
	 public CdAudio(String unTitre, int uneDuree)
	 {
	 	super(unTitre) ;
	 	this.duree = uneDuree ;
	 }
	// fin constructeur 
	
	
	/**
	 *  constructeur par copie (ne copie pas le numero du CdAudio)
	 */
	 public CdAudio(CdAudio d) 
	 {
	 	super(d) ;
	 	this.duree =  d.duree ;
	 }
	// fin constructeur 
	

	// METHODES D'ACCES
	
	/**
	 *  retourne la duree du CdAudio courant
	 */
	public int getDuree()
	{
		return this.duree ;
	}
	// fin methode getDuree
	
	
	// METHODES UTILITAIRES
	

	/**
	 *  initialise interactivement le CdAudio courant (pas le numero)
	 */
	public void init() 
	{
		super.init() ;
		this.duree = Lire.jint("duree ? ") ;
	}
	// fin methode init


	/**
	 *  retourne la chaine de caracteres representant du CdAudio courant
	 */
	public String toString() 
	{
		return(super.toString() + " cd audio d'une duree de " +  
		       this.duree + " minutes \n") ;
	}
	// fin methode toString
	
	
	/**
	 *  retourne true si le CdAudio o a les memes caracteristiques que le 
	 *  CdAudio courant
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
               this.duree == ((CdAudio) o).duree
              ) ;
	}
	// fin methode equals
	
}
// fin classe CdAudio
