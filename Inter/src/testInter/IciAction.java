package testInter;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Charly-Garma on 04/06/2014.
 */
public class IciAction extends AbstractAction{
    private SimpleFenetre fenetre;
    public IciAction(SimpleFenetre fenetre, String texte){
        super(texte);

        this.fenetre = fenetre;
    }

    public void actionPerformed(ActionEvent e){
        //action appliquee au bouton
        System.out.println("clic");
    }
}
