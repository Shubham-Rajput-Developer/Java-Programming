import java.util.*;
public class StaticKeyword {
    public static void main(String args[])
    {
        Student obj1 = new Student();
        obj1.Schoolname = "PES Modern";
        System.out.println(obj1.Schoolname);
        obj1.Settter("Shubham");
        obj1.Getter();

        Student obj2 = new Student();
        obj2.Schoolname = "MIT";
        System.out.println(obj2.Schoolname);
        obj2.Settter("Chetan");
        obj2.Getter();
    }
}
class Student
{
    String name;
    static String Schoolname;
    void Settter(String name)
    {
        this.name = name;
    }
    void Getter()
    {
        System.out.println("Name is : "+name);
    }

    
}