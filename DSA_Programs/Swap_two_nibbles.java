import java.util.*;
public class Swap_two_nibbles {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int left=(n&15)<<4;//ye (n&15) jo he last four digit nikalega and <<4  usse left me lene keliye
        int right=(n&240)>>4;//ye (n&240) first four digit nikalega and >>4  usse right me dalega
        int result=left|right;
        System.out.println(result);


    }
    
}
