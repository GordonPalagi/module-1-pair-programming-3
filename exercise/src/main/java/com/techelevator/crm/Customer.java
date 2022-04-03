package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

    private String phoneNumber;
    private List<Pet> pets;


    // constructors
    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
        pets = new ArrayList<>();
    }

    public Customer (String firstName, String lastName) {

        phoneNumber = "";
    }

    // implemented methods
    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double total = 0;
        for (Map.Entry<String, Double> balance:
                servicesRendered.entrySet()) {
            total += balance.getValue();
        }
        return total;
    }

    // getters and setters
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
