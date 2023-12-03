package Structuration.PatternBridge_ajout_couleur.code;

public abstract class Shape {
    Color color;
    Shape(Color color) {
        this.color = color;
    }

    abstract public void colorIt();
}
