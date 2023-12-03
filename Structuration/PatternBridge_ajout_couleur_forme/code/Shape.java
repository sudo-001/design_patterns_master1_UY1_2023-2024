package Structuration.PatternBridge_ajout_couleur_forme.code;

public abstract class Shape {
    Color color;
    Shape(Color color) {
        this.color = color;
    }

    abstract public void colorIt();
}
