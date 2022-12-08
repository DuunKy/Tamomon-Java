package main.Update;

import data.ColorBase;
import data.Texte;
import model.Personnage;

import static data.Data.getNbTour;
import static data.Data.setNbTour;
import static main.Update.Contraint.contraintAction;
import static main.Update.Death.Death.canDeath;
import static main.Update.Default.defaultAction;
import static main.Update.Random.randomAction;

public class Update {
    public static void update() {

        defaultAction();
        randomAction();
        contraintAction();

        setNbTour(getNbTour() + 1);


        checkVariables();
        System.out.println(Texte.SEPARATOR + ColorBase.RESET);

    }

    private static void checkVariables() {
        if ( Personnage.getEnergy() <= 0 ) {
            Personnage.setEnergy(0);
        }
        if ( Personnage.getForce() <= 0 ) {
            Personnage.setForce(0);
        }
        if ( Personnage.getJoie() <= 0 ) {
            Personnage.setJoie(0);
        }
        if ( Personnage.getFaim() <= 0 ) {
            Personnage.setFaim(0);
        }
        if ( Personnage.getFatigue() <= 0 ) {
            Personnage.setFatigue(0);
        }
        if ( Personnage.getProprete() <= 0 ) {
            Personnage.setProprete(0);
        }
        if ( Personnage.getMalusForce() <= 0 ) {
            Personnage.setMalusForce(0);
        }
        canDeath();
    }





}
