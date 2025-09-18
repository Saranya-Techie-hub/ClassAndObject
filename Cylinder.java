package ClassAndObject;

class Cylinder1{
    public double height;
    public double radius;
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea()
    {
        return 2*lidArea() +circumference()*height;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}

public class Cylinder {

    public static void main(String[] args) {
        Cylinder1 c = new Cylinder1();
        c.radius = 7;
        c.height = 10;
        System.out.println("Lid Area "+c.lidArea());
        System.out.println("Circumference "+c.circumference());
        System.out.println("Total Surface Area "+c.totalSurfaceArea());
        System.out.println("Volume "+c.volume());
    }
    
}