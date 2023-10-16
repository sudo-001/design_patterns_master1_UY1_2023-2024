package PatternBuilder_exercice.code;

public class MonteurPizzaPiquante extends MonteurPizza {
    public void monterPate() {
        pizza.setPate("feuilletée");
    }

    public void monterSauce() {
        pizza.setSauce("piquante");
    }

    public void monterGarniture() {
        pizza.setGarniture("pepperoni+salami");
    }

    public Pizza getPizza() {
        this.pizza.print();
        return this.pizza;
    }
}
