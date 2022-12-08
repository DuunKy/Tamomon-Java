package main.Update;

import data.ColorBase;
import data.Texte;

import static data.Data.getNbTour;
import static data.Data.setNbTour;
import static main.Update.Contraint.contraintAction;
import static main.Update.Default.defaultAction;
import static main.Update.Random.randomAction;

public class Update {
    public static void update() {

        defaultAction();
        randomAction();
        contraintAction();

        setNbTour(getNbTour() + 1);

        System.out.println(Texte.SEPARATOR + ColorBase.RESET);

    }





}
