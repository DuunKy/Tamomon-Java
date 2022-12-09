package action.Combat;

import data.Texte;
import utilitaires.Utilitaires;

public class MenuCombat {
    public static void choixCombattant(){
        int combattant = Utilitaires.randomZeroToFive;
        switch (combattant){
            case 0:
                System.out.println(Texte.AFFRONTEMENT);
                break;
            case 1:
                System.out.println(Texte.AFFRONTEMENT);
                break;
            case 2:
                System.out.println(Texte.AFFRONTEMENT);
                break;
            case 3:
                System.out.println(Texte.AFFRONTEMENT);
                break;
            case 4:
                System.out.println(Texte.AFFRONTEMENT);
                break;
            case 5:
                System.out.println(Texte.AFFRONTEMENT);
                break;
        }
    }
}
