public class Java_Subarray {
    public static void subarray(int number[])
    {
        for(int i=0;i<number.length;i++)
        {
            for(int j=i;j<number.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void max_sum_subarray_brute(int number[])
    {
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<=number.length;i++) //loop for start of sub array
        {
            for(int j=i;j<number.length;j++)//loop for end of sub array     //here time complexity required is O(n^3)
            {
                int current_sum = 0;
                for(int k=i;k<=j;k++)//loop for increment start using ith value and end at jth value and also claculate current sum array sum.
                {
                    current_sum += number[k];                    
                }
                System.out.println("Current sum array sum is: "+current_sum);
                if(max_sum<current_sum)
                {
                    max_sum = current_sum;
                }
            }
        }
        System.out.println("maximum sum is : "+max_sum);
    }

    public static void prefix_max_sum_subarray(int number[])
    {
        int max = Integer.MIN_VALUE;
        int current_sum = 0;
        int prefix[] = new int[number.length]; //here we create prefix array which size is same as number array;
        prefix[0] = number[0]; //prefix array 0th element is same as number 0th element
        //create prefix array 
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i] = prefix[i-1]+number[i];     //here we add prefix array last element and our number array ith element means current element
        } 
        System.out.println("prefix Subarray is ");
        for(int i=0;i<prefix.length;i++)
        {
            System.out.print(prefix[i]+" ");
        }
        for(int i=0;i<number.length;i++) //time complexity required is O(n^2)
        {
            for(int j=i;j<number.length;j++)
            {
                current_sum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(max<current_sum)
                {
                    max=current_sum;
                }
            }
        }
        System.out.println("\nMaximum Sum of Subarray is : "+max);
    }
    
    public static void kadanes_max_sum_subarray(int number[])
    {
        int max = Integer.MIN_VALUE;
        int current_sum = 0;
        for(int i=0;i<number.length;i++)
        {
            current_sum = current_sum + number[i];
            if(current_sum<0)
            {
                current_sum=0;
            }
            if(max<current_sum)
            {
                max=current_sum;
            }
        }
        System.out.println("Maximum sum of subarray is : "+max);
    }

    public static void main(String args[])
    {
        int number[]={1,-2,6,-1,3};
        //subarray(number);
       //max_sum_subarray_brute(number);
       //prefix_max_sum_subarray(number);
       kadanes_max_sum_subarray(number);
    }
}
