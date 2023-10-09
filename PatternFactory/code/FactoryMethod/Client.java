public class Client {
    /**
     * Executes the main function of the Java program.
     *
     * @param  args  the command line arguments
     */
    public static void main(String args[]) {
        ProduitFactory produitFactory = new ProduitFactory();
        ProduitA produitA = null;

        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodA();

        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodA();

        produitA = produitFactory.getProduitA(3);
        produitA.methodA();
    }
}
