import jav.util.*;
public class Inheritance {
    public static void main(String args[])
    {
        //This object Creation for Multi level inheritance
        CheifMinister obj = new CheifMinister();
        obj.PresidentName();
        obj.President_Athourity();
        obj.PrimeMinister_Name();
        obj.PrimeMinister_Athourity();
        obj.CheifMinister_Name();
        obj.CheifMinister_Athourity();

        //This object Creation for Hierarchical inheritance
        Computer c1 = new Computer();
        c1.Computer_Placement();
        Electrical c2 = new Electrical();
        c2.Electrical_Placement();
        Mechanical c3 = new Mechanical();
        c3.Mechanical_Placement();
    }
}

//Multi level Inheritance Example
class President
{
    void PresidentName()
    {
        System.out.println("Drauoati Murmur..");
    }
    void President_Athourity()
    {
        System.out.println("She control Indian Defence");
    }
}

class PrimeMinister extends President
{
    void PrimeMinister_Name()
    {
        System.out.println("Narendra Modi");
    }
    void PrimeMinister_Athourity()
    {
        System.out.println("He control over all India");
    }
}

class CheifMinister extends PrimeMinister
{
    void CheifMinister_Name()
    {
        System.out.println("Eknath Shinde");
    }
    void CheifMinister_Athourity()
    {
        System.out.println("He control One State");
    }
}

//Hierarchical Inheritance
class College
{
    String Computer_Branch = "90%";
    String Electrical_Branch = "60%";
    String Mechanical_Branch = "30%";
    void Placement()
    {
        System.out.println("Whole College Placement Rate is 80%");
    }
}

class Computer extends College
{
    void Computer_Placement()
    {
        System.out.println("Placement Rate in Computer : "+Computer_Branch);
    }
}

class Electrical extends College
{
    void Electrical_Placement()
    {
        System.out.println("Placement Rate in Electrical : "+Electrical_Branch);
    }
}

class Mechanical extends College
{
    void Mechanical_Placement()
    {
        System.out.println("Placement Rate in Mechanical : "+Mechanical_Branch);
    }
}