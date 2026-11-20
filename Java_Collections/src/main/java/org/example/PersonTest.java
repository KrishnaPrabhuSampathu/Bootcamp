package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;

    // Setup method
    @Before
    public void setUp() throws Exception{
        person = new Person();
    }

    // Teardown method
    @After
    public void tearDown() throws Exception{
        person = null;
    }

    // Test getters and setters
    @Test
    public void testGettersAndSetters() {

        person.setWeight(70);
        person.setHeight(1.75f);

        assertEquals(70, person.getWeight());
        assertEquals(1.75f, person.getHeight(), 0.001f);
    }

    // Test BMI classifications
    @Test
    public void testGetBMI() {

        // Underweight
        assertEquals("Underweight",
                person.getBodyMassIndex(50, 1.7));

        // Normal weight
        assertEquals("Normal weight",
                person.getBodyMassIndex(65, 1.7));

        // Overweight
        assertEquals("Overweight",
                person.getBodyMassIndex(80, 1.7));

        // Obese
        assertEquals("Obese",
                person.getBodyMassIndex(90, 1.7));
    }

    // Test invalid BMI inputs
    @Test
    public void testInvalidBMIInputs() {

        // Zero weight
        assertEquals("Invalid input",
                person.getBodyMassIndex(0, 1.7));

        // Negative weight
        assertEquals("Invalid input",
                person.getBodyMassIndex(-10, 1.7));

        // Weight greater than 600
        assertEquals("Invalid input",
                person.getBodyMassIndex(601, 1.7));

        // Zero height
        assertEquals("Invalid input",
                person.getBodyMassIndex(70, 0));

        // Negative height
        assertEquals("Invalid input",
                person.getBodyMassIndex(70, -1.7));

        // Height greater than 3.0
        assertEquals("Invalid input",
                person.getBodyMassIndex(70, 3.1));
    }

    // Test boundary values
    @Test
    public void testBMIBoundaryValues() {

        // Minimum valid weight
        assertEquals("Underweight",
                person.getBodyMassIndex(1, 1.7));

        // Maximum valid weight
        assertEquals("Obese",
                person.getBodyMassIndex(600, 1.0));

        // Maximum valid height
        assertEquals("Underweight",
                person.getBodyMassIndex(60, 3.0));
    }
}
