package Structuration.PatternAdapter.code;

public class Client {
    public static void main(String args[]) {
        Interface adapteur = new Adapteur();

        System.out.println("Utilisation de l'objet 'Adapteur' :");
        adapteur.service();
    }
}
