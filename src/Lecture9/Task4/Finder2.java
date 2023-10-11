package Lecture9.Task4;

import java.util.Scanner;

public abstract class Finder2 {
    public static void distinguishIfTheWordIsPalindrome(String input){
        String[] words = input.split("\\s+");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the word to check if it is a palindrome: ");

        if (sc.hasNext()) {
            int enteredNumber = sc.nextInt();
            if (enteredNumber >= 0 && enteredNumber <= words.length - 1) {
                StringBuilder word = new StringBuilder(words[enteredNumber]);
                String reversedWord = String.valueOf(word.reverse());
                if (reversedWord.equals(words[enteredNumber])) {
                    System.out.println("The word " + words[enteredNumber] + " is palindrome.");
                } else {
                    System.out.println("The word " + words[enteredNumber] + " is not a palindrome.");
                }
            }
            else {
                System.out.println("Please enter only number of word that exists in the sentence.");
            }
        }
        else {
            System.out.println("Please enter only numbers.");
        }
    }
}
