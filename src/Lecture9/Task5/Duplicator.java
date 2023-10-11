package Lecture9.Task5;

public abstract class Duplicator {
    public static void duplicateEachLetter(String text){
        StringBuilder duplicatedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            char temp = text.charAt(i);
            duplicatedText.append(temp).append(temp);
        }
        String result = duplicatedText.toString();
        System.out.println(result);
    }
}
