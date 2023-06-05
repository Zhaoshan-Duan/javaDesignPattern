package factory.car;

public class Driver {
    public static void main(String[] args) {

        Car ford = CarFactory.getCar("ford");
        assert ford != null;
        System.out.println("Create a Ford Car object: " + ford.getMake());

        Car tesla = CarFactory.getCar("tesla");
        assert tesla != null;
        System.out.println("Create a Tesla object" + tesla.getMake());

        Car lexus = CarFactory.getCar("lexus");
        assert lexus != null;
        System.out.println("Create a Lexus object" + lexus.getMake());

    }
}
