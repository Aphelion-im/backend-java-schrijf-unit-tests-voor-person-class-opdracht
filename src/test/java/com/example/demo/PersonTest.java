package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("Name should not be changed during creation")
    // Of je beschrijft de test met een duidelijke method name.
    public void nameShouldNotBeChangedDuringCreation() {

        // Arrange
        Person person = new Person("Pietje Puk");

        // Act
        String output = person.getName();

        // Assert
        assertEquals("Pietje Puk", output);
    }

    @Test
    public void personWithoutNameShouldBeNamedJohn() {
        // Arrange
        Person person = new Person();
        // Act
        String output = person.getName();
        // Assert
        assertEquals("John", output);
    }

    @Test
    public void ageShouldAddOneYear() {
        // Arrange
        Person person = new Person();
        person.setAge(40);
        person.age();
        // Act
        int output = person.getAge();
        // Assert
        assertEquals(41, output);
    }

    @Test
    public void lastNameShouldStartWithUpperCaseWhenLowercaseGiven() {
        // Arrange
        Person person = new Person();
        person.setLastName("vries");
        // Act
        String output = person.getLastName();
        // Assert
        assertEquals("Vries", output);
    }

    @Test
    public void givenAPartnerHasPartnerShouldReturnTrue() {
        // Arrange
        Person person = new Person();
        Person person2 = new Person();
        person.setPartner(person2);
        // Act
        boolean output = person.hasPartner();
        // Assert
        assertTrue(output);
    }

    @Test
    public void childShouldBeAddedToList() {
        // Arrange
        Person person = new Person("Kind 1");
        Person person2 = new Person("Kind 2");
        person.addChild(person2);
        // Act
        List<Person> output = person.getChildren();

        List<Person> expectedOutput = new ArrayList<>();
        expectedOutput.add(person2);

        // Assert
        assertArrayEquals(expectedOutput.toArray(), output.toArray());
    }

}