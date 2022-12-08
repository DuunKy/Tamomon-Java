# Tamomon-Java

Fait par : Albéric | & Duncan | duncan.lhuillery@ynov.com

# gestion save:
- Chaques lignes sont un parametre

# TODO LIST:

- Remplir ds les crochets les noms
- ajouter ✔ au TODO fait et ❌ au non fait

## ❌ Si le temps le permet, faire un systeme de difficulté: [ ]

   *  modifier ds data les retrait et ajou de points en fonction de la difficulté
   *  rendre plus fort les ennemys

## ✔ Ajout couleur qui facilite la lisibilité: [ ]

   *  func DynamicColor ✔
   *  func Simple Color ✔ 
   *  assigner des couleurs aux textes 🔁

## ✔ Gestion de la mort: [ ]

   *  Mettre un minimum aux variables car elles descendent en négatif sans rien faire
   *  creer une fonction mort qui propose de réssucité si on a 7 Energy ou qui propose de recommencer

## ✔ Init des variables: [ Duncan ] 
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

## ✔ Update des vairables [ Albéric ] 

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

## ✔ Refaire le fichier de save aux normes: [ Albéric ] 
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

* Super Fonction qui sera hérité des autres fonction d'action [ Albéric ]:
    
    ```
    Action(e) {
        Energy =- e
    }
    ```

     - Nourrir (1 Energy ) [ Albéric ]:
          - Faim = 0
          - Malus --

     - Sortir (2 Energy ) [ Duncan ]:
          - Fatigue ++
          - Joie = 10

    - Laver (1 Energy ) [ Albéric ]:
        - Proprete = 10

    - Caresser (1 Energy) [ Duncan ]:
        - energy = force + joie - faim - fatigue
        - fatigue = 0
