package PatternBuilder_exercice.code;

public class MonteurPizzaLocale extends MonteurPizza {
    public void monterPate() {
        pizza.setPate("Feuille de macabo");
    }

    public void monterSauce() {
        pizza.setSauce("Sauce jaune");
    }

    public void monterGarniture() {
        pizza.setGarniture("Escargots");
    }

    public Pizza getPizza() {
        this.pizza.print();
        return this.pizza;
    }
}
