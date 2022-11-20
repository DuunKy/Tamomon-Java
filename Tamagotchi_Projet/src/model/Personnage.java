package model;

public class Personnage {
    private int Energy,Force,Joie,Faim,Fatigue,Proprete,MalusForce;
    private String Name;

    public int getEnergy() {return Energy;}
    public void setEnergy(int energy) { Energy = energy;}

    public int getForce() {return Force;}
    public void setForce(int force) {Force = force;}

    public int getJoie() {return Joie;}
    public void setJoie(int joie) {Joie = joie;}

    public int getFaim() {return Faim;}
    public void setFaim(int faim) {Faim = faim;}

    public int getFatigue() {return Fatigue;}
    public void setFatigue(int fatigue) {Fatigue = fatigue;}

    public int getProprete() {return Proprete;}
    public void setProprete(int proprete) {Proprete = proprete;}

    public int getMalusForce() {return MalusForce;}
    public void setMalusForce(int malusForce) {MalusForce = malusForce;}

    public String getName() {return Name;}
    public void setName(String name) {Name = name;}
}
