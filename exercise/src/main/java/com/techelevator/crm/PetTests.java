package com.techelevator.crm;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class PetTests {

    @Test
    public void properCommas () {
        // add a pet object
        Pet spot = new Pet("Spot", "Dog");

        // make list of vaccinations
        List<String> vax = new ArrayList<>();

        // add specific vaccinations to vax
        vax.add("Rabies");
        vax.add("B");
        vax.add("V");

        // sets spots vaccination list = vax
        spot.setVaccinations(vax);


        // Use assert compare the lists to the expected value
        Assert.assertEquals(spot.getVaccinations(), "Rabies, B, V");

    }
}
