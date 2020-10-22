package com.company;

import java.util.Stack;

public class Palindrome {

    public boolean isPalindrome(String text) {

        Stack<String> original = new Stack<String>();
        Stack<String> reverse = new Stack<String>();

        // build original stack
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            String letterAsString = String.valueOf(letter);
            original.push(letterAsString);
        }

        int midPoint = 0;
        midPoint = text.length() / 2;

        // collect and pop half of them off
        for (int i = 0; i < midPoint; i++) {
            reverse.push(original.pop());
        }

        // pop off middle letter due to odd length string
        if (text.length() % 2 != 0) {
            original.pop();
            System.out.println("Odd...");
        }

        // compare
        for (int i = 0; i < midPoint; i++) {
            String orig = original.pop();
            String rev = reverse.pop();
            System.out.println(i + " " + orig + " " + rev);
            if (!orig.equals(rev)) {
                return false;
            }
        }

        return true;
    }


}
