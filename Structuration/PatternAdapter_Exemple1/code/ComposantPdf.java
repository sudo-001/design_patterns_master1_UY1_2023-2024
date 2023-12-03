package Structuration.PatternAdapter_Exemple1.code;

import java.util.Objects;

public class ComposantPdf {
    private String content;

    public int pdfFixeContenu(String content) {
        this.content = content;
        return 1;
    }

    public int pdfPrepareAffichage() {
        if (Objects.equals(this.content, "")) {
            System.out.println("Le contenu de votre composant pdf est vide");
            return 0;
        }
        System.out.println("Prépation de l'affichage");
        return 1;
    }

    public int pdfRafraichir() {
        System.out.println("Rafraichissement");
        return 1;
    }

    public int pdfTermineAffichage() {
        System.out.println("Termine affichage");
        return 1;
    }

    public int pdfEnvoieImprimante() {
        if (Objects.equals(this.content, "")) {
            System.out.println("Le contenu de votre composant pdf est vide");
            return 0;
        }

        System.out.println("Content : " + this.content);
        return 1;
    }

}
