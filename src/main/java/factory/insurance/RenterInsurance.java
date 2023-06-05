package factory.insurance;

import factory.insurance.Insurance;

public class RenterInsurance implements Insurance {

    @Override
    public void creditCheck() {
        System.out.println("Renter Insurance Credit Check");
    }

    @Override
    public void getQuote() {
        System.out.println("Renter Insurance quote");
    }

    @Override
    public void payment() {
        System.out.println("Getting Insurance payment.");

    }
}
