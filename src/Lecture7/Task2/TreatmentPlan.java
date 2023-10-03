package Lecture7.Task2;

public class TreatmentPlan {
   private Dentist dentist1 = new Dentist();
   private Surgeon surgeon1 = new Surgeon();
   private Therapist therapist1 = new Therapist();

    public void treatment(int codeForDoctor){
        if(codeForDoctor == 1){
            surgeon1.treat();
        }
        else if (codeForDoctor == 2){
            dentist1.treat();
        }
        else {
            therapist1.treat();
        }
    }
}
