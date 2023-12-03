package Structuration.PatternDecorator.code;

public class Client {
    public static void main(String args[]) {
        Fenetre accueil = new FenetreSimple();
        DecorateurCurseurVertical decorateurFenetreVertical = new DecorateurCurseurVertical(accueil);
        DecorateurCurseurHorizontal decorateurFenetreHorizontal = new DecorateurCurseurHorizontal(accueil);

        System.out.println("Méthodes de la fenêtre simple :");
        accueil.decrire();
        accueil.dessiner();


        System.out.println("\n\nMéthodes du decorateur Horizontal :");
        decorateurFenetreHorizontal.decrire();
        decorateurFenetreHorizontal.dessiner();
        decorateurFenetreHorizontal.dessinerCurseurHorizontal();

        System.out.println("\n\nMéthodes du decorateur Vetical :");
        decorateurFenetreVertical.decrire();
        decorateurFenetreVertical.dessiner();
        decorateurFenetreVertical.dessinerCurseurVertical();

    }
}
