package com.kodilla.stream.string.reverse;

public class StringReverse {

    public String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}