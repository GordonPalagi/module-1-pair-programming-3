package com.techelevator.hr;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.",employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.",100, employee.getSalary(),0.0);
    }

    @Test
    public void employeeBalance() {
        // create the customer object
        Employee john = new Employee("John", "Soandso");

        // create new map to pass to the customer for their getBalance method
        HashMap<String, Double> test = new HashMap<>();

        // populate test map
        test.put("Walking", 34.00);
        test.put("Sitting", 100.00);
        test.put("Grooming", 10.00);

        // compare the customers getBalanceDue method with expected
//        assertEquals(john.getBalanceDue(test), 127.00);
    }
}

