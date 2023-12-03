package Structuration.PatternComposite_Exercice.code;

public interface Component {
    public void decrire();
    public void ajouter(Component c);
    public boolean supprimer(Component c);
    public Component obtenir(int i);
}
