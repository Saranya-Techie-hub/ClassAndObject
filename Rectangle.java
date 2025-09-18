package ClassAndObject;

class Rectangle1{
    public double length;
    public double breadth;
    
    public double area()
    {
        return length * breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        return length == breadth;
    }
}

public class Rectangle {

    public static void main(String[] args) {
        Rectangle1 rect1 = new Rectangle1();
        Rectangle1 rect2 = new Rectangle1();
        rect1.length = 8.97;
        rect1.breadth = 5.24;
        rect2.length = 6.6;
        rect2.breadth =6.6;
        System.out.println("Area: "+rect1.area());
        System.out.println("Perimeter: "+rect1.perimeter());
        System.out.println("Is it a Square? "+rect1.isSquare());
        System.out.println("Area: "+rect2.area());
        System.out.println("Perimeter: "+rect2.perimeter());
        System.out.println("Is it a Square? "+rect2.isSquare());
    }
    
}