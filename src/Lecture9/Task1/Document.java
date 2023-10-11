package Lecture9.Task1;

public abstract class Document {
    public static void returnFirstTwoDigitBlocks(StringBuilder documentNumber){
        documentNumber.delete(4,8);
        documentNumber.delete(9,21);
        System.out.println(documentNumber);
    }
    public static void replaceLettersToStars(StringBuilder documentNumber){
        documentNumber.replace(5,8, "***");
        documentNumber.replace(14,17, "***");
        System.out.println(documentNumber);
    }

    public static void onlyLettersLowRegister(StringBuilder documentNumber){
        documentNumber.delete(0,5).delete(3,9).delete(6,8);
        documentNumber.insert(3,"/").insert(7,"/").replace(9,10,"/");
        String temporary = String.valueOf(documentNumber);
        String newDocumentNumber = temporary.toLowerCase();
        System.out.println(newDocumentNumber);
    }
    public static void onlyLettersUpperRegister(StringBuilder documentNumber){
        documentNumber.delete(0,5).delete(3,9).delete(6,8);
        documentNumber.insert(3,"/").insert(7,"/").replace(9,10,"/");
        String temporary = String.valueOf(documentNumber);
        String temporary1 = temporary.toUpperCase();
        StringBuilder newDocumentNumber = new StringBuilder(temporary1);
        newDocumentNumber.insert(0,"Letter: ");
        System.out.println(newDocumentNumber);
        //честно говоря ощущение что код тут немного намудренный но вроде работает.
    }
    public static void checkIfStartsWithAbc(String documentNumber){
       String newDocumentNumber = String.valueOf(documentNumber.startsWith("ABC"));
       System.out.println(newDocumentNumber);
    }
    public static void checkIfStartsWith555(String documentNumber){
        String newDocumentNumber = String.valueOf(documentNumber.startsWith("555"));
        System.out.println(newDocumentNumber);
    }
    public static void checkIfEndsWith1a2b(String documentNumber){
        String newDocumentNumber = String.valueOf(documentNumber.endsWith("1a2b"));
        System.out.println(newDocumentNumber);
    }
}
