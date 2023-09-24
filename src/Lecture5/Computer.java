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
    class RAM{
        String ramName;
        int ramStorage;
        RAM(String ramName, int ramStorage){
            this.ramName = ramName;
            this.ramStorage = ramStorage;
        }
        void displayInfoRam(){
            System.out.println("The RAM " + ramName + " has storage of " + ramStorage + "GB.");
        }
    }
    class HDD{
        String hddName;
        int hddStorage;
        String hddType;
        HDD(String hddName, int hddStorage, String hddType) {
            this.hddName = hddName;
            this.hddStorage = hddStorage;
            this.hddType = hddType;
        }
        void displayInfoHdd(){
            System.out.println("The HDD " + hddName + " has storage of " + hddStorage + "GB and it is the " + hddType + " type.");
        }
    }