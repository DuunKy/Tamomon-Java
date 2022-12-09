package action.Combat;

import data.Texte;
import model.Ennemy;
import model.Personnage;
import utilitaires.Utilitaires;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Combat {

    public static Map<String , Ennemy> ennemies = new HashMap<>();

    public void createEnnemies(){
        int creationEnnemiesRandom = Utilitaires.random(5,10);
        for (int i = 0; i <= creationEnnemiesRandom; i++) {
            Ennemy x = new Ennemy(Utilitaires.random(5,10),0,Utilitaires.random(5,10),Utilitaires.random(0,5),Utilitaires.random(0,5),Utilitaires.random(5,10),Utilitaires.random(0,5),"Ennemy"+i,"┌∩┐(◣_◢)┌∩┐");
            ennemies.put("Ennemy"+i, x);
        }
    }
    public static void combat(){
        int ennemyRandom = Utilitaires.random(0,ennemies.size());
        System.out.println(Texte.AFFRONTEMENT + ennemies.get("Ennemy"+ennemyRandom).getName());
    }

}
