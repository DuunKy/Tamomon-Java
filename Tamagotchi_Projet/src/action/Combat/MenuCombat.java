package action.Combat;

import data.Texte;
import main.Lancement;
import model.Personnage;
import utilitaires.Utilitaires;

import static main.Lancement.*;

public class MenuCombat {
    public static void choixCombattant(){
        int combattant = Utilitaires.randomZeroToFive;
        switch (combattant){
            case 0:
                System.out.println(Texte.AFFRONTEMENT + ennemy1.getName());
                break;
            case 1:
                System.out.println(Texte.AFFRONTEMENT + ennemy2.getName());
                break;
            case 2:
                System.out.println(Texte.AFFRONTEMENT + ennemy3.getName());
                break;
            case 3:
                System.out.println(Texte.AFFRONTEMENT + ennemy4.getName());
                break;
            case 4:
                System.out.println(Texte.AFFRONTEMENT + ennemy5.getName());
                break;
        }
        CombatBoucle.combatBoucle();
    }
}
