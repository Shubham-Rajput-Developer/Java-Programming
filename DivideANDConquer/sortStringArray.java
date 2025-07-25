public class sortStringArray {

    public static String[] mergeSort(String arr[],int si,int ei){
        if(si==ei){
            String A[] = {arr[si]};
            return A;
        }

        int mid = si+(ei-si)/2;
        String arr1[] = mergeSort(arr, si, mid);
        String arr2[] = mergeSort(arr, mid+1, ei);
        String arr3[] = merge(arr1,arr2);
        return arr3;
    }
    public static String[] merge(String arr1[], String arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        String arr3[] = new String[m+n];
        int i=0;
        int j=0;
        int idx=0;
        
        while(i<m && j<n){
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
                arr3[idx] = arr1[i];
                idx++;
                i++;
            }
            else{
                arr3[idx] = arr2[j];
                idx++;
                j++;
            }
        }
        while(i<m){
            arr3[idx]=arr1[i];
            i++;
            idx++;
        }
        while(j<n){
            arr3[idx]=arr2[j];
            idx++;
            j++;
        }
        return arr3;
    }
    public static boolean isAlphabeticallySmaller(String str1,String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;
    } 

    public static void main(String[] args) {
        String arr[] = {"moon","sun","earth","mars","venus"};
        String newArr[] = mergeSort(arr,0,arr.length-1);
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
