/**
 *  gestion d'une exception ExceptionDejaPresent
 *  @version 1.0
 *  @author M Hakem
 */
  
public class MediaDejaPresent extends Exception
{
	
	// VARIABLES MEMBRES 
	
	private Media m ;
	
	
	// METHODES
		

	/**
	 *  initialise l'exception MediaDejaPresent courante
	 */
	 public MediaDejaPresent(String message, Media unMedia) 
	 {
	 	super(message)     ;
	 	this.m = unMedia ;
	 }
	// fin constructeur 
	

	// METHODES D'ACCES
	

	/**
	 *  retourne le media deja present
	 */
	public Media getMedia()
	{
		return this.m ;
	}
	// fin methode getMedia
	
	
	
	// METHODES UTILITAIRES
	
	
	/**
	 *  retourne la chaine de caracteres representant l'exception courante
	 */
	public String toString() 
	{
		return(super.toString() + " : " + this.m) ;
	}
	// fin methode toString
	
}
// fin classe Media
