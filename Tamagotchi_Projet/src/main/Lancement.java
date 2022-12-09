package main;

import data.Data;
import model.Personnage;
import  utilitaires.Utilitaires;

import static main.Game.game;
import static main.MenuPrincipal.choixDeMenu;
import static main.MenuPrincipal.menuPrincipal;

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
    public static Data data;
    public static Personnage perso;

    public static Personnage getPerso() {
        return perso;
    }

    public Lancement() {
        data = new Data();
        perso = new Personnage(10,0,10,0,0,10,0, "none", "none");
    }

    public static void init() {
        data = new Data();
        perso = new Personnage(10,0,10,0,0,10,0, "none", "none");
    }

    // Start the game:
    public static void lancement(){
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
