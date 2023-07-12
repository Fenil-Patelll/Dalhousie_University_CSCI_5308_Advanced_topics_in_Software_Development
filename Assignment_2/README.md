
# Assignment_2 Part1






## Documentation

1. Implementation smells 
    - Complex Condition path - org/example/Controller/Payment/getDiscount;
      This smells occures because The conditional expression total >= 200 && total <= 500 && date.equals("12/04/2023") is complex.
    - Magic Number path -  org/example/Controller/Payment/getDiscount;
      This smells comes because The method contains a magic number: 200
    - Long Parameter path - org/example/Information/createDoctor;
      Thi is due to method having 5 parameters

2. Desing smells 
    - Cyclic hierachy path - org/example/Information;
      Cause - The tool detected the smell in this class because the class depends on one of its subclasses (creating cycle in the hierarchy). The class is dependent on the following subclass: Appointment
    - Deficient encapsulation  path - org/example/Information;
      The reason of this smell is beacuse The tool detected the smell in this class because the class exposes fields belonging to it with public accessibility. Following fields are declared with public accessiblity: did; name; department; phone; email
    - Multifaceted abstraction path - org/example/Controller/Appointment;
      Appointment Class is responsible to both taking an appointment and making a payment, so that is the reason of this smell.


3. Architecture smells 
    - Cyclic dependency path - org.example.Controller, path - org.example.Model;
      The main reason of this smell is The tool detected the smell in this component because this component participates in a cyclic dependency. The participating components in the cycle are: org.example.Controller; org.example.Model



