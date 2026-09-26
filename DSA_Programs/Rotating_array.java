import java.util.*;
public class Rotating_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int rotation=sc.nextInt();
        rotation=rotation%n;

        for(int i=0;i<rotation;i++){//jitni baar roatate karne ko bola he utni bbaar karo
            int first=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;


        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }

    }
    
}
