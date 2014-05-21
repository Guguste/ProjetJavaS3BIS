
public class StartMediathequeL {

	public static void main(String[] args) {
		
		MediathequeL ml = new MediathequeL("test");
		
		Media m1, m2;
		m1= new Media();
		m2= new Media();
		m1.init();
		m2.init();
		try{
		ml.ajouterMedia(m1);
		ml.ajouterMedia(m2);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		m1.setNumeroMedia(72);
		
		System.out.println(ml);
		
		System.out.println("\n");
		
		ml.trieListe();
		
		System.out.println(ml);
		
		System.out.println("\n==========FIN==========\n");
	}

}
