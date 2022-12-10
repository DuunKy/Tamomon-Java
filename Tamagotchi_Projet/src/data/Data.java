package data;

public class Data {

    // Data for variables of TAMAMON Actions:
    public static final int NOURRIR = 1;
    public static final int SORTIR = 2;
    public static final int LAVER = 1;
    public static final int CARESSER = 1;
    public static final String DEATH_JOIE = "joie";
    public static final String DEATH_FAIM = "faim";
    public static final String DEATH_FATIGUE = "fatigue";
    public static final String DEATH_PROPRETE = "propreté";

    // Utils variables:
    private static boolean ProgramRun = true;


    private boolean sousMenuOn;

    private static int NbTour = 0;
    private static int NbVictoire = 0;

    private static int setNbStreakVictoire = 0;

    public boolean isProgramRun() {
        return ProgramRun;
    }

    public static void setProgramRun(boolean programRun) {
        ProgramRun = programRun;
    }

    public boolean isSousMenuOn() {
        return sousMenuOn;
    }

    public void setSousMenuOn(boolean sousMenuOn) {
        this.sousMenuOn = sousMenuOn;
    }

    public static int getNbTour() {return NbTour;}

    public static void setNbTour(int nbTour) {
        NbTour = nbTour;
    }

    public static int getNbVictoire() {return NbVictoire;}
    public static void setNbVictoire(int nbVictoire) {NbVictoire = nbVictoire;}

    public static int getNbStreakVictoire() {return setNbStreakVictoire;}
    public static void setNbStreakVictoire(int setNbStreakVictoire) {Data.setNbStreakVictoire = setNbStreakVictoire;}
}
