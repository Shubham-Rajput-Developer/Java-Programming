import java.util.*;
public class Shallow_Deep {
    public static void main(String args[])
    {
        Student obj1 = new Student();
        obj1.name = "Shubham";
        obj1.roll = 78;
        obj1.Marks[0] = 10;
        obj1.Marks[1] = 20;
        obj1.Marks[2] = 30;
        
        Student obj2 = new Student(obj1);
    
        obj1.Marks[1] = 90;

        System.out.println(obj2.name);
        System.out.println(obj2.roll);
        for(int i=0;i<3;i++)
        {
            System.out.println(obj2.Marks[i]);
        }
    }
}

class Student 
{
    int roll;
    String name;
    int Marks[];
    Student()
    {
        Marks = new int[3];
    }
    // Student(Student s1)
    // {
    //     Marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.Marks = s1.Marks; // it is Shallow Copy  Data was reflected
    // }

    Student(Student s2)
    {
        Marks = new int[3];
        this.name = s2.name;
        this.roll = s2.roll;
        for(int i=0;i<Marks.length;i++)
        {
            this.Marks[i] = s2.Marks[i]; // Deep Copy Data Was not Reflected
        }
    }
    
}