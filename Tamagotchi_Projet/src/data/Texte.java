package data;

public class Texte {
    public static final String MENUPRINCIPAL = "Bienvenu sur Tamamon !" +
            "\n 1. Création Tamamon. " +
            "\n 2. Continuer avec votre Tamamon." +
            "\n 3. Quitter.\n";
    public static final String CONFIRMATION = "Êtes-vous sûre ?" +
            "\n 1. Mais oui !" +
            "\n 2. J'ai changé d'avis !\n";
    public static final String NOMTAMAMON = "Commençons la crétion de votre Tamamon" +
            "\n D'abord donnons-lui un nom, comment voulez-vous l'appeler ?\n";
    public static final String CHOIXTAMAMON = "Maintenant personnalisons son physique :";
    public static final String CHOIX = "Choix ";
    public static final String PASOUF = "Okay ! Pas ouf..";
    public static final String ERREUR = "Une erreur s'est produite réessayez !\n";
    public static final String SAVEPATH = "src/save/save.txt";
    public static final String SAVETAMAFOUND = "Tamagochi trouvé !";
    public static final String SAVETAMANOTFOUND = "Pas de tamagochi trouvé ! \n Essayez d'en créer un !\n";
    public static final String SAVETAMACREATE = "Tamagochi créé avec succès! \n Vous pouvez maintenant le nourrir, le promener, le laver et le carresser !\n";
    // SAVE INDEX:
    public static final String SAVE_INDEX_NAME = "Noms: ";
    public static final String SAVE_INDEX_ENERGY = "Energy: ";
    public static final String SAVE_INDEX_FORCE = "Force: ";
    public static final String SAVE_INDEX_JOIE = "Joie: ";
    public static final String SAVE_INDEX_FAIM = "Faim: ";
    public static final String SAVE_INDEX_FATIGUE = "Fatigue: ";
    public static final String SAVE_INDEX_PROPRETE = "Proprete: ";
    public static final String SAVE_INDEX_MALUSFORCE = "MalusForce: ";
    public static final String SAVE_INDEX_PHYSIQUE = "Physique: ";
    public static final String SAVE_INDEX_NBTOUR = "Nombre de tours: ";

    // GAME BOUCLE PRINT:
    public static final String ENERGY =     ColorBase.ITALIC + "Votre " + ColorBase.RESET + ColorBase.BOLD + "énergie" + ColorBase.RESET + ColorBase.ITALIC + " est de :        ";
    public static final String FORCE =      ColorBase.ITALIC + "Votre " + ColorBase.RESET + ColorBase.BOLD + "force" + ColorBase.RESET + ColorBase.ITALIC + " est de :          ";
    public static final String JOIE =       ColorBase.ITALIC + "Votre " + ColorBase.RESET + ColorBase.BOLD + "joie" + ColorBase.RESET + ColorBase.ITALIC + " est de :           ";
    public static final String FAIM =       ColorBase.ITALIC + "Votre " + ColorBase.RESET + ColorBase.BOLD + "faim" + ColorBase.RESET + ColorBase.ITALIC + " est de :           ";
    public static final String FATIGUE =    ColorBase.ITALIC + "Votre " + ColorBase.RESET + ColorBase.BOLD + "fatigue" + ColorBase.RESET + ColorBase.ITALIC + " est de :        ";
    public static final String PROPRETE =   ColorBase.ITALIC + "Votre " + ColorBase.RESET + ColorBase.BOLD + "propreté" + ColorBase.RESET + ColorBase.ITALIC + " est de :       ";
    public static final String MALUSFORCE = ColorBase.ITALIC + "Votre " + ColorBase.RESET + ColorBase.BOLD + "malus de force" + ColorBase.RESET + ColorBase.ITALIC + " est de : ";

    // GAME MENU PRINT:
    public static final String GAMEMENU = ColorBase.UNDERLINE + ColorBase.BOLD + ColorBase.BLUE + "Que voulez-vous faire ?" + ColorBase.RESET + ColorBase.GREEN +
            "\n 1. Nourrir" +
            "\n 2. Sortir " +
            "\n 3. Laver" +
            "\n 4. Carresser" +
            ColorBase.YELLOW + "\n 5. Sauvegarder" +
            ColorBase.RED + "\n 6. Quitter\n" + ColorBase.RESET;

    // UPDATE PRINT:
        // ACTION:
    public static final String ACTION_NOURRIR = "Vous avez nourri votre Tamamon, il est rassasié et a pu réparer ses mauvais coups!";
    public static final String ACTION_SORTIR = "Vous avez sorti votre Tamamon, il est bien fatigué mais il est heureux !";
    public static final String ACTION_LAVER = "Vous avez lavé votre Tamamon, il est propre !";
    public static final String ACTION_CARESSER = "Vous avez caressé votre Tamamon, il est reposé et a repris de l'énergie !";
        // DEFAULT:
    public static final String DEFAULT_LOOSE_ENERGY = "Vous avez perdu de l'énergie: ";
    public static final String DEFAULT_LOOSE_JOIE = "Vous avez été attristé: ";
    public static final String DEFAULT_LOOSE_FAIM = "Vous avez faim: ";
    public static final String DEFAULT_LOOSE_FATIGUE = "Vous êtes fatigué: ";
    public static final String DEFAULT_LOOSE_PROPRETE = "Vous vous êtes sali: ";
    public static final String DEFAULT_LOOSE_FORCE = "Vous avez perdu de la force: ";
    public static final String DEFAULT_LOOSE_MALUSFORCE = "Vous avez perdu de la force à cause d'un mauvais coup: ";
        // RANDOM:
    public static final String RANDOM_LOOSE_FAIM = "Vous avez un soudaint creu: ";
    public static final String RANDOM_LOOSE_FATIGUE = "Vous avez un coup de barre: ";
    public static final String RANDOM_LOOSE_PROPRETE = "Cette journée vous a bien sali: ";
        // CONTRAINTS:
    public static final String CONTRAINT_FAIM = "Vous avez trop faim ! Vous êtes fatigué, Vous êtes dans une mauvaise passe et vous avez perdu de l'énergie !";
    public static final String CONTRAINT_FATIGUE = "Vous êtes trop fatigué ! Vous avez pris un sale coup, et vous avez perdu de l'énergie !";
    public static final String CONTRAINT_PROPRETE = "Vous êtes trop sale ! Vous êtes attristé, vous de l'énergie et de la force !";
    public static final String CONTRAINT_JOIE = "Vous êtes trop triste ! Vous avez un coup de barre, vous avez perdu de l'énergie et de la force !";
    //DEATH PRINT:
    public static final String DEATH_FAIM = "Vous êtes mort de faim !";
    public static final String DEATH_FATIGUE = "Vous êtes mort de fatigue !";
    public static final String DEATH_PROPRETE = "Vous êtes mort de salete !";
    //DEATH MENU:
    public static final String DEATH_MENU ="Que voulez-vous faire ?";
    public static final String NOT_ENOUGHT_ENERGY = "Vous n'avez pas assez d'énergie !";
    public static String DEATH_CHOICE_1 =
            "\n 1. Revivre, coute 7 Energie, vous avez: " ;
            public static String DEATH_CHOICE_2 =
        "\n 2. Revenir au menu principal\n 3. Quitter\n";
    public static final String DEATH_JOIE = "Vous êtes mort de tristesse !";
    public static final String DEATH_FORCE = "Vous êtes mort de fatigue !";
    public static final String DEATH_DEFAULT = "Vous êtes mort!";
    //Utils:
    public static final String SEPARATOR = "\n--------------------------------------------------------------------------------\n";
    public static final String DAY = "Jour ";

}
