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
    static Data data;
    static Personnage perso;
    public Personnage ennemy1,ennemy2,ennemy3,ennemy4,ennemy5;

    public static Personnage getPerso() {
        return perso;
    }

    public Lancement() {
        data = new Data();
        perso = new Personnage(10,0,10,0,0,10,0, "none", "none");
        ennemy1 = new Personnage(Utilitaires.randomFiveToTen,0,Utilitaires.randomFiveToTen,Utilitaires.randomZeroToFive,Utilitaires.randomZeroToFive,Utilitaires.randomFiveToTen,Utilitaires.randomZeroToFive, "José le rigolo", "┌∩┐(◣_◢)┌∩┐");
        ennemy2 = new Personnage(Utilitaires.randomFiveToTen,0,Utilitaires.randomFiveToTen,Utilitaires.randomZeroToFive,Utilitaires.randomZeroToFive,Utilitaires.randomFiveToTen,Utilitaires.randomZeroToFive, "Patrick le fatigué", "┌∩┐(◣_◢)┌∩┐");
        ennemy3 = new Personnage(Utilitaires.randomFiveToTen,0,Utilitaires.randomFiveToTen,Utilitaires.randomZeroToFive,Utilitaires.randomZeroToFive,Utilitaires.randomFiveToTen,Utilitaires.randomZeroToFive, "Jonathan", "┌∩┐(◣_◢)┌∩┐");
        ennemy4 = new Personnage(Utilitaires.randomFiveToTen,0,Utilitaires.randomFiveToTen,Utilitaires.randomZeroToFive,Utilitaires.randomZeroToFive,Utilitaires.randomFiveToTen,Utilitaires.randomZeroToFive, "Yo", "┌∩┐(◣_◢)┌∩┐");
        ennemy5 = new Personnage(Utilitaires.randomFiveToTen,0,Utilitaires.randomFiveToTen,Utilitaires.randomZeroToFive,Utilitaires.randomZeroToFive,Utilitaires.randomFiveToTen,Utilitaires.randomZeroToFive, "Yi", "┌∩┐(◣_◢)┌∩┐");
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
