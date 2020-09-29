package HinhHoc;

public class Main {
    public static void main(String[] args) {
        var circle = new Circle(5);
        var circle1 = new Circle(10);
        GeometricObject color1 = new Square();

//        var rectangle = new Rectangle(10,20);

        System.out.println(circle.getArea());
        System.out.println(circle1.getArea());
//        System.out.println(rectangle.getArea());

//        int max = circle.compareTo(rectangle);
//        System.out.println(max);

        int max1 = circle1.compareTo(circle);
        System.out.println(max1);
        color1.howToColor();

    }
}
