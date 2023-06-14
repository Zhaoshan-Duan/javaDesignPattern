package dependency_injection;

public class Driver {

    public static void main(String[] args) {

        Wheel w = new Wheel();
        AdvancedWheel a = new AdvancedWheel();

        Car c1 = new Car(w);
        c1.move();

        Car c2 = new Car(a);
        c2.move();
    }
}
