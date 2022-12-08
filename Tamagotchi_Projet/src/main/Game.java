package main;

import data.Data;

import static model.Personnage.*;

public class Game {

    public static void game() {

        update();
    }

    private static void update() {
        defaultAction();
        randomAction();
        contraintAction();

    }

    private static void defaultAction() {
        setFaim(getFaim() + 1);
        setFatigue(getFatigue() + 1);
        setProprete(getProprete() - 1);
        Data.setNbTour(Data.getNbTour() + 1);
    }

    private static void randomAction() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                setFaim(getFaim() + 1);
                break;
            case 1:
                setFatigue(getFatigue() + 1);
                break;
            case 2:
                setProprete(getProprete() - 1);
                break;
        }
    }

    private static void contraintAction(){
        setForce(Data.getNbTour()/10 - getMalusForce());

        if (getFaim() > 7) {
            setJoie(getJoie() - 1);
            setFatigue(getFatigue() + 1);
            setEnergy(getEnergy() - 1);
        }
        if (getFatigue() > 7) {
            setMalusForce(getMalusForce() + 1);
            setEnergy(getEnergy() - 1);
        }
        if (getProprete() < 3) {
            setJoie(getJoie() - 1);
            setEnergy(getEnergy() - 1);
            setForce(getForce() - 1);
        }
        if (getJoie() < 3) {
            setFatigue(getFatigue() + 1);
            setEnergy(getEnergy() - 1);
            setForce(getForce() - 1);
        }
    }
}
