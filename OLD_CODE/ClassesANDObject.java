import java.util.*;
public class ClassesANDObject {
    public static void main(String args[])
    {
        Pen obj = new Pen();
        obj.setColor("red");
        obj.setTip(5);
        System.out.println(obj.getColor());
        System.out.println(obj.getTip());
    }
}
class Pen
{
    String color;
    int Tip;
    String getColor()
    {
        return this.color;
    }
    int getTip() {
        return Tip;
    }
    void setColor(String color)
    {
        this.color = color;
    }
    void setTip(int Tip)
    {
        this.Tip = Tip;
    }
}