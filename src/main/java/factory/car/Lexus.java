package factory.car;

public class Lexus implements Car {

    private int year = 2023;

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public int getEngine() {
        return 1794;
    }
}
