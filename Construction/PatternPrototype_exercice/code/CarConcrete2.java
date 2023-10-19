package Construction.PatternPrototype_exercice.code;

public class CarConcrete2 implements CarPrototype {
    private String name;
    private String color;

    public CarConcrete2(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public CarPrototype clone() {
        return new CarConcrete2(this.name, this.color);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void presentation() {
        System.out.println("> Name of the car : " + this.getName() + " | Color of the car : " + this.getColor());
    }
}
