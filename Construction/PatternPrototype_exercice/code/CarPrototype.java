package Construction.PatternPrototype_exercice.code;

public interface CarPrototype {
    public CarPrototype clone();
    String getName();
    String getColor();
    void setName(String name);
    void setColor(String color);
    public void presentation();
}
