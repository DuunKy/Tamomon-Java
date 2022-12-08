package main;

import data.Color;
import data.ColorBase;
import data.Data;
import data.Texte;

import static data.Data.getNbTour;
import static data.Data.setNbTour;
import static main.GameMenu.gameMenu;
import static main.Lancement.isOnGame;
import static main.Lancement.perso;
import static model.Personnage.*;
import static utilitaires.Utilitaires.returnUnChiffre;

public class Game {

    public static void game() {

        System.out.println(Texte.SEPARATOR);

        System.out.println(ColorBase.BOLD + ColorBase.BLUE +  perso.getName() + " : " + perso.getPhysique() + "          " + Texte.DAY + getNbTour() + ColorBase.RESET);

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

    private static void update() {

        defaultAction();
        randomAction();
        contraintAction();

        setNbTour(getNbTour() + 1);

        System.out.println(Texte.SEPARATOR + ColorBase.RESET);

    }

    private static void defaultAction() {
        setFaim(getFaim() + 1);
        System.out.println(Texte.DEFAULT_LOOSE_FAIM + " +1");
        setFatigue(getFatigue() + 1);
        System.out.println(Texte.DEFAULT_LOOSE_FATIGUE + " +1");
        setProprete(getProprete() - 1);
        System.out.println(Texte.DEFAULT_LOOSE_PROPRETE + " -1");
    }

    private static void randomAction() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                setFaim(getFaim() + 1);
                System.out.println(Texte.RANDOM_LOOSE_FAIM + " +1");
                break;
            case 1:
                setFatigue(getFatigue() + 1);
                System.out.println(Texte.RANDOM_LOOSE_FATIGUE + " +1");
                break;
            case 2:
                setProprete(getProprete() - 1);
                System.out.println(Texte.RANDOM_LOOSE_PROPRETE + " -1");
                break;
        }
    }

    private static void contraintAction(){
        setForce(getNbTour()/10 - getMalusForce());

        if (getFaim() > 7) {
            setJoie(getJoie() - 1);
            setFatigue(getFatigue() + 1);
            setEnergy(getEnergy() - 1);
            System.out.println(Texte.CONTRAINT_FAIM + " -1, +1, -1");
        }
        if (getFatigue() > 7) {
            setMalusForce(getMalusForce() + 1);
            setEnergy(getEnergy() - 1);
            System.out.println(Texte.CONTRAINT_FATIGUE + " +1, -1");
        }
        if (getProprete() < 3) {
            setJoie(getJoie() - 1);
            setEnergy(getEnergy() - 1);
            setForce(getForce() - 1);
            System.out.println(Texte.CONTRAINT_PROPRETE + " -1, -1, -1");
        }
        if (getJoie() < 3) {
            setFatigue(getFatigue() + 1);
            setEnergy(getEnergy() - 1);
            setForce(getForce() - 1);
            System.out.println(Texte.CONTRAINT_JOIE + " +1, -1, -1");
        }
    }
}
