package factory.car;

public class Ford implements Car {

    private int year = 2013;

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public int getEngine() {
        return 1140;
    }
}
