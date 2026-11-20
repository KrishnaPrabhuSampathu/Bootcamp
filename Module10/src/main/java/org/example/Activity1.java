package org.example;

public class Activity1 {
    public static void main(String[] args) {

        // Creating an employee object
        Employee employee = new Employee();

        // Assigning the values to Name and Age
        employee.setName("Krishna");
        employee.setAge(35);

        // Printing the values of Name and Age
        IO.println("Name: " + employee.getName());
        IO.println("Age: " + employee.getAge());

        // Call introduce method
        employee.introduce();

    }
}
