import java.util.*;
import java.util.LinkedList;
public class Interleaving_2_halves_of_queue {
    public static void InterLeave(int arr[]){
        int len=arr.length;
        int size=len/2;
        Queue<Integer> original=new LinkedList<>();
        Queue<Integer> first=new LinkedList<>();
        for(int i=0;i<len;i++){
            original.add(arr[i]);
        }
        //now adding first half of elements
        for(int i=0;i<size;i++){
            first.add(original.remove());
        }
        while(!first.isEmpty()){//first wala queue empty nahi he
            original.add(first.remove());
            original.add(original.remove());

        }
        
        while(!original.isEmpty()){
            System.out.print(original.remove()+" ");
        }



    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        InterLeave(arr);

    }
    
}
