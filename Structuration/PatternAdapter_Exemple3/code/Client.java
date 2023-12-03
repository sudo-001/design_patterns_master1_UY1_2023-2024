package Structuration.PatternAdapter_Exemple3.code;

public class Client {
    public static void main(String args[]) {
        Adapteur adapteur = new Adapteur();

        System.out.println("On met les côtés de notre rectangle à 2.2 donc 'l = 2.2' et 'L = 2.2'");
        adapteur.setCote(2.2);

        System.out.println("Aire calculée avec l'interface adaptée : A = "+adapteur.getAire());


        System.out.println("Périmètre calculé avec l'interface adaptée : P = " +adapteur.getPerimetre());


    }
}
