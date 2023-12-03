package Structuration.PatternAdapter_Exemple1.code;

public class ServeurWeb {
    public static void main(String args[]) {
        Document documentHtml = new DocumentHtml();
        Document documentPdf = new DocumentPdf();

        System.out.println("On initie le document HTML :");
        documentHtml.setContenu("<p>Ceci est le contenu du document Html</p>");
        documentHtml.dessine();
        documentHtml.imprime();

        System.out.println("\n\nOn initie le document PDF :");
        documentPdf.setContenu("Ceci est le contenu du document PDF que nous adaptons à notre système.");
        documentPdf.dessine();
        documentPdf.imprime();
    }
}
