package action.Combat;

import data.Data;
import data.Texte;
import main.Lancement;
import model.Ennemy;
import model.Personnage;
import utilitaires.FileManage;
import utilitaires.Utilitaires;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class Combat {

    public static Map<String , Ennemy> ennemies = new HashMap<>();

    public void createEnnemies(){
        int creationEnnemiesRandom = Utilitaires.random(5,10);
        for (int i = 0; i <= creationEnnemiesRandom; i++) {
            Ennemy x = new Ennemy(Utilitaires.random(5,10), 0,Utilitaires.random(5,10),Utilitaires.random(0,5),Utilitaires.random(0,5),Utilitaires.random(5,10),Utilitaires.random(0,5),"Enemy"+i,"┌∩┐(◣_◢)┌∩┐");
            ennemies.put("Enemy"+i, x);
        }
    }
    public void combat(){
        int enemyRandom = Utilitaires.random(0,ennemies.size());
        Ennemy enemyFight = ennemies.get("Enemy"+ enemyRandom);
        System.out.println(Texte.AFFRONTEMENT + enemyFight.getName() + ":" + enemyFight.getPhysique());
        enemyFight.setForce((Data.getNbTour()/10)-enemyFight.getMalusForce());
        combatBoucle(Lancement.perso,enemyFight);

    }

    public void pvp(){
        FileManage.createFile("enemy.txt");
        if (FileManage.fileExist("enemy.txt")){
            File enemyPvp = FileManage.openFile("enemy.txt");
            ennemies.put("EnemyPvp", Utilitaires.arrayToEnnemy(FileManage.readFile(enemyPvp)));
            System.out.println(Texte.COMBAT_PVP);
            combatBoucle(Lancement.perso,ennemies.get("EnemyPvp"));
        }
        else{
            System.out.println(Texte.PVP_NO_ENNEMY);
        }


    }
    public boolean testCombat(Personnage perso, Ennemy ennemy){
        int testCombat = Utilitaires.random(1,10);
        if (perso.getForce()+testCombat > ennemy.getForce()+testCombat){
            Data.setNbVictoire(Data.getNbVictoire()+1);
            Data.setNbStreakVictoire(Data.getNbStreakVictoire()+1);
            return true;
        }else{
            Data.setNbStreakVictoire(0);
            return false;
        }
    }

    public  static void combatBoucle(Personnage perso, Ennemy enemy){
        System.out.println(Texte.COMBAT);

        int choix = Utilitaires.returnUnChiffre();

        switch (choix) {
            case 1:
                System.out.println(Texte.SEPARATOR);
                System.out.println(perso.getName() + perso.getPhysique() + Texte.VERSUS + enemy.getPhysique() +" "+ enemy.getName());
                System.out.println(Texte.COMBAT_ATTAQUE);
                System.out.println(Texte.SEPARATOR);
                if (new Combat().testCombat(perso, enemy)) {
                    System.out.println(Texte.COMBAT_WIN);
                    System.out.println(Texte.COMBAT_NBWIN + Data.getNbVictoire()+ Texte.COMBAT_NBWIN2);
                    System.out.println(Texte.COMBAT_WINSTREAK+Data.getNbStreakVictoire()+Texte.COMBAT_WINSTREAK2);
                    System.out.println(Texte.SEPARATOR);
                } else {
                    System.out.println(Texte.COMBAT_RESETWINSTREAK);
                    System.out.println(Texte.COMBAT_NBWIN + Data.getNbVictoire()+ Texte.COMBAT_NBWIN2);
                    System.out.println(Texte.COMBAT_LOSE);
                    System.out.println(Texte.SEPARATOR);
                }
                break;
            case 2:
                System.out.println(Texte.COMBAT_DEFENSE);
                break;
            case 3:
                System.out.println(Texte.COMBAT_FUIR);
                break;
            default:
                combatBoucle(perso,enemy);
                break;
        }
    }

}
