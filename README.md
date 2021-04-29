
# Patron Décorateur

# Identification des étudiant

Veuillez éditer ce fichier et mettre l'information à jours.

Assurez vous d'utiliser toujours le même compte github pour accéder à ce projet.


## Membre #1
- <nomComplet1>Entrer votre nom</nomComplet1>
- <courriel1>Entrer votre courriel</courriel1>
- <codeMoodle1>Entrer votre code moodle obtenu à partir de Signet</codeMoodle1>
- <githubAccount1>Enter l'identifiant de votre compte github</githubAccount1>

## Membre #2
- <nomComplet2>Entrer votre nom</nomComplet2>
- <courriel2>Entrer votre courriel</courriel2>
- <codeMoodle2>Entrer votre code moodle obtenu à partir de Signet</codeMoodle2>
- <githubAccount2>Enter l'identifiant de votre compte github</githubAccount2>

## Membre #3
- <nomComplet3>Entrer votre nom</nomComplet3>
- <courriel3>Entrer votre courriel</courriel3>
- <codeMoodle3>Entrer votre code moodle obtenu à partir de Signet</codeMoodle3>
- <githubAccount3>Enter l'identifiant de votre compte github</githubAccount3>

## Membre #4
- <nomComplet4>Entrer votre nom</nomComplet4>
- <courriel4>Entrer votre courriel</courriel4>
- <codeMoodle4>Entrer votre code moodle obtenu à partir de Signet</codeMoodle4>
- <githubAccount4>Enter l'identifiant de votre compte github</githubAccount4>

# Configuration
Ce projet est configuré pour utiliser JDK-16
https://www.oracle.com/java/technologies/javase-jdk16-downloads.html

## Travail pratique à réaliser
1. Vous devez enlever les commentaires et faire les modifications nécessaires dans le code et dans le fichier de test RepasTest.java pour faire passer
celui-ci et calculer le cout total du repas.   
1. repas.getCost() doit nécessairement utiliser un <u>Itérateur</u> 
2. repas.getDescription() doit nécessairement utiliser un <u>Itérateur</u> 
3. Faire un diagramme de classe
4. Faire un diagramme de séquence de la fonction repasTest() en excluant les assert
5. Votre diagramme de séquence doit démontrer l'utilisation de l'itérateur pour l'opération getCost() seulement.

  
## Diagramme de classe
Insérer votre diagramme ici

Diagramme extrait des projets précédents.... 
![DCL](src/main/java/Decorateur/Repas/README-generated/Diagramme%20de%20classe.svg)
## Diagramme de séquence du test RapasTest.java

![initialisation](README/DS-initialisation.svg)
![getCost](README/DS-getCost.svg)





Je vous suggère d'éditer les diagrammes dans le fichier README.puml. Utiliser le menu contextuel "Export current file diagrams" qui exportera les fichier svg dans le répertoir out. Vous n'avez qu'a mettre les liens approprié dans ce fichier et vous avez vos diagramme dans votre readme.  Cette méthode facilite grandement la mise à jours des diagrammes et de ce fichier et permet la visualisation complète du fichier REAME.md sur github à l'aide d'un navigateur.

java -jar plantuml-dependency-cli-1.4.0-jar-with-dependencies.jar -o src/main/java/Decorateur/Repas/README-generated.puml -b . -i **/Decorateur/**/*.java  -v