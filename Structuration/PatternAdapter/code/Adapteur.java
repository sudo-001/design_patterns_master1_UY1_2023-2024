package Structuration.PatternAdapter.code;

public class Adapteur extends Adaptee implements Interface{
    Adaptee adapte = new Adaptee();
    public int service() {
        adapte.Service_specific();
        return 1;
    }

}
