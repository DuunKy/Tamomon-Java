package save;

import data.Texte;
import model.Personnage;

import java.io.File;
import java.util.ArrayList;

import static main.Game.game;
import static main.Lancement.setOnGame;
import static utilitaires.FileManage.*;
import static utilitaires.Utilitaires.arrayToPerso;
import static utilitaires.Utilitaires.persoToArray;

public class Save {

    public static Personnage menuSauvegarde() {
        if (fileExist(Texte.SAVEPATH)) {
            File save = openFile(Texte.SAVEPATH);
            ArrayList<String> SaveArray = readFile(save);
            Personnage perso = arrayToPerso(SaveArray);
            if (main.Lancement.getPerso() != null) {
                System.out.println(Texte.SAVETAMAFOUND);
                setOnGame(true);
                game();
            } else {
                System.out.println(Texte.SAVETAMANOTFOUND);
                setOnGame(false);
            }
            return perso;
        } else {
            System.out.println(Texte.SAVETAMANOTFOUND);
            setOnGame(false);
            return null;
        }
    }

    public static void saveGame() {

        ArrayList<String> parameters = persoToArray();

        File saveFile = openFile(Texte.SAVEPATH);
        writeInFile(saveFile, parameters);


    }

}
