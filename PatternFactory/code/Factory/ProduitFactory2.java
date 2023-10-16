package PatternFactory.code.Factory;

public class ProduitFactory2 extends ProductFactory {
    /**
     * Creates a new instance of `ProduitA` by returning a new instance of `ProduitA2`.
     *
     * @return a new instance of `ProduitA2`
     */
    protected ProduitA createProduitA() {
        return new ProduitA2();
    }
}
