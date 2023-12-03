package Structuration.PatternAdapter_Exemple1.code;

import java.util.Objects;

public class DocumentHtml implements Document {
    private String content;

    public int setContenu(String contenu) {
        this.content = contenu;
        return 1;
    }

    public int dessine() {
        System.out.println("Dessin effectué");
        return 1;
    }

    public int imprime() {
        if (Objects.equals(this.content, "")) {
            return 0;
        }
        System.out.println("Content : " + this.content);
        return 1;
    }
}