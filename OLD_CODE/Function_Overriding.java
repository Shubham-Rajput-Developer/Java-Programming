import java.util.*;
public class Function_Overriding {
    public static void main(String args[])
    {
        Deer obj = new Deer();
        obj.Eat();
    }
}
class Animal
{
    public static void Eat()
    {
        System.out.println("All Animal eat");
    }
}
class Deer extends Animal
{
    public static void Eat()
    {
        System.out.println("Dear eat only grass");
    }
} 