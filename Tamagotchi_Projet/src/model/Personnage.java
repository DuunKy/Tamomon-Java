package model;

public class Personnage {
    private static int Energy;
    private static int Force;
    private static int Joie;
    private static int Faim;
    private static int Fatigue;
    private static int Proprete;
    private static int MalusForce;
    private static String Name;


    private static String Physique;

    public Personnage(int energy, int force, int joie, int faim, int fatigue, int proprete, int malusForce, String name, String physique) {
        Energy = energy;
        Force = force;
        Joie = joie;
        Faim = faim;
        Fatigue = fatigue;
        Proprete = proprete;
        MalusForce = malusForce;
        Name = name;
        Physique = physique;
    }

    public static int getEnergy() {return Energy;}
    public static void setEnergy(int energy) { Energy = energy;}

    public static int getForce() {return Force;}
    public static void setForce(int force) {Force = force;}

    public static int getJoie() {return Joie;}
    public static void setJoie(int joie) {Joie = joie;}

    public static int getFaim() {return Faim;}
    public static void setFaim(int faim) {Faim = faim;}

    public static int getFatigue() {return Fatigue;}
    public static void setFatigue(int fatigue) {Fatigue = fatigue;}

    public static int getProprete() {return Proprete;}
    public static void setProprete(int proprete) {Proprete = proprete;}

    public static int getMalusForce() {return MalusForce;}
    public static void setMalusForce(int malusForce) {MalusForce = malusForce;}

    public static String getName() {return Name;}
    public static void setName(String name) {Name = name;}

    public static String getPhysique() {
        return Physique;
    }

    public static void setPhysique(String physique) {
        Physique = physique;
    }
}
