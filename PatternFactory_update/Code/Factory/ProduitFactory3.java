public class ProduitFactory3 extends ProduitFactory {
    /**
     * Creates a new instance of `ProduitA` by returning a new instance of `ProduitA3`.
     *
     * @return a new instance of `ProduitA3`
     */
    @Override
    public ProduitA createProduitA() {
        return new ProduitA3();
    }
}
