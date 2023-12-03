package Structuration.PatternDecorator.code;

public class DecorateurCurseurHorizontal extends DecorateurFenetre {

    DecorateurCurseurHorizontal(Fenetre fenetre) {
        super(fenetre);
    }

    public void dessiner() {
        super.dessiner();
    }

    public void decrire() {
        super.decrire();
    }

    public void dessinerCurseurHorizontal() {
        System.out.println("Défilement horizontal de la fenêtre");
    }
}
