package main;

import data.Data;
import data.Texte;
import model.Personnage;
import model.Physique;
import utilitaires.Utilitaires;

import java.util.ArrayList;

import static model.Creation.menuCreation;
import static save.Save.menuSauvegarde;

public class Lancement {
    static Data data;
    static Personnage perso;

    public Lancement() {
        data = new Data();
        perso = new Personnage(10,5,5,0,0,5,0, "none", "none");
    }
    public void lancement(){
        do{
            int choixMenuPrincipal = menuPrincipal();
            choixDeMenu(choixMenuPrincipal);
        }while (data.isMenuOn());
    }

    private int menuPrincipal(){
        System.out.println(Texte.MENUPRINCIPAL);
        return Utilitaires.returnUnChiffre();
    }
    private void choixDeMenu(int index) {
        data.setSousMenuOn(true);
        switch (index) {
            case 1:
                menuCreation(data, perso);
                break;
            case 2:
                menuSauvegarde();
                break;
            case 3:
                data.setMenuOn(false);
                break;
            default:
                System.out.println(Texte.ERREUR);
                break;
        }
    }

}
