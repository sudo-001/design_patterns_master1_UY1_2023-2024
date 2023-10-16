package Construction.PatternBuilder.code;

public class Client {

    public static void main(String args[]) {
        MonteurPizza monteurPizzaReine = new MonteurPizzaReine();
        MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
        Directeur directeur= null;

        System.out.println(">>>>Procédure avec le monteur de pizza Reine");
        directeur = new Directeur(monteurPizzaReine);
        directeur.construire();

        System.out.println("\n\n>>>>Procédure avec le monteur de pizza Piquante");
        directeur = new Directeur(monteurPizzaPiquante);
        directeur.construire();
        
    }
}
