package Construction.PatternPrototype.code;

public class Client {
    public static void main(String args[]) {
        // Creation des prototypes
        ConcretPrototype1 concretPrototype1 = new ConcretPrototype1("Concret un");
        ConcretPrototype2 concretPrototype2 = new ConcretPrototype2("Concret deux");
        System.out.println("\n>>Les prototypes crées sont :");
        concretPrototype1.presentation();
        concretPrototype2.presentation();

        // Clone des prototypes
        Prototype clone_concretPrototype1 = concretPrototype1.clone();
        Prototype clone_concretPrototype2 = concretPrototype2.clone();
        System.out.println("\n\n>>Les clones sont :");
        clone_concretPrototype1.presentation();
        clone_concretPrototype2.presentation();

        // Modification des clones
        clone_concretPrototype1.setName("Concret un modifié");
        clone_concretPrototype2.setName("Concret deux modifié");
        System.out.println("\n\n>>Les clones après modifications de leur valeurs sont :");
        clone_concretPrototype1.presentation();
        clone_concretPrototype2.presentation();
    }
}
