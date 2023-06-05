package singleton;

public class Singleton {

    // class level instance
    private static Singleton instance = new Singleton();

    // private constructor
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
