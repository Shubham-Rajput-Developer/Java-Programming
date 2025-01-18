public class Pairs{
    public static void makePairs(int arr[]){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total pairs is : "+total);
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,1,3,4,2};
        makePairs(arr);

    }
}