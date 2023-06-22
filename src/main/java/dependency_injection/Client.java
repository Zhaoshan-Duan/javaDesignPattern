package dependency_injection;

public class Client {

    public static void main(String[] args) {

        Wheel w = new Wheel();
        AdvancedWheel a = new AdvancedWheel();

        GoodYearWheel gy = new GoodYearWheel();
        YokohamaWheel yw = new YokohamaWheel();

        Car c1 = new Car(w);
        c1.move();

        Car c2 = new Car(a);
        c2.move();
    }
}
