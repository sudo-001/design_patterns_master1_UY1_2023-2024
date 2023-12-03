package Structuration.PatternComposite_Exercice.code;

import java.util.ArrayList;
import java.util.List;

public class Repertoire implements Component {
    private String nom;
    private String type;
    List<Component> sous_repertoires = new ArrayList<>();

    Repertoire(String nom) {
        this.nom = nom;
        this.type = "dossier";
    }

    public void decrire() {
        System.out.println("nom : " + this.nom + ", type : "+this.type);
    }

    public void ajouter(Component c) {
        this.sous_repertoires.add(c);
        System.out.println("Fichier ajouté ");
    }

    public boolean supprimer(Component c) {
        return this.sous_repertoires.remove(c);
    }

    public Component obtenir(int i) {
        return this.sous_repertoires.get(i);
    }
}
