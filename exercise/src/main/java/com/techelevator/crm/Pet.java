package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    private String name, species;
    private List<String> vaccinations = new ArrayList<>();

    // constructor and so forth
    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // methods
    public String listVaccinations() {
        StringBuilder vaccine = new StringBuilder();
        for (String vaccination : vaccinations) {
            vaccine.append(vaccination).append(", ");
        }
        vaccine = new StringBuilder(vaccine.substring(0, vaccine.length() - 2));
        return vaccine.toString();
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getVaccinations() {
        return listVaccinations();
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }
}
