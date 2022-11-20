package main;

import data.Data;
import data.Texte;
import model.Personnage;
import utilitaires.Utilitaires;

public class Lancement {
    Data data;
    Personnage perso;

    public Lancement() {
        data = new Data();
        perso = new Personnage();
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


    private void menuCreation() {
        System.out.println(Texte.NOMTAMAMON);
        String nomTamamon = Utilitaires.getStringFromUser();
        perso.setName(nomTamamon);
        do{
            System.out.println(Texte.CHOIXTAMAMON);
            switch (Utilitaires.returnUnChiffre()){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println(Texte.ERREUR);
                    break;

            }

        }while (data.isSousMenuOn());
    }
    private void menuSauvegarde() {
    }


}
