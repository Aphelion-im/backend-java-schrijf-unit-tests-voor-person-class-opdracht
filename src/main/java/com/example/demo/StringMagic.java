package com.example.demo;

public class StringMagic {

    public static StringBuilder reverseString(String word) {
        StringBuilder reversedStr = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            reversedStr.insert(0, word.charAt(i));
        }
        return reversedStr;
    }
}
