package model;

import data.Data;
import data.Texte;
import utilitaires.FileManage;
import utilitaires.Utilitaires;

import java.io.File;

import static utilitaires.Utilitaires.clearScreen;


public class Creation {

    public static void menuCreation(Data data, Personnage perso) {
        Physique physique = new Physique();
        System.out.println(Texte.NOMTAMAMON);
        perso.setName(Utilitaires.getStringFromUser());

        //System.out.println(perso.getName());

        do {
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
                clearScreen();
                System.out.println(Texte.ERREUR);
            }

            //create the save file and write all perso's parameters in

            System.out.println(Utilitaires.returnAllPersoParameters(perso));

            File save = FileManage.createFile(Texte.SAVEPATH);
            FileManage.writeInFile(save, Utilitaires.returnAllPersoParameters(perso));

            clearScreen();
            System.out.println(Texte.SAVETAMACREATE);
            System.out.println(perso.getName() + " : " + perso.getPhysique());


        } while (data.isSousMenuOn());
    }

}
