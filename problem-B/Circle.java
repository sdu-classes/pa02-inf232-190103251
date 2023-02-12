class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    } 

    public String toString(){
        return String.format("Circle[%s,radius=%f]", super.toString(),radius);
    }

}
