# Algorithmique avancée

**Langage :** Java 1.8

## Description du sujet :

Soit un ensemble S de n points avec n>2, on considère des points dont les abscisses valent 1, 2, ..., n et dont les ordonnées sont quelconques. On cherche à créer une droite brisée qui prend pour premier point celui d’abscisse 1 et comme dernier, le point d’abscisse n, et qui approxime au mieux l’ensemble des points. 

La ligne brisée doit minimiser la valeur suivante : (SD+m.C).
Où :   
  * SD : somme de la distance des points à la droite
  * m : nombre de segments appartenant à la courbe
  * C : constante de pénalité. 

Le but de ce projet sera de trouver la meilleure approximation de l’ensemble d’un ensemble de points par une ligne brisée , qui est quantifiée par la quantité (SD+m.C).


## Contenu du projet :

Nous avons résolu le problème en utilisant deux approches différentes, par essais successifs et par programmation dynamique.
Vous trouverez dans ce projet une classe "EssaisSuccessifsNaif" qui correspond à notre première version de la méthode par essais successifs sans élagage.

## Structure du projet :

Vous trouverez dans le package 'utils' toute les fonctions génériques qui nous ont permis de résoudre le problème (parser, calcul de distance etc ...). 
Les fonctions spécifiques aux différentes méthodes de résolution sont dans les classes associées.

## Test :

Les fichiers de test sont disponibles dans le dossier test. Vous trouverez dans des dossiers spécifiques des fichiers de tests pour les différentes méthodes de résolution.
Un jeu de tests commun est également disponible dans le dossier "Jeu de test initial", pour pouvoir comparer les résultats des différentes méthodes.

Les fichiers tst1 et 2 sont ceux fournis par nos enseignants.

Nous avons créé à la main les fichiers tst3 - 8 pour tester nos programmes.

Pour tracer les courbes de complexité, nous avons généré des points aléatoirement à l'aide du script bash que vous trouverez à la racine du projet 'generationTest.sh'.
La génération des fichiers est faite de telle sorte que l'ensemble des n points se trouvent entre 1 et n.

Vous trouverez les résultats des tests dans les fichiers csv, présents à la racine du projet.
