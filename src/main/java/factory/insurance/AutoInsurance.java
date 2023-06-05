package factory.insurance;

public class AutoInsurance implements Insurance {

    public void getQuote() {
        System.out.println("Getting quote");
    }

    public void payment() {
        System.out.println("Getting next payment");
    }

    public void addMember() {
        System.out.println("Adding member");
    }

    public void creditCheck() {
        System.out.println("Checking credit");
    }
}
