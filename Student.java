package ClassAndObject;

class Student1{
    int rollNo;
    String name;
    int mark1, mark2, mark3;
    public int total()
    {
        return mark1+mark2+mark3;
    }
    public double average()
    {
        return (mark1+mark2+mark3)/3;
    }
    public char grade()
    {
        if(average() >= 60)
            return 'A';
        else
            return 'B';
    }
}
public class Student {

    
    public static void main(String[] args) {
        
        Student1 s = new Student1();
        s.rollNo = 1003;
        s.name = "John";
        s.mark1 = 78;
        s.mark2 = 54;
        s. mark3 = 87;
        System.out.println("Roll Number: "+s.rollNo);
        System.out.println("Name: "+s.name);
        System.out.println("Total: "+s.total());
        System.out.println("Grade: "+s.grade());
        
    }
    
}