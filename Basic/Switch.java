package Basic;
import java.util.*;
public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice : ");
        int choice = sc.nextInt();

        // switch(choice){
        //     case 1:
        //         System.out.println("Samosa");
        //         break;
        //     case 2:
        //         System.out.println("Burgur");
        //         break;
        //     case 3:
        //         System.out.println("Chocolate");
        //         break;
        //     default:
        //         System.out.println("Oder cancel");
        // }

        switch (choice) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("wrong choice");
                break;
        }
        sc.close();
    }
}
