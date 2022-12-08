package utilitaires;

import data.Data;
import data.Texte;
import model.Personnage;

import java.util.ArrayList;
import java.util.Scanner;


public class Utilitaires {
    public static int returnUnChiffre() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try {
            i = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return i;
    }

    public static String getStringFromUser() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static ArrayList<String> returnAllPersoParameters() {

        //Personnage(int energy, int force, int joie, int faim, int fatigue, int proprete, int malusForce, String name, String physique)

        ArrayList<String> parameters = new ArrayList<>();

        parameters.add(Texte.SAVE_INDEX_NAME + Personnage.getName());
        parameters.add(Texte.SAVE_INDEX_ENERGY + Personnage.getEnergy());
        parameters.add(Texte.SAVE_INDEX_FORCE + Personnage.getForce());
        parameters.add(Texte.SAVE_INDEX_JOIE + Personnage.getJoie());
        parameters.add(Texte.SAVE_INDEX_FAIM + Personnage.getFaim());
        parameters.add(Texte.SAVE_INDEX_FATIGUE + Personnage.getFatigue());
        parameters.add(Texte.SAVE_INDEX_PROPRETE + Personnage.getProprete());
        parameters.add(Texte.SAVE_INDEX_MALUSFORCE + Personnage.getMalusForce());
        parameters.add(Texte.SAVE_INDEX_PHYSIQUE + Personnage.getPhysique());
        parameters.add(Texte.SAVE_INDEX_NBTOUR + Data.getNbTour());

        System.out.println(parameters);

        return parameters;
    }

    public static Personnage returnPersoFromSaveArray(ArrayList<String> parameters) {

        parameters = getValueOfSaveArray(parameters);

        System.out.println(parameters);
        Data.setNbTour(Integer.parseInt(parameters.get(9)));

        return new Personnage(

                Integer.parseInt(parameters.get(1)),
                Integer.parseInt(parameters.get(2)),
                Integer.parseInt(parameters.get(3)),
                Integer.parseInt(parameters.get(4)),
                Integer.parseInt(parameters.get(5)),
                Integer.parseInt(parameters.get(6)),
                Integer.parseInt(parameters.get(7)),
                parameters.get(0),
                parameters.get(8)
        );


    }

    private static ArrayList<String> getValueOfSaveArray(ArrayList<String> parameters) {
        ArrayList<String> values = new ArrayList<>();
        values.add(parameters.get(0).substring(Texte.SAVE_INDEX_NAME.length()));
        values.add(parameters.get(1).substring(Texte.SAVE_INDEX_ENERGY.length()));
        values.add(parameters.get(2).substring(Texte.SAVE_INDEX_FORCE.length()));
        values.add(parameters.get(3).substring(Texte.SAVE_INDEX_JOIE.length()));
        values.add(parameters.get(4).substring(Texte.SAVE_INDEX_FAIM.length()));
        values.add(parameters.get(5).substring(Texte.SAVE_INDEX_FATIGUE.length()));
        values.add(parameters.get(6).substring(Texte.SAVE_INDEX_PROPRETE.length()));
        values.add(parameters.get(7).substring(Texte.SAVE_INDEX_MALUSFORCE.length()));
        values.add(parameters.get(8).substring(Texte.SAVE_INDEX_PHYSIQUE.length()));
        values.add(parameters.get(9).substring(Texte.SAVE_INDEX_NBTOUR.length()));

        return values;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
