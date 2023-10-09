public abstract class ProduitFactory {
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
