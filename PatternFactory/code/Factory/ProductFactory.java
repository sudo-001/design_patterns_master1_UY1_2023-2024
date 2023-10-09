public abstract class ProductFactory {
    protected abstract ProduitA createProduitA();

    /**
     * Get the instance of ProduitA.
     *
     * @return the instance of ProduitA
     */
    public ProduitA getProduitA() {
        return createProduitA();
    }
}
