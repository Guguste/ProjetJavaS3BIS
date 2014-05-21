import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;


	/**
	 * @version 1.0
	 * @author Auguste
	 */
public class MediathequeL {
	
	private String nomMediatheque;
	
	private ArrayList<Media> Medias;
	
	
    private int prochainNumero; // - indice ou placer le prochain Media
   
 // CONSTRUCTEUR =============================================================
//question 2)
/**
*  initialise la Mediatheque courante 
*/
public MediathequeL(String unNom)
{
this.nomMediatheque  = new String(unNom)     ;
this.Medias          = new ArrayList<Media>();
this.prochainNumero  =  1 ;
}
    

//METHODES D'ACCES =========================================================


	/**
	 *  retourne le nom de la Mediatheque courantew
	 */
	public String getNomMediatheque()
	{
		return this.nomMediatheque ;
	}



//METHODE INDICEMEDIA QUESTION 3)==============================

/**
*	retourne indice dans liste medias du media de numero num ou -1 si aucun media ne possede ce num
*/
	public int getIndiceMedia(int num){
		
		int n = this.Medias.size();
		
		int i = 0;
		
		while(i<n && ((Media)this.Medias.get(i)).getNumeroMedia() != num){
			i++;
		}
		
		if(i<n){
			return i;
		}
		else{
			return -1;
		}
	}
	
//METHODE GETMEDIA QUESTION 4)=====================================================
	
	/**
	 * retourne média ref par m à la Media courante créer et délégué une exe de type exce avec message explicite
	 * 
	 * on vérifie si le média existe, si non exception sinon on retourne le media a l'indice getIndiceMedia
	 */
	
	public Media getMedia(int num)throws Exception{
		if(this.getIndiceMedia(num) == -1){                      
			throw new Exception("Media de numéro:"+ num +" est inéxistant.");
		}
		
		return this.Medias.get(this.getIndiceMedia(num));
	}
	
//METHODE RETIRERMEDIA QUESTION 5) =================================================
	
	public void retirerMedia(int num)throws Exception{
		int ind = this.getIndiceMedia(num);
		
		if(ind == -1){                      
			throw new Exception("Media de numéro:"+ num +" est inéxistant.");
		}
		
		this.Medias.remove(ind);
	}
	
//METHODE AJOUTERMEDIA QUESTION 6)===============================================================================
	
	public void ajouterMedia(Media m) throws MediaDejaPresent{
		
				if(this.Medias.indexOf((Media)m) != -1){
					throw new MediaDejaPresent("Media déja présent ", m);
				}
		m.setNumeroMedia(this.prochainNumero);
			this.prochainNumero++;
		 this.Medias.add((Media)m);
	}
	
	
//METHODE TOSTRING ===============================================================================================
	
	public String toString(){
		String chaine ="La Mediatheque de nom "+ this.getNomMediatheque() +" a pour Media \n";
		int n = Medias.size();
		int i=0;
		while(i<n){
			chaine = chaine + this.Medias.get(i) + "\n";
			i++;
		}
		
		return chaine;
	}
	
//fonction de trie========================================================================================================	
	
	public void trieListe(){
		
			Collections.sort(Medias);
		
	}
	
	
	
	
	
	
	
}