package PatternBuilder.code;

public abstract class MonteurPizza {
    protected Pizza pizza;

    public void getPizza() {
        pizza.print();
    }

    public void creerNouvellePizza() {
        this.pizza = new Pizza();
    }

    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();
}
