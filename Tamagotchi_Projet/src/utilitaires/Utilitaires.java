package utilitaires;

import model.Personnage;

import java.util.ArrayList;
import java.util.Scanner;

public class Utilitaires {
    public static int returnUnChiffre() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try{
            i = sc.nextInt();
        }
        catch(Exception e) {
        }
        return i;
    }

    public static String getStringFromUser() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }

    public static ArrayList<String> returnAllPersoParameters(Personnage perso) {

        //Personnage(int energy, int force, int joie, int faim, int fatigue, int proprete, int malusForce, String name, String physique)

        ArrayList<String> parameters = new ArrayList<String>();

        parameters.add(String.valueOf(perso.getEnergy()));
        parameters.add(String.valueOf(perso.getForce()));
        parameters.add(String.valueOf(perso.getJoie()));
        parameters.add(String.valueOf(perso.getFaim()));
        parameters.add(String.valueOf(perso.getFatigue()));
        parameters.add(String.valueOf(perso.getProprete()));
        parameters.add(String.valueOf(perso.getMalusForce()));
        parameters.add(perso.getName());
        parameters.add(perso.getPhysique());

        return parameters;
    }

    public static Personnage returnPersoFromSaveArray(ArrayList<String> parameters) {
        if (parameters.size() != 9) {
            System.out.println("Error: parameters array is not a save array. It may be contains 9 parameters instead of " + parameters.size() + " parameters.");
            return null;
        }
        else {
            Personnage perso = new Personnage(
                Integer.parseInt(parameters.get(0)),
                Integer.parseInt(parameters.get(1)),
                Integer.parseInt(parameters.get(2)),
                Integer.parseInt(parameters.get(3)),
                Integer.parseInt(parameters.get(4)),
                Integer.parseInt(parameters.get(5)),
                Integer.parseInt(parameters.get(6)),
                parameters.get(7),
                parameters.get(8)
            );
            return perso;
        }
    }
}
