package Lecture5;

public class ATM {
    int atmBalance;
    int banknote20;
    int banknote50;
    int banknote100;
    ATM(){
    }
    ATM (int banknote20, int banknote50, int banknote100){
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }
    public void setAtmBalance(int atmBalance){
        this.atmBalance = atmBalance;
    }
   public int getAtmBalance(){
        return atmBalance;
   }
   public int deposit(int amount){
        if(amount > 0){
           return atmBalance + amount;
        }
        else {
            System.out.println("Deposit of this amount is not possible.");
            return amount;
        }
    }
    public boolean withdrawal (int amount) {
        boolean withdrawalSuccession = false;
        if (amount > 0 && amount <= atmBalance){
            if (amount % 100 == 0) {
                int banknotes = amount / 100;
                withdrawalSuccession = true;
                System.out.println("The withdrawal of " + amount + " is successful. The amount will be withdrawn with " + banknotes + " banknotes of 100$");
                return withdrawalSuccession;
            } else if (amount % 50 == 0) {
                int banknotes = amount / 50;
                withdrawalSuccession = true;
                System.out.println("The withdrawal of " + amount + " is successful. The amount will be withdrawn with " + banknotes + " banknotes of 50$");
                return withdrawalSuccession;
            } else if (amount % 20 == 0) {
                int banknotes = amount / 20;
                withdrawalSuccession = true;
                System.out.println("The withdrawal of " + amount + " is successful. The amount will be withdrawn with " + banknotes + " banknotes of 20$");
                return withdrawalSuccession;
            }
            System.out.println("The withdrawal of " + amount + " can't  be successful.");
            return withdrawalSuccession;
        }
        System.out.println("The withdrawal is not accepted. There's no such amount.");
        return withdrawalSuccession;
    }
}
