package Construction.PatternBuilder_exercice.code;

public abstract class MonteurPizza {
    protected Pizza pizza;

    public abstract Pizza getPizza();
    public void creerNouvellePizza() {
        this.pizza = new Pizza();
    }

    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();
}
