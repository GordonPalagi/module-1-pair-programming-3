package com.techelevator.crm;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.HashMap;

public class CustomerTest {

    @Test
    public void customerBalance() {

        // create the customer object
        Customer john = new Customer("John", "Soandso");

        // create new map to pass to the customer for their getBalance method
        HashMap<String, Double> test = new HashMap<>();

        // populate test map
        test.put("Walking", 34.00);
        test.put("Sitting", 100.00);
        test.put("Grooming", 10.00);

        // compare the customers getBalanceDue method with expected
        Assert.assertEquals(john.getBalanceDue(test), 144.00);
    }

}

