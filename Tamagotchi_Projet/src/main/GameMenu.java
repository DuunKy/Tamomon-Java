package main;

import action.Combat.Combat;
import data.ColorBase;
import data.Texte;

import static action.Action.*;
import static save.Save.saveGame;
import static utilitaires.Utilitaires.quit;
import static utilitaires.Utilitaires.returnUnChiffre;

public class GameMenu {
    public static void gameMenu() {
        System.out.println(Texte.GAMEMENU);

        int choix = returnUnChiffre();

        System.out.println(ColorBase.RED + Texte.SEPARATOR);
        switch (choix) {
            case 1:
                nourrir();
                break;
            case 2:
                sortir();
                break;
            case 3:
                laver();
                break;
            case 4:
                caresser();
                break;
            case 5:
                new Combat().combat();
            case 6:
                new Combat().pvp();
            case 7:
                saveGame();
                gameMenu();
                break;
            case 8:
                quit();
                break;
            default:
                System.out.println(ColorBase.YELLOW + Texte.PASOUF + ColorBase.RED);
                break;
        }
    }


}
