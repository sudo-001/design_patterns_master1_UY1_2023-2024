public class ProduitFactory1 extends ProduitFactory {
    /**
     * Creates a new instance of `ProduitA` by returning a new instance of `ProduitA1`.
     *
     * @return a new instance of `ProduitA1`
     */    @Override
    public ProduitA createProduitA() {
        return new ProduitA1();
    }
}