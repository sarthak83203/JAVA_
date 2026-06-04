import java.util.*;
public class Insertion_Sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int len=arr.length;
        for(int i=1;i<len;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding position
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;

        }


        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
