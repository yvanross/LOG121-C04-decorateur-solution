
# Patron Décorateur

[Identifidation de l'étudiant](README-identification.md)

# Travail pratique à réaliser
1. Vous devez compléter le/les test(s) dans la classe RepasTest
1. repas.getCost() doit nécessairement utiliser un Itérateur 
2. Faire un diagramme de séquence de la fonction repasTest() en excluant les assert
3. Ajouter le détail de l'opération getCost() sur le mozzarella dans votre diagramme de séquence et démontrer la mécanique de décoration.
4. Ajouter le détail de l'opération repas.getCost() dans votre diagramme de séquence.
5. Insérer votre diagramme UML dans ce fichier

  
Voici un exemple de diagramme de séquence avec plantUML


![readme](https://www.plantuml.com/plantuml/svg/XPB1JiCm38RlUGghfp5j4boZgHhqjDk4TfjsCAbLXNL9bNYexEb9tK6W0dPnREVxdTzIrf4nyFdKgdYqhiE09uZytbAAmHgvILssndRe60hzJ1t67KKk02E4pmfMgse1VL-MFta1Hb4M97YpSKsWsfBZgQIpbmlgxH158lKD2J8owQqSeqZIf38jnaXJWR4SlDlRWwua4ytOLCiohwLpEhjJUTjbWiJNVAx114flpHxk5uMuxlk-cC9ItO1X63hwre2l_imKe5UgzRw3lV6kjcozEwZliykhRGqDySupjiae6hPlmvphIkEHOH2wyf4V_wLVqA6ZJ3ybkgQ_UH_GDVI5Lx_YYbojrYcap_K1 "readme")

```plantuml
skinparam style strictuml
participant ":RepasTest" as repasTest <<C, xx>>
participant "repas:Repas" as repas <<IIngredient>>
participant "pizza:Pizza" as pizza <<IIngredient>>
participant "patate:Patate" as patate <<classe>>
participant "citron[i]:Citron" as citron
-> repasTest: repasTest()
repasTest --> pizza**: create(10,"Pizzaxxx")
repasTest --> repas**: create(10,"Pizzaxxx")
repas -> patate : ajouter x

loop [condition]

repasTest -> citron: getTotal()
activate citron
citron -> citron : getCostA()
activate citron
citron -> banane : getCostB()
deactivate citron
citron -> orange: getCostC()
deactivate citron

end
```



