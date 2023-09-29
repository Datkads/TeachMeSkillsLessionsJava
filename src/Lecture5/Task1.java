package Lecture5;
public class Task1 {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("Bogdan Bogdanov", "1234 5678 9087 1234", 50);
        CreditCard card2 = new CreditCard("Petr Petrov", "8576 2934 1496 3848", 0);
        CreditCard card3 = new CreditCard("Ivan Ivanov", "5837 0584 0348 2374", 1000);

        card1.displayInfo();
        System.out.println();
        card2.displayInfo();
        System.out.println();
        card3.displayInfo();
        System.out.println();

        int balance1 = card1.deposit(50);
        System.out.println("The card balance of " + card1.cardHolderName + " is: " + balance1);
        int balance2 = card2.deposit(500);
        System.out.println("The card balance of " + card2.cardHolderName + " is: " + balance2);
        int balance3 = card3.withdrawal(999);
        System.out.println("The card balance of " + card3.cardHolderName + " is: " + balance3);
    }
}