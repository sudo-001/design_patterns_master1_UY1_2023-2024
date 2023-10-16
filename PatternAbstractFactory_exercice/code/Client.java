// package PatternAbstractFactory_exercice.code;
// package PatternAbstractFactory.code;

public class Client {
    public static void main(String args[]) {
        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();
        IProduitFactory produitFactory3 = new ProduitFactory3();

        ProduitA produitA = null;
        ProduitB produitB = null;

        System.out.println("Utilisation de la première fabrique");
        produitA = produitFactory1.getProduitA();
        produitB = produitFactory1.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("Utilisation de la deuxième fabrique");      
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("Utilisation de la troisième fabrique");      
        produitA = produitFactory3.getProduitA();
        produitB = produitFactory3.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
        
    }   
}
