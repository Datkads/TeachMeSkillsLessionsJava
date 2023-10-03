package Lecture7.Task2;

public class Dentist implements Medicine{
    @Override
    public void treat() {
        System.out.println("The treatment is done by Dentist");
    }
}
