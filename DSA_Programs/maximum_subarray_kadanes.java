import java.util.*;
public class maximum_subarray_kadanes{
    

    public static void kadanes(int numbers[]){
        int max=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<numbers.length;i++){
            currSum=currSum+numbers[i];
           
            max=Math.max(max,currSum);
             if(currSum<0){
                currSum=0;
            }

        }
        System.out.println(max);

    }
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);

    }
}