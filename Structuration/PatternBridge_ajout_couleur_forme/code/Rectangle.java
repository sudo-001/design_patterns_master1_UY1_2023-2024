package Structuration.PatternBridge_ajout_couleur_forme.code;

public class Rectangle extends Shape {
    Rectangle (Color color) {
        super(color);
    }

    public void colorIt(){
        System.out.println("Rectangle filled with ");
        color.fillColor();
    }
}
