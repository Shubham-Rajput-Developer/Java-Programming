import java.util.*;
public class CopyConstructor {
    public static void main(String args[])
    {
        Student obj1 = new Student();
        obj1.roll = 89;
        obj1.name = "Shubham";
        obj1.Password = "Shubham@500";
        Student obj2 = new  Student(obj1);
        System.out.println(obj2.name);
        System.out.println(obj2.roll);

    }
}
class Student
{
    int roll;
    String name;
    String Password;

    Student(Student s1)
    {
        this.name = s1.name;
        this.roll = s1.roll;
    }
    Student()
    {

    }
}