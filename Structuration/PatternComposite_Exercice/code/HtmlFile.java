package Structuration.PatternComposite_Exercice.code;

public class HtmlFile implements Component {
    private String nom;
    private String type;

    HtmlFile(String nom) {
        this.nom = nom;
        this.type = "html";
    }

    public void decrire() {
        System.out.println("nom : " + this.nom + ", type : "+this.type);
    }

    public void ajouter(Component c) {
        System.out.println("Impossible d'ajouter un Composant car il s'agit d'un "+this.type);
    }

    public boolean supprimer(Component c) {
        System.out.println("Impossible de supprimer un Composant car il s'agit d'un "+this.type);
        return false;
    }

    public Component obtenir(int i) {
        System.out.println("Impossible d'obtenir un Composant car il s'agit d'un "+this.type);
        return null;
    }
}
