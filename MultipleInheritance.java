import java.util.*;
public class MultipleInheritance {
    public static void main(String args[])
    {
        Bear obj = new Bear();
        obj.eat();

    }
}

interface Carnivores
{
    void eat();
}
interface Harbivores
{
    void eat();
}
class Bear implements Carnivores,Harbivores
{
    public void eat()
    {
        System.out.println("Its eat Grass and Meat");
    }
}