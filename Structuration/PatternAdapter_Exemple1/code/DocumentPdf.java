package Structuration.PatternAdapter_Exemple1.code;

import java.util.Objects;

public class DocumentPdf implements Document {
    private String content;
    ComposantPdf outilPdf = new ComposantPdf();

    public int setContenu(String content) {
        outilPdf.pdfFixeContenu(content);
        return 1;
    }

    public int dessine() {
        System.out.println("Dessin effectué");
        return 1;
    }

    public int imprime() {
        outilPdf.pdfEnvoieImprimante();
        return 1;
    }
}