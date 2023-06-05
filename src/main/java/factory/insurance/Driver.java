package factory.insurance;

import factory.insurance.Insurance;
import factory.insurance.InsuranceFactory;

public class Driver {
    public static void main(String[] args) {

        Insurance i = InsuranceFactory.getInsurance("auto");
        System.out.println(i.getClass());
    }
}
