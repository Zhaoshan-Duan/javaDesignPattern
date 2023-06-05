package factory.car;

public interface Car {

    int getYear();

    int getEngine();

    default String getMake() {
        return getClass().toString();
    }
}
