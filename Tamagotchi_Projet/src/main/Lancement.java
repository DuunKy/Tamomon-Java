package main;

import data.Data;
import data.Texte;
import model.Personnage;
import utilitaires.Utilitaires;


import static main.Game.game;
import static main.MenuPrincipal.choixDeMenu;
import static main.MenuPrincipal.menuPrincipal;
import static model.Creation.menuCreation;
import static save.Save.menuSauvegarde;

public class Lancement {

    //Varaible OnGame
    public static boolean isOnGame() {
        return OnGame;
    }

    public static void setOnGame(boolean g) {
        OnGame = g;
    }

    private static boolean OnGame;

    // Base Variables Init
    static Data data;
    static Personnage perso;

    public static Personnage getPerso() {
        return perso;
    }

    public Lancement() {
        data = new Data();
        perso = new Personnage(10,0,10,0,0,10,0, "none", "none");
    }

    // Start the game:
    public void lancement(){
        do{
            if (isOnGame()) {
                game();
            } else {
                int choixMenuPrincipal = menuPrincipal();
                choixDeMenu(choixMenuPrincipal);
            }

        }while (data.isProgramRun());
    }

}
