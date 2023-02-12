public class MainB{
    public static void main(String[] args) {
       Shape shape = new Shape();
       Shape shape2 = new Shape("black",false);
       System.out.println(shape);
       System.out.println(shape2);

       Circle circle = new Circle();
       Circle circle2 = new Circle(2.5);
       Circle circle3 = new Circle(3.17,"yellow",false);
       System.out.println(circle);
       System.out.println(circle2);
       System.out.println(circle3);
       System.out.println(circle3.getArea());
       System.out.println(circle3.getPerimeter());
       System.out.println(circle3.getColor());
       System.out.println(circle3.isFilled());
       System.out.println(circle3.getRadius());

       Rectangle rectangle = new Rectangle(3.8, 2.5, "green", false);
       System.out.println(rectangle);
       System.out.println(rectangle.getArea());
       System.out.println(rectangle.getPerimeter());
       System.out.println(rectangle.getColor());
       System.out.println(rectangle.getLength());

       Square square = new Square(6.6);
       System.out.println(square);
       System.out.println(square.getArea());
       System.out.println(square.getColor());
       System.out.println(square.getSide());

    }
}


