package action.Combat;

import data.Texte;
import utilitaires.Utilitaires;

import static utilitaires.Utilitaires.quit;

public class CombatBoucle {
    public  void combatBoucle() {
        System.out.println(Texte.COMBAT);

        int choix = Utilitaires.returnUnChiffre();

        switch (choix) {
            case 1:
                System.out.println(Texte.COMBAT_ATTAQUE);
                break;
            case 2:
                System.out.println(Texte.COMBAT_DEFENSE);
                break;
            case 3:
                System.out.println(Texte.COMBAT_FUIR);
                break;
            case 4:
                quit();
                break;
            default:
                combatBoucle();
                break;
        }
    }

}
