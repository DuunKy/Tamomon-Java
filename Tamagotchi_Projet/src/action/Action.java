package action;


import data.ColorBase;
import data.Data;
import data.Texte;
import model.Personnage;


import static model.Personnage.setEnergy;

public class Action {

    private static void action(int e) {
        setEnergy(Personnage.getEnergy() - e);
    }

    public static void nourrir() {
        action(Data.NOURRIR);
        Personnage.setFaim(0);
        Personnage.setMalusForce(Personnage.getMalusForce() - 1);
        System.out.println(ColorBase.GREEN + Texte.ACTION_NOURRIR + ColorBase.RESET);
        System.out.println(ColorBase.RED + Texte.DEFAULT_LOOSE_ENERGY + "-" + Data.NOURRIR);
    }

    public static void sortir() {
        action(Data.SORTIR);
        Personnage.setFatigue(Personnage.getFatigue() + 1);
        Personnage.setJoie(10);
        System.out.println(ColorBase.GREEN + Texte.ACTION_SORTIR + ColorBase.RED + " +1" + ColorBase.RESET);
        System.out.println(ColorBase.RED + Texte.DEFAULT_LOOSE_ENERGY + "-" + Data.SORTIR);
    }

    public static void laver() {
        action(Data.LAVER);
        Personnage.setProprete(10);
        System.out.println(ColorBase.GREEN + Texte.ACTION_LAVER + ColorBase.RESET);
        System.out.println(ColorBase.RED + Texte.DEFAULT_LOOSE_ENERGY + "-" + Data.LAVER);
    }

    public static void caresser() {
        action(Data.CARESSER);
        setEnergy(
                Personnage.getForce()
                        + Personnage.getJoie()
                        - Personnage.getFaim()
                        - Personnage.getFatigue()
        );
        Personnage.setFatigue(0);
        System.out.println(ColorBase.GREEN + Texte.ACTION_CARESSER + ColorBase.RESET);
        System.out.println(ColorBase.RED + Texte.DEFAULT_LOOSE_ENERGY + "-" + Data.CARESSER);
    }
}
