package main.Update.Death;

import data.ColorBase;
import data.Texte;
import main.Lancement;
import model.Personnage;

import static main.Lancement.setOnGame;
import static main.Update.Death.Death.death;
import static main.Update.Death.Death.revive;
import static utilitaires.Utilitaires.quit;
import static utilitaires.Utilitaires.returnUnChiffre;

public class DeathMenu {
    public static void deathMenu(String cause) {
        System.out.println(ColorBase.BLUE + ColorBase.UNDERLINE + ColorBase.BOLD + Texte.DEATH_MENU + ColorBase.RESET);
        System.out.println(ColorBase.GREEN + Texte.DEATH_CHOICE_1 + Personnage.getEnergy() + Texte.DEATH_CHOICE_2 + ColorBase.RESET);

        int choix = returnUnChiffre();
        switch (choix) {
            case 1:
                if (Personnage.getEnergy() >= 7) {
                    revive(cause);
                } else {
                    System.out.println(ColorBase.RED + Texte.NOT_ENOUGHT_ENERGY + ColorBase.RESET);
                    deathMenu(cause);
                }
                break;
            case 2:
                setOnGame(false);
                Lancement.lancement();
            case 3:
                quit();
                deathMenu(cause);
                break;
            default:
                deathMenu(cause);
                break;
        }
    }
}
