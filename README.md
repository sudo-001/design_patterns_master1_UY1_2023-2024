# design_patterns_master1_UY1_2023-2024
Dépôt de tout les design patterns implémenté en Master 1 à l'université de yaoundé 1 pour le compte de l'année académique 2023-2024

# C'est quoi les design patterns ?
Les **design patterns**, en français **patrons de conception**, peuvent être définis comme étant un ensemble de solutions connues et éprouvées dont la conception provient de l'expérience de programmeurs.

# Structure du repo
```
   Categorie de design pattern
      - pattern générique
         -code ( contient des fichiers de code java )
         -model ( contient un pdf décrivant le model générique et le diagramme qui l'illustre )
      - pattern version exercice
         -code ( contient des fichiers de code java )
         -model ( contient un pdf décrivant le model du pattern appliqué à l'exercice et le diagramme qui l'illustre )
      ...

```
      
# Pour lancer un design pattern suivez ces étapes
1. Clonez le dépôt
2. ouvrez un terminal à l'emplacement du clone
3. Assurez vous d'avoir, installé sur votre machine la jdk que vous pouvez télécharger ici https://www.oracle.com/java/technologies/downloads/
4. Diriger vous vers le dossier désignant une catégorie de design patterns, par exemple celui de **construction**
   ```
      cd construction/
   
   ```
5. Dirigez vous vers le dossier d'un design pattern, ensuite dans le dossier code de ce design pattern, par exemple pour le pattern factory faire : 
   ```
   cd PatternFactory/code/Factory/
   
   ```
6. Ensuite tapez la commande suivante dans votre terminal:
   ```
   javac Client.java && java Client

   ```
