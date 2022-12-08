package action;


import data.ColorBase;
import data.Data;
import data.Texte;
import model.Personnage;


import static model.Personnage.setEnergy;

public class Action {

    private static boolean action(int e) {
        if (Personnage.getEnergy() >= e) {
            setEnergy(Personnage.getEnergy() - e);
            return true;
        } else {
            System.out.println(ColorBase.ERROR + Texte.NOT_ENOUGHT_ENERGY + ColorBase.RESET);
            return false;
        }
    }

    public static void nourrir() {
        if (action(Data.NOURRIR)) {
            Personnage.setFaim(0);
            Personnage.setMalusForce(Personnage.getMalusForce() - 1);
            System.out.println(ColorBase.GREEN + Texte.ACTION_NOURRIR + ColorBase.RESET);
            System.out.println(ColorBase.RED + Texte.DEFAULT_LOOSE_ENERGY + "-" + Data.NOURRIR);
        }
    }

    public static void sortir() {
        if (action(Data.SORTIR)) {
            Personnage.setFaim(Personnage.getFaim() + 1);
            Personnage.setMalusForce(Personnage.getMalusForce() + 1);
            System.out.println(ColorBase.GREEN + Texte.ACTION_SORTIR + ColorBase.RESET);
            System.out.println(ColorBase.RED + Texte.DEFAULT_LOOSE_ENERGY + "-" + Data.SORTIR);
        }
    }

    public static void laver() {
        if (action(Data.LAVER)) {
            Personnage.setProprete(10);
            System.out.println(ColorBase.GREEN + Texte.ACTION_LAVER + ColorBase.RESET);
            System.out.println(ColorBase.RED + Texte.DEFAULT_LOOSE_ENERGY + "-" + Data.LAVER);
        }

    }

    public static void caresser() {
        if (action(Data.CARESSER)) {
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
}
