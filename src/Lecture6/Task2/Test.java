package Lecture6.Task2;

public class Test {
    public static void main(String[] args) {
        Director director1 = new Director("Elon", 56, "CEO");
        Employee employee1 = new Employee("Thomas", 25, "Courier");
        Accountant accountant1 = new Accountant("Jenny", 40, "Head of the Accountant Team");

        director1.positionInfo();
        employee1.positionInfo();
        accountant1.positionInfo();
    }
}
