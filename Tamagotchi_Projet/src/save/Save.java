package save;

import data.Texte;
import model.Personnage;

import java.io.File;
import java.util.ArrayList;

import static utilitaires.FileManage.*;
import static utilitaires.Utilitaires.returnPersoFromSaveArray;

public class Save {

    public static Personnage menuSauvegarde() {
        if (fileExist(Texte.SAVEPATH)) {
            File save = openFile(Texte.SAVEPATH);
            ArrayList<String> SaveArray = readFile(save);
            Personnage perso = returnPersoFromSaveArray(SaveArray);
            if (perso != null) {
                System.out.println(Texte.SAVETAMAFOUND);
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
