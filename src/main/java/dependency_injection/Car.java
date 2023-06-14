package dependency_injection;

public class Car {

    private Wheel wheel; // dependency

    // Dependency Injection
    public Car(Wheel wheel){
        // this.wheel = new Wheel();
        this.wheel = wheel;
    }

    public void move() {
        wheel.rotate();
    }
}
