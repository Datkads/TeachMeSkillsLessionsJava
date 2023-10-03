package Lecture7.Task1;

public class Test {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+994 221 123 324","YotaPhone", 100);
        Phone phone2 = new Phone("+995 322 310 505", "iPhone");
        Phone phone3 = new Phone();

        phone1.displayInfo();

        System.out.println();
        phone2.receiveCall("Vasya Pupkin");
        System.out.println(phone2.getNumber());

        System.out.println();
        phone3.receiveCall("Pasya Vupkin", "+995 526 123 212");
        phone3.sendMessage("+213 241 123 244", "+231 865 421 243");

    }
}
