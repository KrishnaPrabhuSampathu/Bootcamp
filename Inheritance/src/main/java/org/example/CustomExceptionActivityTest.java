package org.example;

// This program accepts a user name and checks user's validity
// The user name is checked against an array of names.

public class CustomExceptionActivityTest {

    public static void main(String[] args) {

        // 1 - Type main method and call validateUser() from it.
        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();

        // Test valid usernames
        obj.validateUser("John");
        obj.validateUser("Mike");
        obj.validateUser("Shanti");
        obj.validateUser("Stacie");

        // Test invalid username
        obj.validateUser("Krishna");

    }

    void validateUser(String name) {

        // Array of valid users
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        // Flag stores 1 if a match is found else it should remain 0
        int flag = 0;

        for (int i = 0; i < 4; i++) {

            // 2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
            if (name.equals(validUsers[i])) {

                flag = 1;
                break;

            }
        }

        // 3 - Check if flag is zero, throw CustomExceptionActivity Exception.
        if (flag == 0) {

            try {

                throw new CustomExceptionActivity();

            } catch (CustomExceptionActivity e) {

                IO.println(e.getMessage());

            }

            // 4 - Else if flag is one, print a message "Welcome to Payroll program".
        } else if (flag == 1) {

            IO.println("Welcome to Payroll program");

        }

    }
}

