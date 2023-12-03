package Structuration.PatternAdapter_Exemple2.code;

public class Client {

    public static void main(String args[]) {
        Stack dlistImpStak = new DListImpStack();

        System.out.println("Méthode push : ");
        dlistImpStak.push(10);

        System.out.println("Méthode top : ");
        System.out.println(dlistImpStak.top());

        System.out.println("Méthode pop : ");
        System.out.println(dlistImpStak.pop());

        System.out.println("Méthode top : ");
        System.out.println(dlistImpStak.top());
    }

}
