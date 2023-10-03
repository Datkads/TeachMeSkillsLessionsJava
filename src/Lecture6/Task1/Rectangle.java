package Lecture6.Task1;

public class Rectangle extends Figure {
    int height;
    int width;

    Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}
