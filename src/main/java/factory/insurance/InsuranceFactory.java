package factory.insurance;

public class InsuranceFactory {
    public static Insurance getInsurance(String type) {
        return switch (type) {
            case "auto" -> new AutoInsurance();
            case "renter" -> new RenterInsurance();
            default -> null;
        };
    }
}
