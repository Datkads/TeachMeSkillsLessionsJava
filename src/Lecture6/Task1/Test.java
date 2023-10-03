package Lecture6.Task1;

public class Test {
    public static void main(String[] args) {
        //Что бы IDEA не ругалась пришлось дописать логику для применения второго метода из абстрактного класса.
        Rectangle rectangle1 = new Rectangle(0, 0);
        System.out.println(rectangle1.calculateArea());

        System.out.println();

        //Выполнение задачки.
        Figure[] array = new Figure[5];
        array[0] = new Triangle(4, 6, 9);
        array[1] = new Rectangle(5, 10);
        array[2] = new Circle(4);
        array[3] = new Triangle(7, 3, 5);
        array[4] = new Rectangle(3, 6);

        double sumOfPerimeters = 0;

        for (Figure figure : array) {
            sumOfPerimeters += figure.calculatePerimeter();
        }
        System.out.println("The sum of all figure perimeters is " + sumOfPerimeters);
    }
}
