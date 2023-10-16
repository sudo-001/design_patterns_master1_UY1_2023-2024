// package PatternAbstractFactory_exercice.code;
// package PatternAbstractFactory.code;

public class ProduitFactory3 implements IProduitFactory {
    public ProduitA getProduitA() {
        return new ProduitA3();
    }
    
    public ProduitB getProduitB() {
        return new ProduitB3();
    }
    
}
