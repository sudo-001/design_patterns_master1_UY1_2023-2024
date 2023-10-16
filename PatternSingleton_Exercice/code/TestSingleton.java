package PatternSingleton_Exercice.code;

public class TestSingleton {
    public static void main(String args[]) {
        int som = Singleton.getInstance().somme(2, 5);
        float moy = Singleton.getInstance().moyenne(2, 5);
        float mul = Singleton.getInstance().multiplication(2, 5);
        float sous = Singleton.getInstance().soustraction(2, 5);

        System.out.printf("La somme est %d\n", som);
        System.out.printf("La moyenne est %f\n", moy);
        System.out.printf("La multiplication est %f\n", mul);
        System.out.printf("La soustraction est %f\n", sous);

        Singleton s1 = Singleton.getInstance(8, 3);
        s1.affiche();

        Singleton s2 = Singleton.getInstance(5, 9);
        s2.affiche();
    }
}
