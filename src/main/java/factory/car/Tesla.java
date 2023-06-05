package factory.car;

public class Tesla implements Car {

    private int year = 2020;

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public int getEngine() {
        return 1302;
    }
}
