package Lecture6.Task2;

public class Director extends Person implements Information {
    String position;

    Director(String name, int age, String position){
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public void positionInfo() {
        System.out.println(this.name + " is the " + this.position + " in the SpaceX.");
    }
}
