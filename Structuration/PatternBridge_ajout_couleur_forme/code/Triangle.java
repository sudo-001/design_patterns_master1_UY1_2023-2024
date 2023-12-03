package Structuration.PatternBridge_ajout_couleur_forme.code;

public class Triangle extends Shape {
    Triangle(Color color) {super(color);}

    public void colorIt() {
        System.out.println("Triangle filled with ");
        color.fillColor();
    }
}
