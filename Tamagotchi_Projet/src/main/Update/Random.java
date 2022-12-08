package main.Update;

import data.Texte;

import static model.Personnage.*;
import static model.Personnage.getProprete;

public class Random {
    public static void randomAction() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                setFaim(getFaim() + 1);
                System.out.println(Texte.RANDOM_LOOSE_FAIM + " +1");
                break;
            case 1:
                setFatigue(getFatigue() + 1);
                System.out.println(Texte.RANDOM_LOOSE_FATIGUE + " +1");
                break;
            case 2:
                setProprete(getProprete() - 1);
                System.out.println(Texte.RANDOM_LOOSE_PROPRETE + " -1");
                break;
        }
    }
}
