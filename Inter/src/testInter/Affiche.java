package testInter;

import javax.swing.*;

/**
 * Created by Charly-Garma on 04/06/2014.
 */
public class Affiche {
    public  static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFenetre fenetre = new SimpleFenetre();
                fenetre.setVisible(true);
            }
        });



    }
}
