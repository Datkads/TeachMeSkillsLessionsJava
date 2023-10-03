package Lecture7.Task2;

public class Test {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Jerry", 35);
        TreatmentPlan plan1 = new TreatmentPlan();
        patient1.displayInfo();
        plan1.treatment(1);
    }
}
