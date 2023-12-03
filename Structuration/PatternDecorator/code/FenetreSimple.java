package Structuration.PatternDecorator.code;

public class FenetreSimple implements  Fenetre {
    public void decrire() {
        System.out.println("Description de la fenêtre");
    }

    public void dessiner() {
        System.out.println("Dessin fenêtre");
    }
}
