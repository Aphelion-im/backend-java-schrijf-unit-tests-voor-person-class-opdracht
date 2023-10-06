package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringMagicTest {

    @Test
    @DisplayName("Should reverse a string")
        // Of je verandert de method naam in shouldReverseString en kun je @DisplayName weghalen
    void reverseString() {
        // Arrange
        String str = ("Hallo Novi");

        // Act
        String output = String.valueOf(StringMagic.reverseString(str));
        // Of:
        // String output = (StringMagic.reverseString(str)).toString();

        // Assert
        assertEquals("ivoN ollaH", output);
    }
}