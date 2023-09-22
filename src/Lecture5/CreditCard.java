package Lecture5;

public class CreditCard {

    String cardHolderName;
    int cardNumber;
    int currentBalance;

    int balanceTopUp (int topUp) {
        if (topUp > 0) {
            return topUp + currentBalance;
        }
        return topUp;
    }
    int balanceSubtraction (int subtraction){
        if (subtraction > 0 && subtraction <= currentBalance){
         return currentBalance - subtraction;
        }
        else {
            System.out.println("Subtraction of " + subtraction + " isn't possible as your current balance has insufficient funds.");
        }
        return subtraction;
    }
    void displayInfo(){
        System.out.println("The cardholder name: " + cardHolderName);
        System.out.println("The cards digits: " + cardNumber);
        System.out.println("The current balance: " + currentBalance);
    }
}