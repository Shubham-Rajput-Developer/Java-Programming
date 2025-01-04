import java.util.Scanner;
public class MultiDimeArray {
    public static boolean Check_Key(int matrix[][],int key)
    {
        for(int i=0;i<matrix.length;i++)
        {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==key)
            {
                return true;
            }
        }
        }
        return false;

    }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int Matrics[][] = new int[3][3];
    int row = Matrics.length;
    int column = Matrics[0].length;
    System.out.println("Enter Array Element : ");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            Matrics[i][j] = sc.nextInt();
        }
    }
    System.out.println("\nArray Element is : ");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            System.out.print(Matrics[i][j]+" ");
        }
        System.out.println();
    }
    System.out.print("Enter key to Serached : ");
    int key = sc.nextInt();
    if(Check_Key(Matrics,key))
    {
        System.out.println("Key Element is Found ");
    }  
    else
    {
        System.out.println("Key Element not Found!!!");
    }
    int Largest = Integer.MIN_VALUE;
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            if(Matrics[i][j]>Largest)
            {
                Largest = Matrics[i][j];
            }
        }
    }
    System.out.println("Largest Element is : "+Largest);
    
    int Smallest = Integer.MAX_VALUE;
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            if(Matrics[i][j]<Smallest)
            {
                Smallest = Matrics[i][j];
            }
        }
    }
    System.out.println("Smallest Element is : "+Smallest);
}
}
