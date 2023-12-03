package Structuration.PatternComposite.code;

public class Client {
   public static void main(String args[]) {
       Leaf leaf = new Leaf();
       Leaf leaf2 = new Leaf();
       Leaf leaf3 = new Leaf();
       Composite composite = new Composite();


       System.out.println("Operation 1 du composant leaf : ");
       leaf.operation1();
       System.out.println("Operation 2 du composant leaf : ");
       leaf.operation2();



       System.out.println("\n\nOperation 1 du composite : ");
       composite.operation1();
       System.out.println("Operation 2 du composite : ");
       composite.operation2();

       System.out.println("\n\nAjout du premier enfant leaf : ");
       composite.addComponent(leaf);
       System.out.println("Ajout du deuxième enfant leaf2 : ");
       composite.addComponent(leaf2);
       System.out.println("Ajout du troisième enfant leaf3 : ");
       composite.addComponent(leaf3);

       System.out.println("\nOn compte le nombre total de component dans la liste des enfants du composite avant la suppréssion : nbre = "+composite.getComponentCount());


       System.out.println("\nOn recupère l'enfant de type Component qui est à la position 1 : ");
       composite.getComponent(1);

       System.out.println("\nOn supprime l'élément 'leaf2' de type Component qui est à la position 1 : ");
       composite.removeComponent(leaf2);

       System.out.println("\nOn compte le nombre total de component dans la liste des enfants du composite après la suppréssion "+composite.getComponentCount());

   }
}
