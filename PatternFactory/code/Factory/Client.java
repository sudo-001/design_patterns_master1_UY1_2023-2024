package PatternFactory.code.Factory;

public class Client {
    /**
     * Executes the main function of the Java program.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ProductFactory produitFactory1 = new ProduitFactory1();
        ProductFactory produitFactory2 = new ProduitFactory2();

        ProduitA produitA = null;

        System.out.println("Utilisation de la première fabrique");
        produitA = produitFactory1.getProduitA();
        produitA.methodA();

        System.out.println("Utilisation de la deuxième fabrique");
        produitA = produitFactory2.getProduitA();
        produitA.methodA();

    }
}
