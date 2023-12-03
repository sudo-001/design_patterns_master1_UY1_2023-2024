package Structuration.PatternAdapter_Exemple3.code;

public class Adapteur extends ManipRectangle implements InterfaceCarre {

    ManipRectangle adapte = new ManipRectangle();

    public void setCote(double c) {
        adapte.DefinirParams(c,c);
    }

    public double getAire() {
        return adapte.getAire();
    }
    public double getPerimetre() {
        return adapte.getPerimetre();
    }

}
