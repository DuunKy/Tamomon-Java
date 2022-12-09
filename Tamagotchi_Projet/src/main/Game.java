package main;

import data.Color;
import data.ColorBase;
import data.Texte;

import static data.Data.getNbTour;
import static main.GameMenu.gameMenu;
import static main.Update.Update.update;
import static model.Personnage.*;

public class Game {

    public static void game() {

        System.out.println(Texte.SEPARATOR);

        System.out.println(ColorBase.BOLD + ColorBase.BLUE +  getName() + " : " + getPhysique() + "          " + Texte.DAY + getNbTour() + ColorBase.RESET);

        System.out.println(Texte.SEPARATOR);

        System.out.print(Texte.ENERGY);
        Color.DynamicColorUp(3, 10, getEnergy());
        System.out.print(Texte.FORCE);
        Color.DynamicColorUp(3, 10, getForce());
        System.out.print(Texte.JOIE);
        Color.DynamicColorUp(3, 10, getJoie());
        System.out.print(Texte.FAIM);
        Color.DynamicColorDown(7, 3, getFaim());
        System.out.print(Texte.FATIGUE);
        Color.DynamicColorDown(7, 3, getFatigue());
        System.out.print(Texte.PROPRETE);
        Color.DynamicColorUp(3, 10, getProprete());
        System.out.print(Texte.MALUSFORCE);
        Color.DynamicColorDown(7, 1, getMalusForce());

        System.out.println(Texte.SEPARATOR);

        gameMenu();

        update();
    }
}
