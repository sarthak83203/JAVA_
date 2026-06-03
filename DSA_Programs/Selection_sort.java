import java.util.*;
public class Selection_sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int len=arr.length;
        //now Selection sort
        //In this sort smaller element is move towards front
        //In this sorting we have check the minimum element.
        for(int i=0;i<len-1;i++){
            int minPos=i;
            for(int j=i+1;j<len;j++){ //in this we have to take from unsorted array
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }

            }
            int temp=arr[minPos]; //remember to put arr[minPos] in the temp
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
