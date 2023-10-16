package Construction.PatternBuilder.code;

public class Directeur {
    private MonteurPizza monteur;

    Directeur(MonteurPizza monteur) {
        this.monteur = monteur;
    }

    public void construire() {
        monteur.creerNouvellePizza();

        monteur.monterPate();
        monteur.monterSauce();
        monteur.monterGarniture();

        monteur.getPizza();
    }
}
