package main;

import data.Data;
import data.Texte;
import model.Personnage;
import model.Physique;
import utilitaires.Utilitaires;

import java.util.ArrayList;

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
                menuCreation();
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


    private static void menuCreation() {
        Physique physique = new Physique();
        System.out.println(Texte.NOMTAMAMON);
        perso.setName(Utilitaires.getStringFromUser());
        System.out.println(perso.getName());
        do{
            System.out.println(Texte.CHOIXTAMAMON);
            for (Integer id : physique.getId()) {
                System.out.print(Texte.CHOIX);
                System.out.println(id + " : " + physique.getModel().get(id));
            }
            int choix = Utilitaires.returnUnChiffre();
            if (choix < physique.getId().size()) {
                perso.setPhysique(physique.getModel().get(choix));
                data.setSousMenuOn(false);
            } else {
                System.out.println(Texte.ERREUR);
            }
            System.out.println(perso.getPhysique());

        }while (data.isSousMenuOn());
    }
    private void menuSauvegarde() {
    }


}
