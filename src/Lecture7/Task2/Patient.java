package Lecture7.Task2;

public class Patient {
    String name;
    int age;
    Patient(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.println("The patient is " + name + ", " + age + " years of age. ");
    }
}
