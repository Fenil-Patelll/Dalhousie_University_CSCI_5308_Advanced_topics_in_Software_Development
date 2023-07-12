package org.example;


import org.example.Controller.Appointment;
import org.example.Model.Doctor;
import org.example.Model.Patient;

import java.util.ArrayList;


public class Information{
    public ArrayList<Doctor> listOfDoctors = new ArrayList<>();
    public ArrayList<Patient> listOfPatients = new ArrayList<>();


    //Long parameter
    public void createDoctor(){
        Doctor doctor1 = new Doctor("1", "Fenil", "Cardiologist", "7978576571", "fenil@gamil.com");
        Doctor doctor2 = new Doctor("2", "Margin", "Encologist", "7978576453", "Margin@gamil.com");
        Doctor doctor3 = new Doctor("3", "Sarthak", "Neuro Surgeon", "7868768121", "Sarthak@gamil.com");

        listOfDoctors.add(doctor1);
        listOfDoctors.add(doctor2);
        listOfDoctors.add(doctor3);
    }

    public void createPatient(){
        Patient patient1 = new Patient("1", "Arpit", "9868577575", "arpit@gmail.com");
        Patient patient2 = new Patient("2", "kaka", "857468763", "kaka@gmail.com");

        Appointment appointment=new Appointment();
        appointment.creat4ePayment(1000);
        patient1.takeAppointment(listOfDoctors.get(0),patient1);
        listOfPatients.add(patient1);
        listOfPatients.add(patient2);
    }

}
