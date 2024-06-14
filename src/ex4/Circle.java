package ex4;

public class Circle extends Shape {

    private double radius = 2;


    @Override
    public void getArea() {
        System.out.println("Circle Area : " + Math.PI * radius * radius);
    };
}
