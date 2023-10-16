package Construction.PatternBuilder_exercice.code;

public class MonteurPizzaReine extends MonteurPizza {
    public void monterPate() {
        pizza.setPate("croisée");
    }

    public void monterSauce() {
        pizza.setSauce("douce");
    }

    public void monterGarniture() {
        pizza.setGarniture("jambon+champignon");
    }

    public Pizza getPizza() {
        this.pizza.print();
        return this.pizza;
    }
}
