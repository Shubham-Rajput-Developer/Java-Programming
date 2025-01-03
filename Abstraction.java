import java.util.*;
public class Abstraction {
    public static void main(String args[])
    {

        Engineering obj = new Engineering();
        obj.Study();
        obj.Syllabus();
        System.out.println(obj.year);
        obj.ChangeYear();

        Medical obj2 = new Medical();
        obj.Study();
        obj2.Syllabus();
        System.out.println(obj2.year);
        obj2.ChangeYear();
    }
}
//Abstract Claass
abstract class Education
{
    int year;
    Education()
    {
        year = 0;
    }
    void Study()
    {
        System.out.println("Study is Compalsary");
    }
    //Abstract Method
    abstract void Syllabus();
}
class Engineering extends Education
{
    //Change Value of year that create in constructor
    void ChangeYear()
    {
        year = 4;
        System.out.println(year);
    }
    //Abstract method Defination
    void Syllabus()
    {
        System.out.println("Technical Syllabus");
    }
}
class Medical extends Education
{
    void ChangeYear()
    {
        year = 5;
        System.out.println(year);
    }
    void Syllabus()
    {
        System.out.println("Medical Syllabus");
    }
}