package Lecture5;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        ATM atm1 = new ATM();
        atm1.setAtmBalance(5000);
        System.out.println("The current ATM balance is: " + atm1.getAtmBalance());
        int newBalance = atm1.deposit(1000);
        System.out.println("The deposit is successful your new balance is: " + newBalance);

        System.out.println();

        int amount;
        ATM atm2 = new ATM(200, 200, 200);
        atm2.setAtmBalance(9300);
        System.out.println("The current ATM balance is: " + atm2.getAtmBalance());
        System.out.println("Please note the ATM gives only 20$, 50$ and 100$ banknotes.");
        System.out.print("Please enter the amount to withdraw: ");
        System.out.println();
        amount = txt.nextInt();
        atm2.withdrawal(amount);
    }
}
