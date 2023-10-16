public class Client {
    /**
     * Executes the main function of the Java program.
     *
     * @param  args  the command line arguments
     */
    public static void main(String args[]) {
        ProduitFactory produitFactory1 = new ProduitFactory1();
    ProduitFactory produitFactory2 = new ProduitFactory2();
    ProduitFactory produitFactory3 = new ProduitFactory3();

    ProduitA produitA = null;

    System.out.println("Utilisation de la première fabrique");
    produitA = produitFactory1.getProduitA();
    produitA.methodA();

    System.out.println("Utilisation de la deuxième fabrique");
    produitA = produitFactory2.getProduitA();
    produitA.methodA();

    System.out.println("Utilisation de la troisième fabrique");
    produitA = produitFactory3.getProduitA();
    produitA.methodA();
    }
}
