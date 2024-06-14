package ex2;

import ex2.*;
import ex1.Circle;
import ex1.Rectangle;
import ex1.Shape;
import ex1.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new ex2.Shape;
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3,4);
        shapes[2] = new Square(6);

        for ( int i = 0; i < shapes.length; i++ ) {
            if ( shapes[i] instanceof Circle || shapes[i] instanceof Rectangle || shapes[i] instanceof Square) {
                System.out.println("hinh" +(i+1));
                if (shapes[i] instanceof Colorable) {
                    ((Colorable) shapes[i]).howToColor();
                }
                System.out.println(shapes[i].getArea());
            }
        }
    }
}
