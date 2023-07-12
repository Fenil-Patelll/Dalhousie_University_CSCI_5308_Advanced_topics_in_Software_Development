package org.example.Controller;

public class Payment {
    int amount;
    double tax;
    double total;

    String date;

    public void makePayment(double amount){
        tax = calculateTax(amount);
        total = tax + amount;
        total = total - getDiscount(total);
    }
    double calculateTax(double amount){
        return amount * 0.15;
    }
    double getDiscount(double total){
        //complex condition && Magic number
        if(total >= 200 && total <= 500 && date.equals("12/04/2023")){
            return total * 0.05;
        }
        else if(total > 500){
            return total * 0.10;
        }
        return 0;
    }

    public double getPayment(){
        return total;
    }
}
