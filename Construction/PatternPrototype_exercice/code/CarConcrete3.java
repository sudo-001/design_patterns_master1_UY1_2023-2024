package Construction.PatternPrototype_exercice.code;

public class CarConcrete3 {
    private String name;
    private String color;

    public CarConcrete3(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public CarPrototype clone() {
        return new CarConcrete1(this.name, this.color);
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void presentation() {
        System.out.println("> Name of the car : " + this.getName() + " | Color of the car : " + this.getColor());
    }
}
