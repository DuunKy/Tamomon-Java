package data;

public class Data {

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
