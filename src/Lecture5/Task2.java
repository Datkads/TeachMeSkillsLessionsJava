package Lecture5;

public class Task2 {
    public static void main(String[] args) {

        Computer computer1 = new Computer(500, "ASUS");
        computer1.displayInfoComputer1();
        System.out.println();
        Computer computer2 = new Computer(1000, "HyperPC", 32,1024);
        computer2.displayInfoComputer2();
    }
}
