package Lecture5;

public class Computer {
    int price;
    String modelName;
    int ram;
    RAM ram1 = new RAM("Logitech", 8);
    int hdd;
    HDD hdd1 = new HDD("SuperSonic", 512, "inside");
    Computer(int price, String modelName){
        this.price = price;
        this.modelName = modelName;
    }
    Computer(int price, String modelName, int ram, int hdd){
        this.price = price;
        this.modelName = modelName;
        this.ram = ram;
        this.hdd = hdd;
    }
    void displayInfoComputer1(){
        System.out.println("The computer " + modelName + " is selling with the price of " + price + "$.");
        ram1.displayInfoRam();
        hdd1.displayInfoHdd();
    }
    void displayInfoComputer2(){
        System.out.println("The computer " + modelName + " is selling with the price of " + price + "$.");
        System.out.println("The RAM has storage of " + ram + "GB.");
        System.out.println("The HDD has storage of " + hdd + "GB and it is the outside type.");

    }
}