package Lecture5;

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