import javax.swing.JFrame;

public class Fenetre extends JFrame{

	private String titre;
	
	private int x;
	
	private int y;
	
	public Fenetre(){
		this.titre="test interface";
		this.x=1600;
		this.y=900;
		this.setTitle(titre);
		this.setSize(x, y);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		this.setVisible(true);
	}
}
