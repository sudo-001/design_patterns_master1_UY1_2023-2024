package Structuration.PatternComposite_Exercice.code;

public class Client {
    public static void main(String args[]) {
        Component pdfFile = new PdfFile("Gang Of Four (GOF)");
        Component txtFile = new TxtFile("Rapport exposé INF 4057");
        Component htmlFile = new HtmlFile("index");
        Component dossier = new Repertoire("Mon Repertoire");

        System.out.println("Section des méthodes du fichier PDF : ");
        System.out.println("Description : ");
        pdfFile.decrire();
        System.out.println("Ajouter : ");
        pdfFile.ajouter(txtFile);
        System.out.println("Supprimer : ");
        pdfFile.supprimer(txtFile);
        System.out.println("Obtenir : ");
        pdfFile.obtenir(0);

        System.out.println("\n\nSection des méthodes du fichier TXT : ");
        System.out.println("Description : ");
        txtFile.decrire();
        System.out.println("Ajouter : ");
        txtFile.ajouter(txtFile);
        System.out.println("Supprimer : ");
        txtFile.supprimer(txtFile);
        System.out.println("Obtenir : ");
        txtFile.obtenir(0);

        System.out.println("\n\nSection des méthodes du fichier HTML : ");
        System.out.println("Description : ");
        htmlFile.decrire();
        System.out.println("Ajouter : ");
        htmlFile.ajouter(txtFile);
        System.out.println("Supprimer : ");
        htmlFile.supprimer(txtFile);
        System.out.println("Obtenir : ");
        htmlFile.obtenir(0);

        System.out.println("\n\nSection des méthodes du Répertoire : ");
        System.out.println("Description : ");
        dossier.decrire();
        System.out.println("Ajout d'un fichier Txt: ");
        dossier.ajouter(txtFile);
        System.out.println("Ajout d'un fichier Pdf: ");
        dossier.ajouter(pdfFile);
        System.out.println("Ajout d'un fichier Html: ");
        dossier.ajouter(htmlFile);
        System.out.println("Obtenir élément position 0 : ");
        dossier.obtenir(0).decrire();
        System.out.println("Supprimer le fichier Txt : ");
        dossier.supprimer(txtFile);
        System.out.println("Obtenir élément position 0 : ");
        dossier.obtenir(0).decrire();
        System.out.println("Obtenir élément position 1 : ");
        dossier.obtenir(1).decrire();


    }
}
