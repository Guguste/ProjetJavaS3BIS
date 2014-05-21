/**
 *  gestion d'un Media
 *  @version 1.0
 *  @author M Hakem
 */
  
public class Media implements Comparable 
{
	
	// VARIABLES MEMBRES 
	
	private String titre  ;
	private int numeroMedia  ; // identifie un media de façon unique
	
	
	// METHODES
		
	/**
	 *  constructeur vide
	 */
	public Media() 
	{
	}
	// fin constructeur 
	
	
	/**
	 *  initialise le Media courant avec titre (le numero sera attribue par Mediatheque)
	 */
	 public Media(String titre) 
	 {
	 	this.titre = new String(titre) ;
	 }
	// fin constructeur 
	
	
	/**
	 *  constructeur par copie
	 */
	 public Media(Media m) 
	 {
	 	this(m.titre) ;
	 }
	// fin constructeur 
	 public int hashCode(){
			return this.numeroMedia;
		 }

	// METHODES D'ACCES
	

	/**
	 *  retourne le numero identifiant le Media courant
	 */
	public int getNumeroMedia()
	{
		return this.numeroMedia ;
	}
	// fin methode getNumero
	
	
	/**
	 *  retourne le titre du Media courant
	 */
	public String getTitre()
	{
		return this.titre ;
	}
	// fin methode getTitre
	
	
	/**
	 *  num devient le numero du Media courant
	 */
	public void setNumeroMedia(int num)
	{
		this.numeroMedia = num ;
	}
	// fin methode setNumeroMedia	
		
		
	
	// METHODES UTILITAIRES
	

	/**
	 *  initialise interactivement le Media courant (uniquement le titre)
	 */
	public void init() 
	{
		this.titre = Lire.jString("titre ?") ;
	}
	// fin methode init


	/**
	 *  retourne la chaine de caracteres representant le Media courant (titre et numero)
	 */
	public String toString() 
	{
		return("numero = " + this.numeroMedia + " titre = " + this.titre +  " ") ;
	}
	// fin methode toString
	
	
	/**
	 *  retourne true si le Media o a meme titre que le Media courant
	 */
	public boolean equals(Object o)
	{
		if (o == null) 
		   return false ;
										// getClass() retourne la classe la plus
										// specifique de l'instance referencee.
										// Garantit que les 2 objets compare
										// sont strictement de la meme classe.
		if (this.getClass() != o.getClass()) 
		   return false ;
		   	
		return(this.titre.equals(((Media) o).titre)) ;
	}
	// fin methode equals 

	
	/**
	 *  cree un Media (au choix Livre, CdAudio ou Media), l'initialise 
	 *  interactivement et le retourne
	 *	 
	 */
    public static Media saisirMedia()
	{
			Media m ;
			
		    	System.out.println("\nQuel media voulez-vous creer : ") ;
			System.out.println("1 - un cd audio  ?") ;
			System.out.println("2 - un livre ?" ) ;
			System.out.println("3 - un media indetermine ? \n" ) ;
			
			int rep ;
			do
			{
				rep = Lire.jint("votre reponse (1, 2, 3) ? ") ;
			}
			while (rep != 1 && rep != 2 && rep != 3) ;
			
			System.out.println() ;
			
			switch(rep)
			{
				case 1  : m = new CdAudio()  ; break ;
				case 2  : m = new Livre()    ; break ;
				default : m = new Media()    ;
			}
		
			m.init() ;              // init( ) est polymorphme
			
			return m ;
	}
	// fin methode saisirMedia 
    
    //methode de comparaison pour le trie 
    
    

	@Override
	public int compareTo(Object obj) {
		
		Media m = (Media) obj;
		
		int BEFORE = -1;
		int EQUALS = 0;
		int AFTER = 1;
		int ERR = -2;
		
		if(this.getNumeroMedia() < m.getNumeroMedia()){return BEFORE;}
			else if(this.getNumeroMedia() == m.getNumeroMedia()){ return EQUALS;}
				else if(this.getNumeroMedia() > m.getNumeroMedia()){ return AFTER;}
					else{
						return ERR;
					}
		
		
	}
	
    
    
    
    
    
    
    
    
    
    
    
}
// fin classe Media
