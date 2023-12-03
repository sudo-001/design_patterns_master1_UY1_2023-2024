package Structuration.PatternDecorator.code;

public class DecorateurFenetre implements Fenetre {

    protected Fenetre fenetreDecoree;

    DecorateurFenetre(Fenetre fenetre) {
        this.fenetreDecoree = fenetre;
    }

    public void dessiner() {
        this.fenetreDecoree.dessiner();
    }

    public void decrire() {
        this.fenetreDecoree.decrire();
    }
}
