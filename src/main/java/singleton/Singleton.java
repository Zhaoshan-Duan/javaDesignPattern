package singleton;

public class Singleton {

    // class level instance
    private static Singleton instance;

    // private constructor
    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
