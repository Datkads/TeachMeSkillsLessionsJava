package Lecture7.Task2;

public class Therapist implements Medicine{
    @Override
    public void treat() {
        System.out.println("The treatment is done by Therapist");
    }
}
