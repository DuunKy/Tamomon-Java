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

    public static final String AFFICHAGETOUR = "Tour :";

    public static final String GESTIONTAMAMON = "Maintenant occupons nous un peu de votre TAMAMON:" +
            "\n 1. Nourir" +
            "\n 2. Promener" +
            "\n 3. Laver" +
            "\n 4. Carresser\n";

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

    //Utils:
    public static final String SEPARATOR = "\n--------------------------------------------------------------------------------\n";
}
