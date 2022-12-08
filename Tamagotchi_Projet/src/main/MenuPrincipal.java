package main;

import data.Texte;
import utilitaires.Utilitaires;

import static main.Game.game;
import static main.Lancement.*;
import static model.Creation.menuCreation;
import static save.Save.menuSauvegarde;
import static utilitaires.Utilitaires.quit;

public class MenuPrincipal {

    public static int menuPrincipal() {
        System.out.println(Texte.MENUPRINCIPAL);
        return Utilitaires.returnUnChiffre();
    }

    public static void choixDeMenu(int index) {
        data.setSousMenuOn(true);
        switch (index) {
            case 1:
                menuCreation(data, perso);
                break;
            case 2:
                menuSauvegarde();
                break;
            case 3:
                quit();
                break;
            default:
                System.out.println(Texte.ERREUR);
                setOnGame(false);
                break;
        }
    }
}


