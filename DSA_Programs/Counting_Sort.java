import java.util.*;
public class Counting_Sort {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int len=arr.length;
        int largest=Integer.MIN_VALUE; //this is the size of the frequency
        for(int i=0;i<len;i++){
            largest=Math.max(largest,arr[i]);

        }
        int freq[]=new int[largest+1];  //because of 0 indexing  largest+1 is there
        for(int i=0;i<len;i++){
            freq[arr[i]]++;
        }

        //counting sort

        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                arr[j]=i;
                j++;
                freq[i]--;

            }

        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
       


        

    }
    
}
