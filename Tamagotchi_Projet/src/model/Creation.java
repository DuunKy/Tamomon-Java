package model;

import data.ColorBase;
import data.Data;
import data.Texte;
import utilitaires.FileManage;
import utilitaires.Utilitaires;

import java.io.File;

import static main.Lancement.init;
import static main.Lancement.setOnGame;
import static utilitaires.Utilitaires.clearScreen;


public class Creation {

    public static void menuCreation(Data data) {
        init() ;
        Physique physique = new Physique();
        System.out.println(ColorBase.BLUE + ColorBase.BOLD + ColorBase.UNDERLINE + Texte.NOMTAMAMON);
        Personnage.setName(Utilitaires.getStringFromUser());

        //System.out.println(perso.getName());

        do {
            System.out.println(ColorBase.BLUE + ColorBase.BOLD + ColorBase.UNDERLINE + Texte.CHOIXTAMAMON + ColorBase.RESET);
            for (Integer id : physique.getId()) {
                System.out.print(ColorBase.BLUE + Texte.CHOIX);
                System.out.println(ColorBase.CYAN + id + " : " + physique.getModel().get(id) + ColorBase.RESET);
            }
            int choix = Utilitaires.returnUnChiffre();
            if (choix < physique.getId().size()) {
                Personnage.setPhysique(physique.getModel().get(choix));

                data.setSousMenuOn(false);
            } else {
                clearScreen();
                System.out.println(ColorBase.ERROR + Texte.ERREUR);
            }



            //create the save file and write all perso's parameters in

            //System.out.println(Utilitaires.persoToArray());

            File save = FileManage.createFile(Texte.SAVEPATH);
            FileManage.writeInFile(save, Utilitaires.persoToArray());

            clearScreen();
            System.out.println(ColorBase.GREEN + ColorBase.BOLD + ColorBase.UNDERLINE + Texte.SAVETAMACREATE);
            System.out.println(ColorBase.BLUE + Personnage.getName() + " : " + Personnage.getPhysique() + ColorBase.RESET);
            setOnGame(false);


        } while (data.isSousMenuOn());
    }

}
