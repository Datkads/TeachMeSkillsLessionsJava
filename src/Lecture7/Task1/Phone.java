package Lecture7.Task1;

import java.util.Arrays;

public class Phone {
    String number;
    String model;
    int weight;

    Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(){
    }

    public void receiveCall(String callerName){
        System.out.println("Call from " + callerName);
    }
    public void receiveCall(String number, String callerName){
        System.out.println("Call from " + callerName + " " + number);
    }
    public String getNumber(){
        return number;
    }
    public void sendMessage(String... phoneNumbers){
        System.out.println("Send messages to " + Arrays.toString(phoneNumbers));
    }
    void displayInfo(){
        System.out.println(model + ", weights " + weight + " ton," + number);
    }
}
