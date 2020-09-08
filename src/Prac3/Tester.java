package Prac3;

public class Tester {

    public static void main(String[] args) {

        Shape s1 = new Circle("RED", false, 5.5); // Upcast Circle to Shape
        System.out.println(s1); // метод класса Circle
        System.out.println(s1.getArea()); // метод класса Circle
        System.out.println(s1.getPerimeter()); // метод класса Circle
        System.out.println(s1.getColor()); //метод класса Shape
        System.out.println(s1.isFilled()); // метод класса Shape
        //System.out.println(s1.getRadius()); // данного метода нет в классе Shape

        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1); // метод класса Circle
        System.out.println(c1.getArea()); // мтеод класса Circle
        System.out.println(c1.getPerimeter()); // метод класса Circle
        System.out.println(c1.getColor()); // метод класса Shape
        System.out.println(c1.isFilled()); // метод класса Shape
        System.out.println(c1.getRadius()); // метод класса Circle

        //Shape s2 = new Shape(); // нельзя создать экземпляр абстроктого класса Shape

        Shape s3 = new Rectangle("RED", false, 1.0, 2.0); // Upcast
        System.out.println(s3); // метод класса Rectangle
        System.out.println(s3.getArea()); // метод класса Rectangle
        System.out.println(s3.getPerimeter()); // метод класса Rectangle
        System.out.println(s3.getColor()); // метод класса Shape
        //System.out.println(s3.getLength()); // данного метода нет в классе Shape

        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1); // будет вызван метод из класса Rectangle
        System.out.println(r1.getArea()); // будет вызван метод из класса Rectangle
        System.out.println(r1.getColor()); // будет вызван метод из класса Shape
        System.out.println(r1.getLength()); // будет вызван метод из класса Rectangle

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4); // метод класса Square
        System.out.println(s4.getArea()); // метод класса Rectangle
        System.out.println(s4.getColor()); // метод класса Shape
        //System.out.println(s4.getSide()); // данного метода нет в классе Shape

        Rectangle r2 = (Rectangle) s4; // Take note that we downcast Shape s4 to Rectangle,
                                        // which is a superclass of Square, instead of Square
        System.out.println(r2); // метод класса Square
        System.out.println(r2.getArea()); // метод класса Rectangle
        System.out.println(r2.getColor()); // метод класса Shape
        //System.out.println(r2.getSide()); // данного метода нет в классе Rectangle
        System.out.println(r2.getLength()); // метод класса Rectangle

        Square sq1 = (Square) r2; // Downcast Rectangle r2 to Square
        System.out.println(sq1); // метод класса Square
        System.out.println(sq1.getArea()); // метод класса Rectangle
        System.out.println(sq1.getColor()); //метод класса Shape
        System.out.println(sq1.getSide()); // метод класса Square
        System.out.println(sq1.getLength()); // метод класса Rectangle
    }

}