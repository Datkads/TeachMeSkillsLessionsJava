package Lecture9.Task2;

public abstract class Finder {

    public static void findTheShortestOne (String input){
        String[] words = input.split("\\s+");
        String shortestWord = "";

        for (String word: words) {
            if (!word.isEmpty()){
                if (shortestWord.isEmpty() || word.length() < shortestWord.length()){
                    shortestWord = word;
                }
            }
        }
        System.out.println("The shortest word is " + shortestWord);
    }
    public static void findTheLongestOne (String input){
        String[] words = input.split("\\s+");
        String longestWord = "";

        for (String word: words) {
            if (!word.isEmpty()){
                if (longestWord.isEmpty() || word.length() >= longestWord.length()){
                    longestWord = word;
                }
            }
        }
        System.out.println("The longest word is " + longestWord);
    }
}
