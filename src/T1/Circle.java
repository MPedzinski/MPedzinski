package T1;

public class Circle implements Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = (radius*2)*3.1415;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area;
        area = (radius*radius)*3.1415;
        return area;
    }

    @Override
    public String getType() {
        String Type = "Circle";
        return Type;
    }
}
