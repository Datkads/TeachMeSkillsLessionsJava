package Lecture6.Task1;

public class Circle extends Figure{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
