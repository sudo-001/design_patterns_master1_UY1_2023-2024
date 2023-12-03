package Structuration.PatternAdapter_Exemple3.code;

public class ManipRectangle {
    private double longueur;
    private double largeur;

    public void DefinirParams(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getAire() {
        return this.longueur * this.largeur;
    }

    public double getPerimetre() {
        return 2*(this.longueur + this.largeur);
    }
}
