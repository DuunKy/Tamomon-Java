package save;

import data.ColorBase;
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
        String absolute = null;
        try {
            File save = new File("save.txt");

            absolute = save.getAbsolutePath();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        if (fileExist(absolute)) {
            File save = openFile(absolute);
            ArrayList<String> SaveArray = readFile(save);
            Personnage perso = arrayToPerso(SaveArray);
            if (main.Lancement.getPerso() != null) {
                System.out.println(ColorBase.GREEN + Texte.SAVETAMAFOUND + ColorBase.RESET);
                setOnGame(true);
                game();
            } else {
                System.out.println(ColorBase.RED + Texte.SAVETAMANOTFOUND + ColorBase.RESET);
                setOnGame(false);
            }
            return perso;
        } else {
            System.out.println(ColorBase.RED + Texte.SAVETAMANOTFOUND + ColorBase.RESET);
            setOnGame(false);
            return null;
        }
    }

    public static void saveGame() {

        ArrayList<String> parameters = persoToArray();
        String absolute = null;
        try {
            File save = new File("save.txt");

            absolute = save.getAbsolutePath();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        File saveFile = openFile(absolute);
        writeInFile(saveFile, parameters);


    }

}
