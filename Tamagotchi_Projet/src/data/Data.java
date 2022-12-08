package data;

public class Data {

    // Data for variables of TAMAMON Actions:
    public static final int NOURRIR = 1;
    public static final int SORTIR = 2;
    public static final int LAVER = 1;
    public static final int CARESSER = 1;

    // Utils variables:
    private boolean menuOn = true;

    private boolean sousMenuOn;

    private static int NbTour = 0;

    public boolean isMenuOn() {
        return menuOn;
    }

    public void setMenuOn(boolean menuOn) {
        this.menuOn = menuOn;
    }

    public boolean isSousMenuOn() {
        return sousMenuOn;
    }

    public void setSousMenuOn(boolean sousMenuOn) {
        this.sousMenuOn = sousMenuOn;
    }

    public static int getNbTour() {
        return NbTour;
    }

    public static void setNbTour(int nbTour) {
        NbTour = nbTour;
    }
}
