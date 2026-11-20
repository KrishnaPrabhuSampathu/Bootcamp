package org.example;

public class InheritanceActivity {

    public static void main(String[] args) {

        // Create Person_I object
        Person_I myPerson = new Person_I();

        myPerson.setName("Krishna Prabhu");
        myPerson.setAge(35);

        IO.println("-----------------------------");

        // Create Employee_I object
        Employee_I myEmployee = new Employee_I();

        // Set parent class attributes
        myEmployee.setName("Krishna");
        myEmployee.setAge(35);

        // Set child class attributes
        myEmployee.setSalary(100000.00);
        myEmployee.setTitle("QA");

        // Print Info using Employee object
        IO.println("-----------------------------");

        IO.println("Employee's Name is   : " + myEmployee.getName());
        IO.println("Employee's Age is    : " + myEmployee.getAge());
        IO.println("Employee's Title is  : " + myEmployee.getTitle());
        IO.println("Employee's Salary is : " + myEmployee.getSalary());

        // Print Info using Person object
        IO.println("-----------------------------");

        IO.println("Person's Name is    : " + myPerson.getName());
        IO.println("Person's Age is     : " + myPerson.getAge());
    }
}