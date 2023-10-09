public class ProduitFactory {
    public static final int TYPE_PRODUITA1 = 1;
    public static final int TYPE_PRODUITA2 = 2;

    /**
     * Retrieves the specified ProduitA based on the given typeProduit.
     *
     * @param typeProduit the type of ProduitA to retrieve
     * @return the retrieved ProduitA object
     */
    public ProduitA getProduitA(int typeProduit) {
        ProduitA produitA = null;

        switch (typeProduit) {
            case TYPE_PRODUITA1:
                produitA = new ProduitA1();
                break;
            case TYPE_PRODUITA2:
                produitA = new ProduitA2();
                break;
            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }

        return produitA;
    }
}
