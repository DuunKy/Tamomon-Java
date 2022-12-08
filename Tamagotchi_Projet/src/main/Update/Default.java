package main.Update;

import data.Texte;

import static model.Personnage.*;
import static model.Personnage.getProprete;

public class Default {
    public static void defaultAction() {
        setFaim(getFaim() + 1);
        System.out.println(Texte.DEFAULT_LOOSE_FAIM + " +1");
        setFatigue(getFatigue() + 1);
        System.out.println(Texte.DEFAULT_LOOSE_FATIGUE + " +1");
        setProprete(getProprete() - 1);
        System.out.println(Texte.DEFAULT_LOOSE_PROPRETE + " -1");
    }
}
