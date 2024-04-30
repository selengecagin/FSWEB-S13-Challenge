package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    Company company = new Company(1,"ABC",50000.0,new String[]{"John", "Emma", "Michael"});

    HealthPlan healthPlan = new HealthPlan(2,"allianz", Plan.PREMIUM);


}
