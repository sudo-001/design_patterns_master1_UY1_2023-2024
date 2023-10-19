package Construction.PatternPrototype.code;

public class ConcretPrototype1 implements Prototype {
    String name;

    public ConcretPrototype1(String value) {
        this.name = value;
    }

    public Prototype clone() {
        return new ConcretPrototype1(this.name);
    }

    public void presentation() {
        System.out.println("Hello je suis : " + this.getName());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
