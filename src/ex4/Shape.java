package ex4;

public abstract class Shape {
private String color;

// constructor


    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void getArea();


    public void display(){
        System.out.println("Color: " + color);
    }
}
