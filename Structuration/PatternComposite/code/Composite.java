package Structuration.PatternComposite.code;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> children = new ArrayList<Component>();

    public void operation1() {
        System.out.println("Operation 1: Je suis l'élément 'COMPOSITE'");
    }

    public void operation2() {
        System.out.println("Operation 2: Je suis l'élément 'COMPOSITE'");
    }

    public void addComponent(Component c) {
        this.children.add(c);
        System.out.println("Composant ajouté à la liste des enfants.");
    }

    public void removeComponent(Component c) {
        this.children.remove(c);
    }

    public Component getComponent(int i) {
        return this.children.get(i);
    }

    public int getComponentCount() {
        return this.children.size();
    }

}
