package ex4;

public class Rectangle extends Shape {
    private double width =3 ,height = 4;


    @Override
    public void getArea() {
        System.out.println("Area of Rectangle" + width*height);
    }
}
