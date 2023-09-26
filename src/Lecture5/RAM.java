package Lecture5;

class RAM {
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