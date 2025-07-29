import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulArrayList {
    // public static ArrayList<Integer> makeBeautiful(int num){

    //     ArrayList<Integer> ans = new ArrayList<>();
    //     ans.add(1);
    //     while(ans.size()<num){
    //         ArrayList<Integer> temp = new ArrayList<>();

    //         //for odd numbers
    //         for(int i=0;i<ans.size();i++){
    //             if(ans.get(i)*2-1<=num){
    //                 temp.add(ans.get(i)*2-1);
    //             }
    //         }

    //         //for even numbers
    //         for(int i=0;i<ans.size();i++){
    //             if(ans.get(i)*2<=num){
    //                 temp.add(ans.get(i)*2);
    //             }
    //         }
    //         ans = temp;
    //     }
    //     return ans;
    // }

    public static ArrayList<Integer> optimized(int n){
        ArrayList<Integer> res = new ArrayList<>();
        divideConque(1,1,res,n);
        return res;
    }
    public static void divideConque(int start, int inc, ArrayList<Integer> res,int n){
        if(start+inc>n){
            res.add(start);
            return;
        }
        divideConque(start, 2*inc, res, n);
        divideConque(start+inc, 2*inc, res, n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int num = sc.nextInt();
        System.out.println(optimized(num));
        sc.close();
    }
}
