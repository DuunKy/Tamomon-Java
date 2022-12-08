package model;

import data.Data;
import data.Texte;
import utilitaires.Utilitaires;

public class Creation {

    public static void menuCreation(Data data, Personnage perso) {
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

}
