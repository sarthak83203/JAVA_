import java.util.*;
public class Search_in_soretd {
    public static boolean StairCase(int arr[][],int key){
        int row=0;
        int cols=arr[0].length-1;
        while(row<arr.length && cols>=0){
            if(arr[row][cols]==key){
                System.out.print("( "+row+" ,"+cols+" )");
                return true;
            }
            else if(arr[row][cols]<key){
                row++;
            }else{
                cols--;
            }

        }
        return false;


    }
    public static void main(String args[]){
        int arr[][]={{10,20,30,40}, //considring as 40 as starting value it means as initial value
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};
        int key=33;
        StairCase(arr, key);
    }
    
}
