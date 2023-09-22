package Lecture5;

public class CreditCard {

    String cardHolderName;
    String cardNumber;
    int balance;

    CreditCard (String cardHolderName, String cardNumber, int balance) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    int deposit(int topUp) {
        if (topUp > 0) {
            int result;
            result = topUp + balance;
            return result;
        }
        else {
            System.out.println("Deposit of " + topUp + " to the balance is not possible.");
            return topUp;
        }
    }
    int withdrawal(int subtraction){
        if (subtraction > 0 && subtraction <= balance){
            int result;
         result = balance - subtraction;
         return result;
        }
        else {
            System.out.println("Withdrawal of " + subtraction + " is not possible as your current balance has insufficient funds.");
            return subtraction;
        }
    }
    void displayInfo(){
        System.out.println("The cardholder name: " + cardHolderName);
        System.out.println("The cards digits: " + cardNumber);
        System.out.println("The current balance: " + balance);
    }
}