import java.util.*;
public class left_right_sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int rightSum=0;
        int leftSum=0;
        for(int i=0;i<n;i++){
            rightSum=rightSum+arr[i];
        }
        for(int i=0;i<n;i++){
            rightSum=rightSum-arr[i];
            if(leftSum==rightSum){
                System.out.println(rightSum+arr[i]);//question is to add the current element also 
            }
            leftSum+=arr[i];
        }
    }

    
}
