import java.util.*;
public class Natural_Sort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[4];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }

        Arrays.sort(arr,(a,b)->{
            int n1=Integer.parseInt(a.replaceAll("[^0-9]",""));
            int n2=Integer.parseInt(b.replaceAll("[^0-9]",""));
            return Integer.compare(n1,n2);
        });

        for(String s:arr){
            System.out.print("Sorted:",s);
        }
    }
}