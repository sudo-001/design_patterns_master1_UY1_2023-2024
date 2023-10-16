package Construction.PatternBuilder.code;

public abstract class MonteurPizza {
    protected Pizza pizza;

    public Pizza getPizza() {
        pizza.print();
        return this.pizza;
    }

    public void creerNouvellePizza() {
        this.pizza = new Pizza();
    }

    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();
}
