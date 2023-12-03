package Structuration.PatternDecorator.code;

public class DecorateurCurseurVertical extends DecorateurFenetre {

    DecorateurCurseurVertical(Fenetre fenetre) {
        super(fenetre);
    }
    public void decrire() {
        super.decrire();
    }

    public void dessiner() {
        super.dessiner();
    }

    public void dessinerCurseurVertical() {
        System.out.println("Défilement vertical de la fenêtre");
    }

}
