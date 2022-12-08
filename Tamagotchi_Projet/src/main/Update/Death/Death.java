package main.Update.Death;

import data.ColorBase;
import data.Data;
import data.Texte;
import model.Personnage;

import static main.Update.Death.DeathMenu.deathMenu;
import static model.Personnage.getEnergy;
import static model.Personnage.setEnergy;
import static utilitaires.Utilitaires.clearScreen;

public class Death {
    public static void death(String cause) {
        clearScreen();
        switch (cause) {
            case Data.DEATH_JOIE:
                System.out.println(ColorBase.RED + ColorBase.BOLD + Texte.DEATH_JOIE);
                break;
            case Data.DEATH_FAIM:
                System.out.println(ColorBase.RED + ColorBase.BOLD + Texte.DEATH_FAIM);
                break;
            case Data.DEATH_FATIGUE:
                System.out.println(ColorBase.RED + ColorBase.BOLD + Texte.DEATH_FATIGUE);
                break;
            case Data.DEATH_PROPRETE:
                System.out.println(ColorBase.RED + ColorBase.BOLD + Texte.DEATH_PROPRETE);
                break;
            default:
                System.out.println(ColorBase.RED + ColorBase.BOLD + Texte.DEATH_DEFAULT);
                break;
        }
        System.out.println(ColorBase.RESET);
        deathMenu(cause);
    }

    public static void canDeath() {
        if (Personnage.getJoie() <= 0) {
            death(Data.DEATH_JOIE);
        }
        if (Personnage.getFaim() >= 10) {
            death(Data.DEATH_FAIM);
        }
        if (Personnage.getFatigue() >= 10) {
            death(Data.DEATH_FATIGUE);
        }
        if (Personnage.getProprete() <= 0) {
            death(Data.DEATH_PROPRETE);
        }
    }

    public static void revive(String cause) {
        setEnergy(getEnergy() - 7);
        switch (cause) {
            case Data.DEATH_JOIE:
                Personnage.setJoie(1);
                break;
            case Data.DEATH_FAIM:
                Personnage.setFaim(9);
                break;
            case Data.DEATH_FATIGUE:
                Personnage.setFatigue(9);
                break;
            case Data.DEATH_PROPRETE:
                Personnage.setProprete(1);
                break;
        }
    }
}
