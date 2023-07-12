package org.example.Model;

import org.example.Controller.Appointment;
import org.example.View.Person;

public class Patient {
    public String pid;
    public String name;
    public String phone;
    public String email;

    public Patient(String pid, String name, String phone, String email) {
        this.pid = pid;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void takeAppointment(Doctor doctor,Patient patient){
        Appointment appointment=new Appointment();
        appointment.makeAppointment(doctor,patient);
    }
}
