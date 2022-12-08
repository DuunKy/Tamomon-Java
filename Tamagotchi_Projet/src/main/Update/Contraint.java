package main.Update;

import data.Texte;

import static data.Data.getNbTour;
import static model.Personnage.*;
import static model.Personnage.getForce;

public class Contraint {
    public static void contraintAction(){
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
