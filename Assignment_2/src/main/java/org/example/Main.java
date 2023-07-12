package org.example;

import org.example.Controller.Payment;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Doctor Information: ");
        Information information = new Information();


        information.createDoctor();
        information.createPatient();

        System.out.println(information.listOfDoctors.get(0).getName());

    }
}