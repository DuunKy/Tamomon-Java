# Tamomon-Java

# gestion save:
- Chaques lignes sont un parametre

# TODO LIST:

- Remplir ds les crochets les noms
- ajouter ✔ au TODO fait et ❌ au non fait

## ❌ Init des variables: [ Albéric ] 
    - Name : "none"
    - Physique : "none"
    - Energy : 10
    - Force : 5
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

     - Sortir (2 Energy ) [ Albéric ]:
          - Fatigue ++
          - Joie = 10

    - Laver (1 Energy ) [ Albéric ]:
        - Proprete = 10

    - Caresser (1 Energy) [ Albéric ]:
        - energy = force + joie - faim - fatigue
        - fatigue = 0
