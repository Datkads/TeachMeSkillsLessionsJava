package Lecture7.Task2;

public class Surgeon implements Medicine{
    @Override
    public void treat() {
        System.out.println("The treatment is done by Surgeon");
    }
}
