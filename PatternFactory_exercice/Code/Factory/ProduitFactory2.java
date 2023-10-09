public class ProduitFactory2 extends ProduitFactory {
    /**
     * Creates a new instance of `ProduitA` by returning a new instance of `ProduitA2`.
     *
     * @return a new instance of `ProduitA2`
     */
    @Override
    public ProduitA createProduitA() {
        return new ProduitA2();
    }
}
