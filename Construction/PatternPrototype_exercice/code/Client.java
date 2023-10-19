package Construction.PatternPrototype_exercice.code;

public class Client {
    public static void main(String args[]) {
        // Creation des prototypes
        CarPrototype car1 = new CarConcrete1("Mazda", "black");
        CarPrototype car2 = new CarConcrete2("Mustang", "brown");
        CarPrototype car3 = new CarConcrete2("Lexus", "blue");
        System.out.println("\n>>Les prototypes crées sont :");
        car1.presentation();
        car2.presentation();
        car3.presentation();


        // Clone des prototypes
        CarPrototype clone_car1 = car1.clone();
        CarPrototype clone_car2 = car2.clone();
        CarPrototype clone_car3 = car3.clone();
        System.out.println("\n\n>>Les clones sont :");
        clone_car1.presentation();
        clone_car2.presentation();
        clone_car3.presentation();


        // Modification des clones
        clone_car1.setName("Mazda 2000");
        clone_car1.setColor("purple");
        clone_car2.setName("Advancis");
        clone_car2.setColor("white");
        clone_car3.setName("Lotus");
        clone_car3.setColor("pink");
        System.out.println("\n\n>>Les clones après modifications de leur valeurs sont :");
        clone_car1.presentation();
        clone_car2.presentation();
        clone_car3.presentation();
    }
}
