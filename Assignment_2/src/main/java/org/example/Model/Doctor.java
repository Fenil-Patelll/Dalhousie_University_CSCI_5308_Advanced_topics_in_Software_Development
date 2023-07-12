package org.example.Model;

import org.example.View.Person;

public class Doctor extends Person {
    public String did;
    public String name;
    public String department;
    public String phone;
    public String email;

    public Doctor(String did, String name, String department, String phone, String email) {
        this.did = did;
        this.name = name;
        this.department = department;
        this.phone = phone;
        this.email = email;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

}
