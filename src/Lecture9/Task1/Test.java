package Lecture9.Task1;

public class Test {
    public static void main(String[] args) {
    StringBuilder number = new StringBuilder("8644-GTv-6764-gFF-5T6y");
    Document.returnFirstTwoDigitBlocks(number);

    StringBuilder number1 = new StringBuilder("8644-GTv-6764-gFF-5T6y");
    Document.replaceLettersToStars(number1);

    StringBuilder number2 = new StringBuilder("8644-GTv-6764-gFF-5T6y");
    Document.onlyLettersLowRegister(number2);

    StringBuilder number3 = new StringBuilder("8644-GTv-6764-gFF-5T6y");
    Document.onlyLettersUpperRegister(number3);

    String number4 = "8644-GTv-6764-gFF-5T6y";
    Document.checkIfStartsWithAbc(number4);
    Document.checkIfStartsWith555(number4);
    Document.checkIfEndsWith1a2b(number4);
    }
}
