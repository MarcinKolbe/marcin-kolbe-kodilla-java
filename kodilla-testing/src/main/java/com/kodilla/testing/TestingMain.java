package com.kodilla.testing;

public class TestingMain {
    public static void main(String[] args) {
        String txt = "Zadanie dodatkowe: Poszukiwacz samogłosek";
        String vowels = "aąeęioóuyAĄEĘIOÓUY";
        StringBuilder newtxt = new StringBuilder();

        char[] charArray = txt.toCharArray();
        for (char c : charArray) {
            if(vowels.indexOf(c) != -1) {
                newtxt.append(c);
            }
        }
        System.out.println(newtxt);
    }
}
