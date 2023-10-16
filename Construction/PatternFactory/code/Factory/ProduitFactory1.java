package Construction.PatternFactory.code.Factory;

public class ProduitFactory1 extends ProductFactory {
    /**
     * Creates a new instance of `ProduitA` by returning a new instance of
     * `ProduitA1`.
     *
     * @return a new instance of `ProduitA1`
     */
    protected ProduitA createProduitA() {
        return new ProduitA1();
    }
}