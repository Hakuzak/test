# TicTacToe

Le but de cette séquence est de concevoir un jeu de morpion (TicTacToe) en programmation dirigée par les tests (TDD).

*Le projet doit être dupliqué par chaque étudiant dans son espace de travail sur la forge. Ne pas oublier de mettre l'utilisateur `daniel.leberre` comme reporter dans le projet.*

*Pour intégrer ce projet dans Eclipse, le plus simple est de faire un `git clone` du projet dans votre compte personnel.*


## Etape 1 : les tests de base

Vous disposer de toutes les classes nécessaires à la création de l'application.

Il suffit de coder les conditions de terminaison du jeu (quand une ligne, une colonne ou une diagonale est remplie).

Le code doit être intégré dans la classe `TicTacToe`, aux endroits marqués par des `// TODO`.

Les tests sont écrits à l'aide de [JBehave](http://jbehave.org/) dans des fichiers texte dont l'extension est `.story`.

Les tests dont le nom contient `excluded` ne sont pour l'instant pas exécutés.

**Vous devez déposer votre travail sur gitlab à la fin de la séance : le fait que les tests passent sera validé par l'intégration continue de gitlab.**

## Etape 2 : gestion des cas pathologiques

Renommer le fichier `issues-excluded.story` en `issues.story`.

Ce fichier comporte des tests de situations incorrectes. Selon la façon dont vous avez écrit
votre code, il sera plus ou moins aisé de faire passer ces tests.

Quand ces tests passent, renommer le test `nowinner-excluded.story` en `nowinner.story` qui correspond 
à des cas où il n'y a pas de vainqueur.

Enfin, renommer le test `codebreaker-excluded.story` en `codebreaker.story` qui teste le cas particulier des diagonales.

**Vous devez déposer votre travail sur gitlab à la fin de la séance : le fait que les tests passent sera validé par l'intégration continue de gitlab.**

## Etape 3 : généralisation du code aux marques arbitraires

Renommer le fichier `othermarks-excluded.story` en `othermarks.story`. Ces tests indiquent que les marques utilisées pour le morpion sont arbitraires, du moment qu'il s'agit de deux symboles différents.

Modifier le code de votre application en conséquence.

**Vous devez déposer votre travail sur gitlab à la fin de la séance : le fait que les tests passent sera validé par l'intégration continue de gitlab.**