package action;


import data.Data;
import model.Personnage;

public class Action {

    private static void action(int e) {
        Personnage.setEnergy(Personnage.getEnergy() - e);
    }

    public static void nourrir() {
        action(Data.NOURRIR);
        Personnage.setFaim(0);
        Personnage.setMalusForce(Personnage.getMalusForce() - 1);
    }

    public static void sortir() {
        action(Data.SORTIR);
        Personnage.setFatigue(Personnage.getFatigue() + 1);
        Personnage.setJoie(10);
    }

    public static void laver() {
        action(Data.LAVER);
        Personnage.setProprete(10);
    }

    public static void caresser() {
        action(Data.CARESSER);
        Personnage.setEnergy(
                Personnage.getForce()
                        + Personnage.getJoie()
                        - Personnage.getFaim()
                        - Personnage.getFatigue()
        );
        Personnage.setFatigue(0);
    }
}
