package ClassAndObject;


class Student1{
    int rollNo;
    String name;
    String course;
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
    public String details()
    {
        return "RollNumber: "+rollNo+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n"+"Total: "+
                total()+"\n"+"Grade: "+grade();
    }
}
public class Student {

    
    public static void main(String[] args) {
        
        Student1 s = new Student1();
        s.rollNo = 1003;
        s.name = "John";
        s.course = "Computer Science and Engineering";
        s.mark1 = 78;
        s.mark2 = 54;
        s. mark3 = 87;
        System.out.println(s.details());
        
    }
    
}