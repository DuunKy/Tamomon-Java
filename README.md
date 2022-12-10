# Tamomon-Java

- Fait par : [Albéric] | alberic.walshdeserrant@ynov.com & [Duncan] | duncan.lhuillery@ynov.com  [B1B]

# Gestion save:

- Chaques lignes sont un paramètre

# CARNET DE BORD:
## Gestion des variables:
  * class personnage:
    - physique du perso est géré en string et il y a la possibilité d'importer d'autre physique en les ajoutant au fichier model.txt
    - initialisation du personnage au lancement
    - création du perso pui créaation du fichier save ce qui permet de lancer le jeu quoi qu'il arrive sur le fichier save
    - crea: le perso est initailisé à ses valeurs par defaut ce qui veut dire que pour le noms et le physique, les string sont initialement égal à "none"
    - pour les enemies, ceux ci sont créé au moment du combat avec la class perso
  * gestion de la save:
    - on a voulu que la save soit lisible et compréhensible, ce qui fait que lorsque vous l'ouvrez, vous tombrez sur les noms des variables et leurs valeurs.
    - les noms des variables qui apparaissent dans la save peuvent etre changé autant que souhaité sans que cela ne pose aucun problème
    - les path peuvent également etre changé si vous le voulez. (pour les fichier save et model). par defaut ceux ci devrait etre "src/save/save.txt" et "src/model/model.txt"
  * Norme des variables:
    - toute les variables sont en privé et sont géré avec des getter steer pour une meilleur sécurité.
    - les nominations sont respectée pour toutes les variable, class, package et function etc
## Deroulé du jeu:
  * 1er etape:
    - menu principal qui propose de cree ou de continuer avec un tamamon
  * 2eme etape:
    - boucle principal du jeu qui contient les action que le joueur peu faire
    - updates des propriété du tamagochi
    - possibilité d'enregistré la partie
  * 3eme etape:
    - l'affrontement
  * 4eme etape:
    - la mort
    - menu qui propose de ressucité si on a 7 energie (ajout de notre part pour un coté deuxieme chance)
    - menu principal ou quitter
## Optimisation:
  * minimalisation des warning.
  * fonction bien définis avec des taches qui leurs sont propre
  * maximisation du parse du projet

# TODO LIST:

- ajouter ✔ au TODO fait et ❌ au non fait

## ❌ Si le temps le permet, faire un system de difficulté: 

   *  modifier ds data les retrait et ajout de points en fonction de la difficulté
   *  rendre plus fort les enemy

## ✔ Ajout couleur qui facilite la lisibilité: 

   *  func DynamicColor ✔
   *  func Simple Color ✔ 
   *  assigner des couleurs aux textes 🔁

## ✔ Gestion de la mort: 

   *  Mettre un minimum aux variables car elles descendent en négatif sans rien faire
   *  creer une fonction mort qui propose de réssucité si on a 7 Energy ou qui propose de recommencer

## ✔ Init des variables: 
    - Name : "none"
    - Physique : "none"
    - Energy : 10
    - Force : 0
    - Joie : 10
    - Faim : 0
    - Fatigue : 0
    - Propreté : 10
    - MalusForce : 0
    - NbTour : 0

## ✔ Update des vairables 

* creer une fonction update() qui va mettre à jour les variables à chaque tours

    * Action Par défaut :
        - faim++
        - fatigue++
        - propreté--
        - nbtour++
    * Action Random (1 au choix):
        - faim++
        - fatigue++
        - propreté--
    * Action de contraintes :
        - force = NbTours/10 - MalusForce
        - si faim>7 -> joie--, fatigue++, energy--
        - si fatigue>7 -> MalusForce++, energy--
        - si propreté<3 -> joie--, energy--, force--
        - si joie<3 -> fatigue++, ernergy--, force--

## ✔ Refaire le fichier de save aux normes: 
    Nom:
    Energy:
    Force:
    Joie:
    Faim:
    Fatigue:
    Proprete:
    MalusForce:
    Physique:

    ajouter :
        Nbtour: (penser a parser les parametres suivant des parametres Personnages)

## ✔ Creer les fonctions d'action pour: 

* Super Fonction qui sera hérité des autres fonction d'action:
    
    ```
    Action(e) {
        Energy =- e
    }
    ```

     - Nourrir (1 Energy ) :
          - Faim = 0
          - Malus --

     - Sortir (2 Energy ) :
          - Fatigue ++
          - Joie = 10

    - Laver (1 Energy ) :
        - Proprete = 10

    - Caresser (1 Energy) :
        - energy = force + joie - faim - fatigue
        - fatigue = 0
## Combats :

* ✔ Creer une fonction qui va générer x ennemi aléatoire(stats aussi).
* ✔ Fonction qui choisi un ennemi aléatoire dans la map.
* ✔ Création d'une fonction switch pour la gestion du combat.
  - ✔ Attaque
  - 🔁 Défense
  - 🔁 Fuite
* ✔ Création d'une fonction qui va vérifier la condition de victoire
* ✔ Création d'un compteureur de win / win streak
