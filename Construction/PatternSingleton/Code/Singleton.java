public final class Singleton {
    private static Singleton instance = null;

    private int x;
    private int y;

    private Singleton() {
        super();
    }

    private Singleton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance(int x, int y) {
        if (instance == null) {
            instance = new Singleton(x, y);
        }
        return instance;
    }

    public int somme(int x, int y) {
        return x+y;
    }

    public float moyenne(int x, int y) {
        return somme(x, y)/2;
    }

    public void affiche() {
        System.out.println("\n Je suis une instance mes valeurs sont : x = " + this.x + " et y = " + this.y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
