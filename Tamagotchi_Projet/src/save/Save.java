package save;

import data.Texte;
import model.Personnage;

import java.io.File;
import java.util.ArrayList;

import static main.Game.game;
import static main.Lancement.setOnGame;
import static utilitaires.FileManage.*;
import static utilitaires.Utilitaires.returnPersoFromSaveArray;

public class Save {

    public static Personnage menuSauvegarde() {
        if (fileExist(Texte.SAVEPATH)) {
            File save = openFile(Texte.SAVEPATH);
            ArrayList<String> SaveArray = readFile(save);
            Personnage perso = returnPersoFromSaveArray(SaveArray);
            if (main.Lancement.getPerso() != null) {
                System.out.println(Texte.SAVETAMAFOUND);
                setOnGame(true);
                game();
            } else {
                System.out.println(Texte.SAVETAMANOTFOUND);
            }
            return perso;
        } else {
            System.out.println(Texte.SAVETAMANOTFOUND);
            return null;
        }
    }

}
