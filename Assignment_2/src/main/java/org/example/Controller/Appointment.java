package org.example.Controller;

import org.example.Information;
import org.example.Model.Doctor;
import org.example.Model.Patient;

//multifaced abrastaction
public class Appointment extends Information {
    public void makeAppointment(Doctor doctor, Patient patient){
        System.out.println("The patient " + patient.getName() + " has been appointed to " + doctor.getName());
    }
    public void creat4ePayment(double amount){
        Payment payment=new Payment();
        payment.makePayment(amount);
        System.out.println(payment.getPayment());
    }
}
