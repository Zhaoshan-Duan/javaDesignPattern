package factory.car;

public class CarFactory {

    public static Car getCar(String type) {

        return switch (type) {
            case "lexus" -> new Lexus();
            case "ford" -> new Ford();
            case "tesla" -> new Tesla();
            default -> null;
        };
    }
}
